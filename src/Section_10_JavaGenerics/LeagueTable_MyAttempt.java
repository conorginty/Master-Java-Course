package Section_10_JavaGenerics;

import java.util.ArrayList;

public class LeagueTable_MyAttempt<T extends Team> {
    private ArrayList<T> table;

    public LeagueTable_MyAttempt(ArrayList<T> table) {
        this.table = table;
        sortTable();
    }

    private void sortTable() {
        for(int i=0; i < table.size(); i++) {
            T current = table.get(i);
            System.out.println("Current: " + current.getName());
            for(int j=0; j < table.size(); j++) {
                T other = table.get(j);
                if (current.compareTo(other) > 0) {
                    T temp = table.get(i);
                    table.set(i, other);
                    table.set(j, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int i=0; i < table.size(); i++) {
            output += (i+1) + ". " + table.get(i).getName() + " -> " + table.get(i).ranking() + "\n";
        }
        return output;
    }
}
