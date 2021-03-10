package Section_9_InnerAndAbstractClassesAndInterfaces.Interface_Parts.Challenge.MyAttempt;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private Integer hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> fields = new ArrayList<String>();
        fields.add(name);
        // Adding ints as strings
        fields.add(hitPoints.toString()); // Can be done coz of "Integer" class
        fields.add(String.valueOf(strength)); // Alternatively can do this
        return fields;
    }

    @Override
    public void read(List<String> someList) {
        if (someList.isEmpty() || someList == null) {
            System.out.println("Problem with the list");
        } else {
            System.out.println("List is fine");
            for (String ele: someList) {
                System.out.println(ele);
            }
        }
    }

    @Override
    public String toString() {
        String output = getClass().getName() + "{name='" + name + "', hitPoints=" + hitPoints +
                ", strength=" + strength + "'";
        return output;
    }
}
