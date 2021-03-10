package Section_9_InnerAndAbstractClassesAndInterfaces.InnerClasses_Parts;

public class InnerClassesIntro {
    // 127. Inner Classes

    // It's possible in Java to nest a class inside another class
    // 4 types of nested classes;

    // 1. static nested classes
    // - Mainly used to associate a class with its outer class
    // - In terms of behaviour, you can think of it as being identical to a top level class, BUT it's
    //   packaged in its outer class, rather than in the package
    // - This means it cannot access the non-static methods or members of its outer class without first
    //   creating an instance of that class

    // 2. non-static nested classes (inner class)
    // - Useful when it doesn't make sense to refer to a class without its outer class
    // - e.g. if we're modelling an engine, we may have a gearbox class and a gear class

    // 3. local class (inner class that's defined inside of a scope block - usually a method)
    // - Their scope is restricted completely to that block
    // - Used very seldom

    // 4. anonymous class - nested class without a class name
    // - They have to declared and instantiated at the same time, as they haven't got a name.
    // - They're used only when a local class is required once
    // - Very common for attaching eventHandlers to use in a user interface (e.g. if you want to program an android app)

}
