package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts.Challenge.MyAttempt;

import Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts.Challenge.MyAttempt.Car;
import Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts.Challenge.MyAttempt.Mercedes;
import Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts.Challenge.MyAttempt.Porsche;

public class InheritanceChallengePart1 {
    // 88. Inheritance Challenge Part 1
    public static void main(String[] args) {
        // *** Challenge ***
        // Start with a base class of Vehicle, then create a Car class that inherits from this
        // Finally, create another class - a specific type of Car that inherits form the Car class
        // You should be able to handle steering, changing gears, and moving (i.e. speed)
        // You need to decide where to put the appropriate state and behaviours
        // For your specific type of vehicle, you will want to add something specific for that type of car

        Porsche porsche_1 = new Porsche("911");
        Porsche porsche_2 = new Porsche("Cayenne");
        System.out.println(Car.getCarCount());
        System.out.println(Porsche.getPorscheCount());
        System.out.println(Mercedes.getMercedesCount());

        Mercedes merc_1 = new Mercedes("A-Class");
        Mercedes merc_2 = new Mercedes("S-Class");
        System.out.println(Car.getCarCount());
        System.out.println(Porsche.getPorscheCount());
        System.out.println(Mercedes.getMercedesCount());
        System.out.println("-------");

        porsche_1.move();
        porsche_1.setTotalFuel(100);
        porsche_1.move();
        System.out.println("-------");

        porsche_2.move();
        porsche_2.setTotalFuel(2_000);
        porsche_2.move();
        porsche_2.setTotalFuel(1_000);
        porsche_2.move();
        System.out.println("-------");
        porsche_2.move(40);
        porsche_2.move(50);
        porsche_2.move(15);
    }
}
