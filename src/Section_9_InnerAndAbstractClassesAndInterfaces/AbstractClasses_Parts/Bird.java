package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bird is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Bird is breathing");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flapping its wings");
    }
}
