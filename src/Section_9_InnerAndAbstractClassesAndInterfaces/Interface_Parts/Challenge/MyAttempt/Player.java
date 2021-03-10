package Section_9_InnerAndAbstractClassesAndInterfaces.Interface_Parts.Challenge.MyAttempt;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    public String name;
    public String weapon;
    public Integer hitPoints;
    public Integer strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> fields = new ArrayList<String>();
        fields.add(name);
        fields.add(weapon);
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
                ", strength=" + strength + ", weapon='" + weapon + "'";
        return output;
    }
}
