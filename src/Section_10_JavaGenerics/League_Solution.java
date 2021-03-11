package Section_10_JavaGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class League_Solution<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League_Solution(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println("Team already exists");
            return false;
        }
        league.add(team);
        return true;
    }

    public void showTable() {
        Collections.sort(league, Collections.reverseOrder()); // To get in Descending Order
        for (T team: league) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}
