package Section_9_InnerAndAbstractClassesAndInterfaces.Interface_Parts;

public class InterfacesIntro {
    // 123 + 124. Interfaces (Parts 1 + 2)

    // An Interface specifies Methods that a particular class that "implements" the interface must implement
    // The interface itself is abstract, meaning there's no code for the methods, you only supply
    // the actual method names and the parameters
    // The idea is to provide an interface to enforce a common behaviour that can be used by several classes
    // by having them all implement the same interface
    // Therefore, it's a way to standardise the way a particular set of classes is used.

    // From Google: "If the functionality you are creating will be useful across a wide range of disparate objects,
    // use an interface. Abstract classes should be used primarily for objects that are closely related, whereas
    // interfaces are best suited for providing common functionality to unrelated classes."

    // The way to decide between using an Interface or inheriting from a Base class is to consider the
    // relationship of the final class to the object it is extending (parent class) or implementing (interface).

    // In the case of our example: DeskPhone is a telephone (so you may think to use Inheritance)...
    // BUT a MobilePhone HAS A Telephone, BUT ALSO has a lot more functionality (i.e. it's like a mini computer).
    // Therefore, it's more accurate to say a MobilePhone is a computer that HAS a Phone interface

    // In Java is that a class can only inherit from 1 superclass (unlike other languages like C++),
    // BUT you can implement MANY Interfaces.
    // Therefore, in Java, multiple inheritance is only possible by implementing several interfaces
}
