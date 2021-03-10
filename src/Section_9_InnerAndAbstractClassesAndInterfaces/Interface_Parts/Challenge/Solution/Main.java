package Section_9_InnerAndAbstractClassesAndInterfaces.Interface_Parts.Challenge.Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim);
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
//        loadObject(tim); // Commented out so don't need to input a lot of stuff
        System.out.println(tim);
        System.out.println("==========");

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
        saveObject(werewolf);

        // N.B. - As we are creating an ISaveable monster, we can only access the implemented methods
        // e.g. we can't do the following;
//        werewolf.getStrength();
        // Instead we'd need to cast it to Monster;
        System.out.println(((Monster) werewolf).getStrength());

        // It can be a little bit confusing in deciding when to declare an instance as the class or interface
        // Generally speaking it depends on what you plan on doing with the instance
        // - If you want to declare a variable that can hold objects of different types, it'll have to be the type of the common interface
        // - BUT if you want to access methods that exist in the class, but they're not part of the interface, the object will need to be declared as the class type itself (unless you use a cast)
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "0 to quit\n" +
                "1 to enter a string");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the input buffer
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String:");
                    String input = scanner.nextLine();
                    values.add(index, input);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        // We're passing the ISaveable interface as a parameter.
        // This means we can use ANY object that has implemented that interface
        // We're cycling through all the entries (fields) using .write() (as it returns an ArrayList)
        for (int i=0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
