package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts;

public class InterfaceVsAbstractClass {
    // 132. Interface vs Abstract Class

    // Abstract classes are very similar to Interfaces in that you cannot instantiate them.
    // (I THINK HE MEANS BOTH?) They may contain a mix of methods declared with or without implementation.

    // However, with Abstract classes you can you can declare fields that are NOT static and final, and define
    // public, protected and private concrete methods.
    // An Abstract class (or any class) can only extend 1 parent class, but can implement multiple interfaces
    // When an Abstract class is subclassed, the subclass usually provides implementations for all of the abstract
    // methods in its parent class. However, if it doesn't, then the subclass must also be declared abstract.

    // You want to use an Abstract Class when;
    // - You want to share code among several closely-related classes (e.g. Animal - with fields: name, age etc)
    // - You expect classes that extend your abstract class to have many common methods or fields or required
    //   access modifiers other than public
    // - You want to declare non-static or non-final fields (e.g. name, age), this enables you to define methods
    //   that can access and modify the state of an object (getName, setName)
    // - You have a requirement for your base class to provide a default implementation of certain methods, but
    //   other methods should be open to being overridden by child classes.
    // SUMMARY: The purpose of an Abstract class is to provide a common definition of a base class that multiple
    // derived classes can share.
    //=============================================================================================================

    // An interface is just the declaration of methods of a Class - it's NOT the implementation
    // (though it can be in Java 8 I think???)
    // In an Interface, we define what kind of operation an object can perform. These operations are defined by
    // the classes that implement the Interface
    // Interfaces form a Contract between the class and the outside world, and this contract is enforced at
    // build time by the compiler
    // You cannot instantiate them, and they may contain a mix of methods declared with or without an
    // implementation. All methods in Interfaces are automatically public and abstract.
    // An Interface can implement another Interface
    // Interfaces are more flexible and can deal with a lot more stress on the design of your program
    // than the implementation.
    // By introducing Interfaces into your program, you are really introducing points of variation at which you
    // can plug in different implementations for that interface. An Interface;s primary purpose is abstraction -
    // decoupling the what from the how.
    // N.B. - Since Java 8, Interfaces can contain default methods. In other words, methods with implementation.
    // The keyword default is used here (mostly for backwards compatibility) and static methods as well before
    // Java 8 that was not possible
    // N.B. - Since Java 9, Interfaces can also contain private methods (commonly used when 2 default methods
    // in an interface share common code)

    // You want to use an Interface when;
    // - You expect unrelated classes to implement your Interface. (e.g. Comparable and Cloneable are
    //   implemented by many unrelated classes)
    // - You want to specify the behaviour of a particular data type, but you are not concerned about who
    //   implements its behaviour.
    // - You want to separate different behaviour

    // Examples of Interfaces are;
    // 1. The Collections API - we have the List Interface and implementations: ArrayList and LinkedList
    // 2. The JDBC API - exists almost only for Interfaces. The concrete implementations are provided as
    //    "JDBC drivers". This enables you to write all the JDBC code independent of the database (DB) vendor.

}
