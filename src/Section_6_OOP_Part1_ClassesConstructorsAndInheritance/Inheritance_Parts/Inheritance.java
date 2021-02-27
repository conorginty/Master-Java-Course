package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts;

public class Inheritance {
    // 81. Inheritance - Part 1 + 82. Part 2

    // Often objects share characteristics
    // e.g. Labrador, Poodle, Daschund etc are all Dogs (they all have characteristics of dogs)
    // However, each of them specialise in certain aspects that collectively make them fundamentally different to one another

    // OOP allows us to create classes to inherit commonly-used standard behaviour from other classes.
    public static void main(String[] args) {
        Animal animal = new Animal("GenericAnimal", 1, 1, 5, 5);
        // Although we have made a generic animal, it doesn't really make sense to do so.
        // Instead we want to work with a concrete, specific instance - a Dog;
        Dog poodle = new Dog("Poodle", 8, 20, 2, 4, 1, 20, "curly");
        System.out.println(poodle.getName());
        System.out.println(poodle.getSize());
        // method eat() was defined in Animal, but because Dog inherits from Animal, its instances also have access to Animal's methods
        poodle.eat();
        System.out.println("=========");
        poodle.walk();
        System.out.println("--------");
        poodle.run();
        System.out.println("=========");
        Fish fish = new Fish("Goldfish", 2, 3, 1, 2, 3);
        fish.swim(7);
    }
}
