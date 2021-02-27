package Section_6_OOP_Part1_ClassesConstructorsAndInheritance;

public class MethodOverloadingVsOverriding {
    // 85. Method Overloading vs Overriding

    // Method Overloading = providing 2/more separate methods in a class with same name BUT different parameters
    // The method return type may or may not be different, and that allows us to reuse the same method name
    // It's handy as it reduces duplicated code, and we don't need to remember multiple method names
    // Although has nothing to do with Polymorphism, it's often referred to as Compile Time Polymorphism
    // (i.e. the compiler decides which method will be called based on the method name, return type and argument list)
    // We can overload static and instance methods
    // Usually the overloading happens inside a single class, but a method can also be treated as overloaded in the subclass of that class.
    // This is because a subclass inherits one version of the method from the parent class, and then the subclass can have another overloaded version of the method in its own class
    // Methods will be considered overloaded if they follow the following rules;
    // - Methods must have the same method name
    // - Methods must have different (number of) parameters
    // If Methods follow these rules, then they may or may not:
    // - Have different return types
    // - Have different access modifiers
    // - Throw different checked or unchecked exceptions

    // Method Overriding = defining a method in a child class that already exists in the parent class with the same signature (i.e. same name, same arguments)
    // By extending the parent class, the child class gets all the methods defined in the parent class (these methods are called: Derived Methods)
    // It is also known as Runtime Polymorphism and Dynamic Method Dispatch,
    // (i.e. because the method that is going to be called is decided at runtime by the JVM)
    // When we override a method, it's recommended to put "@Override" immediately above the method definition.
    // This is an annotation that the compiler reads and will then show us an error if we don't follow overriding rules correctly.
    // We can ONLY override Instance methods, NOT static methods!
    // Methods will be considered overridden if they follow the following rules;
    // - They must have the same name and same arguments
    // - The return type can be a subclass of the return type in the parent class
    // - It can NOT have a lower access modifier (e.g. if the parent is protected, then we can't use private in the child, BUT can use public)
    // Important points about Method Overriding to keep in mind;
    // - Only inherited methods can be overridden (i.e. methods can only be overridden in child classes)
    // - Constructors and private methods cannot be overridden
    // - final methods cannot be overridden
    // - A subclass can use super.methodName() to call the original superclass version of an overridden method

    // ===== Overriding Example =====
    class Dog {
        public void bark() {
            System.out.println("Generic Woof");
        }
    }

    class GermanShepherd extends Dog {
        @Override
        public void bark() {
            System.out.println("Majestic Barking");
        }
    }

    // ===== Overloading Example =====
    class Cat {

        public void meow() {
            System.out.println("Meow");
        }

        public void meow(int times) {
            for (int i=0; i < times; i++) {
                System.out.println("Meow");
            }
        }
    }
}
