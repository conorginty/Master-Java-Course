package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // As eating and breathing is common to all animals, it's better to declare them as abstract methods
    // here rather than as Interfaces (like we did with CanFly, coz obviously only certain animals can fly)
    public abstract void eat();
    public abstract void breathe();
}
