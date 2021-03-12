package Section_11_NamingConventions_Packages_Static_Final_KWs.StaticStatement;

public class StaticStatement {
    // 150. The static statement

    // We've been using the static keyword when declaring variables and methods.

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number: " + firstInstance.getMemberNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number: " + secondInstance.getMemberNumInstances());
        // Each instance thinks it's the 1st instance, as we made numInstances a MEMBER variable (hence 1 in each)
        System.out.println("==================");

        // But a Static Field (AKA a Class Variable) is associated with the class, rather than with any
        // particular instance of the class (i.e. so there's only ever 1 copy of the variable in memory).
        // All instances of the class share the 1 static variable
        System.out.println("In reality (with the static numInstances field), this is the case;");
        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number: " + thirdInstance.getClassNumInstances());
        StaticTest fourthInstance = new StaticTest("4th Instance");
        System.out.println(fourthInstance.getName() + " is instance number: " + thirdInstance.getClassNumInstances());
        // Notice how for the last one I left it as "thirdInstance.getClassNumInstances()", and it still returned 4.
        // That's because the same variable in memory is being shared by all instances.
        // It doesn't matter which instance we use to access a static field.
        // However, this is obviously bad coding practice and may confuse you or other people looking at your code.

        // In general it's bad practice to access static variables via the instance. Instead you'd want to do it by
        // making the getter static, so it can be accessed via the class;
        System.out.println(StaticTest.getStaticClassNumInstances());
        System.out.println("=================");

        // Other examples of static methods we have used are;
        // - Integer.ParseIn()
        //

        // N.B. - static fields and methods belong to the class, NOT to instances of the class
        // As such they can be referred to without needing to instantiating the class first.
        // This explains why the main methods has to be static, coz when we want to execute a Java program,
        // there has to be an entry point (i.e. a method that is executed when the program runs).
        // However, until the program runs, there's no class instances to call the methods on, so Java has
        // to use this static method that can be called from the class name, rather than from a class instance.
        // So what happens when we execute our main() is IntelliJ invokes a Java executable, and passes to it
        // the name of the class that contains the public static void main. So, provided you've actually built
        // the project, you can run the program from the command line by changing it into the project
        // production directory, and then typing something like "java full.package.path.ClassWithMainMethod"
        // Java will then expect ClassWithMainMethod to have a static method called: "main()" with the exact
        // signature that is required. The main() method does NOT have to be in a class called Main, but this
        // is the convention.

        // But why are all the methods defined in main() also been static?
        // We'll use an example to figure out why;

//        int answer = multiply(6); // Non-static method 'multiply(int)' cannot be referenced from a static context
//        System.out.println("The answer is: " + answer);
//        System.out.println("Value of Multiplier is: " + multiplier); // Non-static field 'multiplier' cannot be referenced from a static context

        // So if multiply is public, why can't we access it from main()?
        // Well, as we've seen before, normal class fields require an instance of the class that don't actually
        // exist until an instance has been created. The main() method is static, and it can be called with the
        // class instance, so as a result, Java can't allow a static method to access non-static fields or
        // methods because, frankly, they don't exist when the static method is called.

        // So in many previous examples what we did was we created methods for main() to call, and in order for
        // that to work, we had to make the method static

        int answer = staticMultiply(6); // Valid!
        System.out.println("The answer is: " + answer);
        System.out.println("Value of StaticMultiplier is: " + staticMultiplier); // Valid!

        // N.B. - Note that there is no problem at all with a non-static constructor of the StaticTest class
        // from accessing static instance fields, and we can also call static methods from non-static ones
        // with no problems. There's nothing to stop static methods from accessing non-static fields or methods
        // in another class, because it creates an instance of a class in order to do so.
        // The restriction is purely on a static method accessing non-static methods and fields in its own class
    }

    // This'll show us what we can and cannot do with static methods
    public int multiplier = 7; // member variable

    public int multiply(int num) { // instance method
        return num * multiplier;
    }

    // The way around this is to make these static;
    public static int staticMultiplier = 7; // class/static variable

    public static int staticMultiply(int num) { // class/static method
        return num * staticMultiplier;
    }
}
