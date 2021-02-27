package Section_6_OOP_Part1_ClassesConstructorsAndInheritance;

public class ThisVsSuper {
    // 84. This vs Super

    // 1. === comparing keywords ===
    // super keyword: used to access/call the PARENT class members (variables and methods)
    // this keyword: used to access/call the CURRENT class members (variables and methods)

    // this is required when we have a parameter with the same name as an instance variable/field

    // We can use both of these keywords anywhere in a class EXCEPT static areas (i.e. the static block or static method)
    // Any attempt will lead to compile-time errors

    // this keyword is commonly used with constructors and setters (and optionally in getters).

    // super keyword is commonly used with method overriding when we want to call a method with the same name from the parent.

    // 2. === comparing method calls ===
    // this(): used to call a constructor from another overloaded constructor in the SAME class
    // The call to this (i.e. this()) can only be used in a Constructor, and it must be the 1st statement in a Constructor.
    // It's used with Constructor Chaining (i.e. when 1 constructor calls another constructor) in order to reduce duplicated code.

    // The only way to call a parent Constructor is by calling super (i.e. super()).
    // The Java Compiler puts a default call to super() if we don't add it, and it is always the no-args super which is inserted by the compiler.
    // The call to super() must be the 1st statement in a Constructor.
    // Even Abstract Classes have Constructors (ALTHOUGH you can never instantiate an abstract class using the 'new' keyword)
    // An Abstract Class is still a super class, so its Constructors run when someone makes an instance of a concrete Subclass.

    // N.B. - A Constructor can have a call to super() or this(), BUT NEVER both!
}
