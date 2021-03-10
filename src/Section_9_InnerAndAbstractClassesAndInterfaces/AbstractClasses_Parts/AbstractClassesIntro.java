package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts;

public class AbstractClassesIntro {
    // 130. Abstract Classes

    // Abstraction is when you define the required functionality for something, without actually implementing the details
    // i.e. We're focusing on what needs to be done, not on how it's to be done.

    // As we saw previously, interfaces are purely abstract - they don't specify any actual aspect of implementation
    // The actual implementation was left to the classes that implement the interface

    // With Abstract Classes, NOT ALL methods need to be abstract (whereas for interfaces, they do)

    // ===== Differences between Abstract Classes and Interfaces =====
    // An Abstract Class can have member variables that are inherited (which can't be done in Interfaces)
    // Interfaces can have variables, BUT they're all public static final variables (constant values with a static scope)
    // They have to be static coz non-static variables require an instance (and you can't instantiate interfaces)
    // Interfaces also cannot have Constructors, BUT Abstract classes can
    // All methods of an Interface are automatically public, whereas the methods of an abstract class can have any visibility
    // Abstract classes can have defined methods (i.e. with implementation), whereas Interfaces can only have declared/abstract methods

}
