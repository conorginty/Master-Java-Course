package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Timmy");
        dog.eat();
        dog.breathe();
        System.out.println("-------");

        Parrot parrot = new Parrot("Flappy");
        parrot.eat();
        parrot.breathe();
        parrot.fly();
        System.out.println("-------");

        Penguin penguin = new Penguin("Pingu");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
