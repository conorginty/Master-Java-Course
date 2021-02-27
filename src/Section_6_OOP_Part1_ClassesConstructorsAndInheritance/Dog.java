package Section_6_OOP_Part1_ClassesConstructorsAndInheritance;

public class Dog {
    // (Part of 87. Static vs Instance Variables)

    // By making name static, any changes to name will affect EVERY instance's name
    private static String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        Dog rex = new Dog("Rex");
        rex.printName(); // Name = Rex
        Dog fluffy = new Dog("Fluffy");
        fluffy.printName(); // Name = Fluffy

        // When creating the fluffy instance, all instances names got updated to fluffy...
        rex.printName(); // Name = Fluffy
        // This is because static variables are SHARED between instances
    }
}
