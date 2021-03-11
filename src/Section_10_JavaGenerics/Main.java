package Section_10_JavaGenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SoccerPlayer joe = new SoccerPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BasketballPlayer lebron = new BasketballPlayer("LeBron");

        Team tottenhamHotspur = new Team("Tottenham Hotspur");
        tottenhamHotspur.addPlayer(joe);
        tottenhamHotspur.addPlayer(pat);
        tottenhamHotspur.addPlayer(lebron);
        System.out.println(tottenhamHotspur.getNumMembers());
        // At a high level, although Joe should be the only valid player to add to the team (as he's a soccer player)
        // currently ANY player can join the team - this doesn't make sense.
        // To get around this, we can use Generics
        System.out.println("================================");

        Team<SoccerPlayer> juventus = new Team<>("Juventus");
        juventus.addPlayer(joe); // Valid
//        juventus.addPlayer(pat); // INVALID
//        juventus.addPlayer(lebron); // INVALID
        System.out.println(juventus.getNumMembers());
        System.out.println("================================");

        Team<BaseballPlayer> newYorkYankees = new Team<>("New York Yankees");
//        newYorkYankees.addPlayer(joe); // INVALID
        newYorkYankees.addPlayer(pat); // Valid
//        newYorkYankees.addPlayer(lebron); // INVALID
        System.out.println(newYorkYankees.getNumMembers());

        // On another note, we also want some sort of way to validate the type of class being used as the
        // generic for a given team
        // e.g., the following is valid at compilation time, but will throw an exception at runtime due to the
        // internal ugly casting to a Player that we were doing (CAST MIGHT BE ALREADY REMOVED FROM FINAL CODE)
//        Team<String> brokenTeam = new Team<>("This'll compile fine, BUT break at runtime");
//        brokenTeam.addPlayer("No one");
        // ERROR: Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class Section_10_JavaGenerics.Player (java.lang.String is in module java.base of loader 'bootstrap'; Section_10_JavaGenerics.Player is in unnamed module of loader 'app')

        // We need the ability to restrict the type that can be provided for the "T" Parameterised Type for the
        // Team class. Java provides a mechanism for restricting the types that can be used as type arguments.
        // These are called: Bounded Type Parameters. By using these, we can provide them with an upper bound.
        // We do this with the "extends" keyword

        // N.B. - Instead of a class, we could've implemented an Interface for the Type T
        // And we can also implement Typed Parameters in Interfaces, as well as Classes!
        // We can also specify multiple bounds (but then the usual rules of inheritance apply - (e.g. you can only
        // entexd 1 type, but many interfaces etc)

        Team<BasketballPlayer> laLakers = new Team<>("LA Lakers");
        laLakers.addPlayer(lebron);
        Team<BasketballPlayer> sanAntonioSpurs = new Team<>("San Antonio Spurs");

        laLakers.matchResult(sanAntonioSpurs, 98, 121);
//        laLakers.matchResult(juventus, 116, 2); // INVALID (which is what we want coz we don't want teams from different sports playing each other)
        System.out.println("============");

        System.out.println("Rankings");
        System.out.println(laLakers.getName() + ": " + laLakers.ranking());
        System.out.println(sanAntonioSpurs.getName() + ": " + sanAntonioSpurs.ranking());

        // This is all well and good, but we have no way to compare teams to see which would be the
        // highest in the league table.
        System.out.println(laLakers.compareTo(sanAntonioSpurs)); // -1 (coz LA Lakers has a lower ranking)
        System.out.println(sanAntonioSpurs.compareTo(laLakers)); // 1 (coz San Antonio has a higher ranking)
//        System.out.println(juventus.compareTo(sanAntonioSpurs)); // INVALID!!! (coz you can't compare teams from 2 different sports)
        System.out.println("======================");

        Team<SoccerPlayer> manchesterUnited = new Team<>("Manchester United");
        Team<SoccerPlayer> arsenal = new Team<>("Arsenal");
        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> burnley = new Team<>("Burnley");

        manchesterUnited.matchResult(liverpool, 1, 1);
        manchesterUnited.matchResult(arsenal, 2, 0);
        liverpool.matchResult(arsenal, 3, 1);
        burnley.matchResult(manchesterUnited, 1, 1);

        ArrayList<Team> premTeams = new ArrayList<>();
        premTeams.add(liverpool);
        premTeams.add(arsenal);
        premTeams.add(manchesterUnited);
        premTeams.add(burnley);
//        premTeams.add(laLakers); // SHOULD BE INVALID, BUT OURS DOESN'T CATCH THIS (this is a problem)

        // === My Attempt ===
        LeagueTable_MyAttempt<Team> premLeague = new LeagueTable_MyAttempt<Team>(premTeams);

        System.out.println(premLeague);
        System.out.println("=============");

        // === Solution ===
        // Notice the Syntax can be a bit confusing
        League_Solution<Team <SoccerPlayer> > premierLeague = new League_Solution<>("Prem");

        premierLeague.addTeam(liverpool);
        premierLeague.addTeam(arsenal);
        premierLeague.addTeam(manchesterUnited);
        premierLeague.addTeam(burnley);
//        premierLeague.addTeam(laLakers); // INVALID - what we wantm coz we only accept teams of Soccer players!

        premierLeague.showTable();
    }
}
