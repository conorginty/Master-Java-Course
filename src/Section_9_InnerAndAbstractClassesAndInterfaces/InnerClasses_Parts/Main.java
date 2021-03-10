package Section_9_InnerAndAbstractClassesAndInterfaces.InnerClasses_Parts;

public class Main {

    public static void main(String[] args) {
        // Gear is a member of gearbox, so it must be created with an instance of it
        // Syntax = "Outer.Inner innerClassInstanceVarName = new outerInstance.Inner(X, Y, Z)"
        Gearbox mcLaren = new Gearbox(6);

        // === N.B. - These 2 next lines used to work, til we made Gear class private ===
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));

        // You'll get an error if you try to create a Gear object without having an instance of Gearbox to create from
//        Gear second = new Gear(2, 15.4); // WON'T work
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4); // WON'T work - Gearbox is not an enclosing class
//        Gearbox.Gear second = new mcLaren.Gear(2, 15.4); // WON'T work - Cannot resolve symbol 'Gear'

        // === N.B. - This next line used to work, til we made Gear class private ===
//        Gearbox.Gear second = mcLaren.new Gear(2, 15.4); // Works

        // Often the Inner class is going to be private anyway (i.e. instances will only be created by the outer class)
        // The inner class, at least in this example, is probably something you don't want people to normally directly access
        // The instance (Gear) will only be created by the outer class (Gearbox)
        // We're not actually interested in the individual gear objects that we're driving.
        // We want to change the gear, but we do that by interacting with the gearbox, NOT the individual gears
        // i.e. Your public interface, that you're exposing to your program, would be gearbox (rather than gear directly)
        // You would be exposing the fact that you can change gears, but you won't be interacting with the gears themself

//        mcLaren.addGear(1, 5.3);
//        mcLaren.addGear(2, 10.6);
//        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1_000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(1_000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1_000));
        System.out.println("==================");
    }
}
