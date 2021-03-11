package Section_10_JavaGenerics;

import java.util.ArrayList;

// We need the ability to restrict the type that can be provided for the "T" Parameterised Type for the
// Team class. Java provides a mechanism for restricting the types that can be used as type arguments.
// These are called: Bounded Type Parameters. By using these, we can provide them with an upper bound.
// We do this with the "extends" keyword. Now "Player" is the "Upper Bound" of T, meaning that if we used
// a Subclass of Player, that is also fine
public class Team<T extends Player> implements Comparable<Team <T>> { // T = Parameterised Type = Ensure teams of the desired same type
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumMembers() {
        return members.size();
    }

    // Team has type T, so only Teams from the same sport can play each other
    public void matchResult(Team<T> opposingTeam, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if (opposingTeam != null) {
            // Also saves the results of the Opposing team as well
            opposingTeam.matchResult(null, theirScore, ourScore);
        }
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            // Because our T's upper bound is Player, no need to cast to Player here;
//            System.out.println( ((Player) player).getName() + " is already on the team"); // Before implementing Upper Bound (Warning Message: Casting 'player' to 'Player' is redundant )
            System.out.println(player.getName() + " is already on the team"); // After implementing Upper Bound
            return false;
        }
        members.add(player);
        // Because our T's upper bound is Player, no need to cast to Player here;
//        System.out.println( ((Player) player).getName() + " picked for the team: " + name); // Before implementing Upper Bound (Warning Message: Casting 'player' to 'Player' is redundant )
        System.out.println( (player).getName() + " picked for the team: " + name); // After implementing Upper Bound
        return true;
    }

    public int ranking() {
        return won*2 + tied;
    }

    @Override
    public int compareTo(Team<T> other) {
        if (ranking() > other.ranking()) {
            return 1;
        } else if (ranking() < other.ranking()) {
            return -1;
        } else {
            return 0;
        }
    }
}
