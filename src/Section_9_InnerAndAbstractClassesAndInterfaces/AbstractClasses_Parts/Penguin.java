package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I don't know how to do that...");
    }
}
