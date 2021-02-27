package Section_6_OOP_Part1_ClassesConstructorsAndInheritance;

public class StaticVsInstanceVariables {
    // 87. Static vs Instance Variables

    // static variables are also known as static member variables.
    // Every instance of that class shares the SAME static variable
    // If changes are made to that variable, all other instances of that class will feel the effect of that change
    // They're not used very often, but can sometimes be useful
    // e.g. when reading input using Scanner, we will declare scanner as a static variable
    // In that way, static methods can access the scanner instance directly

    // Instance variables DON'T use the static keyword
    // They're also known as fields or member variables
    // They belong to an instance of a class
    // Every instance has its own copy of an instance variable.
    // Every instance can have a different value/state.
    // Instance variables represent the state of a specific instance of a class.
}
