package Section_11_NamingConventions_Packages_Static_Final_KWs.Packages.com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
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
        fields.add(0, name);
        fields.add(1, "" + hitPoints); // "" + int = shortcut to parse ints -> Strings
        fields.add(2, "" + strength);
        return fields;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            name = savedValues.get(0);
            hitPoints = Integer.parseInt(savedValues.get(1));
            strength = Integer.parseInt(savedValues.get(2));
        }
    }

    // Used a different Template offered for the auto-fill toString() method
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monster{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hitPoints=").append(hitPoints);
        sb.append(", strength=").append(strength);
        sb.append('}');
        return sb.toString();
    }
}
