package Section_6_OOP_Part1_ClassesConstructorsAndInheritance;

public class Cat {
    // (Part of 87. Static vs Instance Variables)

    // By NOT making name static, any changes to name will affect ONLY THE INSTANCE IN QUESTION
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        Cat mittens = new Cat("Mittens");
        mittens.printName(); // Name = Mittens
        Cat whiskey = new Cat("Whiskey");
        whiskey.printName(); // Name = Whiskey

        mittens.printName(); // Name = Mittens
    }
}
