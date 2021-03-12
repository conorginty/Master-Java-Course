package Section_11_NamingConventions_Packages_Static_Final_KWs.FinalStatement;

public class Main {
    public static void main(String[] args) {
        SomeClass one = new SomeClass("One");
        SomeClass two = new SomeClass("Two");
        SomeClass three = new SomeClass("Three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        // By making instanceNumber final, each instance's value can't be changed once the instance has been made.
        // Attempting to do so would give an error, e.g.;
//        one.instanceNumber = 4; // INVALID: Cannot assign a value to final variable 'instanceNumber'

        // It's generally good practice to mark variables as final whenever you know the value shouldn't be
        // changed once the initial value has been set.

        // That said though, "static final" is more commonly used for constants. Our instanceNumber public final
        // instance member was NOT being treated as a constant, coz we did want to assign its value, but we
        // only wanted to assign it once, and we didn't want it to change after that point.
        // That's also why we didn't use UPPER_CASE for the variable name.
        // Constants are declared as "static final" because if the value really is a constant, and won't change,
        // then it doesn't make sense to store a copy of that in every single class instance.
        // They all hold the same value, so it makes sense to store it only once at the class level.
        // e.g. Math.PI;

        // Let's look at using the Math class a bit more to explore more uses of the "final" statement;
//        Math m = new Math();
        // Oh no wait - we can't!
        // That's because the creators of the class made the constructor private.
        // This is because all methods and members are static, so we can access them straight from Math!
        // You may think we can get around this by making a subclass of Math (i.e. MyClass extends Math)
        // However, the creators also made Math final, so it prevents the class from being extended.

        // So we can make Classes un-inheritable by making them "final"
        // We can also make methods un-overridable by making them "final"
        System.out.println("==============");

        int myPassword = 654321;
        Password password = new Password(myPassword);
        password.storePassword(); // Saving password as: 122828516 (Encrypted Password)
        // N.B. - This is an example of why you'd want to possibly prevent a method from being overridden, NOT
        // about how to encrypt and store passwords in a database.
        // If you ever wanted to properly implement Cryptography, make use of a Cryptographic library!

        password.letMeIn(1);
        password.letMeIn(531231);
        password.letMeIn(97773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(654321);

        // But the problem arises when someone comes and overrides the stored password method in the subclass;
        System.out.println("====================");

        // 152. Final Part 2 and Static Initializers

        Password extendedPassword = new ExtendedPassword(myPassword);
        extendedPassword.storePassword(); // Saving password as 654321
        // The original password has been exposed!!

        // To fix this we would make Password.storePassword() final (not done here, though, to allow above code to run)
        System.out.println("=============");

        // We now want to look at the static equivalent of constructors: Static Initialisation Blocks
        // The standard Constructors, by default, are Instance Constructors (i.e. they're not static), so they'll
        // be executed every time we create a new instance of a class.
        // The static equivalent: the Static Initialisation Block, is different because it is only executed once,
        // when the class is 1st loaded into the project.
        // It's not often we'd need to create a class constructor (which is basically what it is).
        // The static final variable must be initialised by the time all static initialisation blocks terminate.
        // So, in the same way we can set the value of a final field in the constructor, we can also assign
        // the value of a static final variable in the Static Initialisation Block.

        System.out.println("Main method called");
        StaticInitialisationBlockTest test = new StaticInitialisationBlockTest();
        test.someMethod();
        System.out.println("Owner is: " + StaticInitialisationBlockTest.owner);
        // Print Order;
        //-------------
        // Main method called
        // StaticInitialisationBlockTest static initialisation block called
        // 2nd static initialisation block called
        // StaticInitialisationBlockTest Constructor called
        // someMethod called
        // Owner is: Tim

        // N.B. - SIBs are called BEFORE the Constructor, and they're also called before any non-static
        // methods, including the Constructor, and finally we saw that when we checked the "owner", it
        // had the value "Tim", initialised by the 1st SIB
    }
}
