package Section_6_OOP_Part1_ClassesConstructorsAndInheritance;

public class StaticVsInstanceMethods {
    // 86. Static Vs Instance Methods

    // static methods are declared using a static modifier
    // static methods can NOT access instance methods or instance variables directly
    // They are usually used for operations that don't require any data from an instance of the class (i.e. from this)
    // In static methods, we CAN'T use the this keyword
    // Whenever you see a method that does NOT use instance variables, then that should be declared as a static method
    // e.g. 'main' is a static method, and it's called by the JVM when it starts an application
    // static methods don't require an instance to be created. You only need to follow the syntax: ClassName.methodName();

    // instance methods belong to an instance of a class
    // To use an instance method, we have to instantiate the class first, usually by using the 'new' keyword
    // They can access instance methods and instance variables directly
    // They CAN ALSO access static methods and static variables directly

    // To decide if a method should be static or not;
    // - If the method uses any instance variables or instance methods, it should probably be an instance method
    // - If not, then it should probably be a static method
}
