package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Dog is breathing");
    }
}
