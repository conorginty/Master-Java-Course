package Section_11_NamingConventions_Packages_Static_Final_KWs.Scope;

public class Main {
    public static void main(String[] args) {
        String privateVar = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("===========");
        System.out.println("scopeInstance privateVar = " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        // So, within the main() method itself, whenever we refer to privateVar, Java knows that we must be
        // referring to the one declared with main, as that's the only one available in the current scope
        // (i.e. the variable initialised on ln5 is "in-scope")

        // Access Modifiers: public, private and protected are 1 way to restrict the scope of an object.

        // Scope is even more important within the same class or method.

        scopeInstance.timesTwo();

        // Another way to consider what's happening in the timesTwo() method is the concept of Enclosing Blocks.
        // When Java sees a reference to a variable, it starts by checking the current block of code to see if
        // the variable was declared there - and if it is, then that variable is used, BUT if there's NO such
        // declaration and it's not there, then Java checks any block that encloses the current one to see if
        // there's a declaration there. Java keeps doing this, working backwards until it finds the variable
        // declaration, and if it doesn't, you'll get an error in your code.

        // In the case of Java looking for "privateVar" in the timesTwo() method;
        // - it'll 1st check the for loop body (as it's being printed there), and see there's no declaration there.
        // - then it considers the next enclosing block, which is the method itself. It does find it there, so it uses it
        // - if privateVar didn't exist there, it would check in the Class declaration, where it would find privateVar there

        // The concept of scope doesn't just apply to variables - methods and classes also have scope

        System.out.println("******************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
        // In the case of Java looking for "privateVar" in the timesTwo() method for the InnerClass;
        // - it'll 1st check the for loop body (as it's being printed there), and see there's no declaration there.
        // - then it considers the next enclosing block, which is the method itself. It does find it there, so it uses it
        // - if privateVar didn't exist there, it would check in the Class declaration (of InnerClass), where it would find privateVar there
        // - if privateVar didn't exist there, it would check in the Class declaration of the enclosing class (of ScopeCheck), where it would find privateVar there
        System.out.println("==================");

        // === 147. Part 2 ===
        // Objects also have visibility.

        String var4 = "this is private to main()";

        ScopeCheck_2 scopeInstance_2 = new ScopeCheck_2();
        System.out.println("===========");
        System.out.println("scopeInstance_2 var1 = " + scopeInstance_2.getVar1());
        System.out.println(var4);
        System.out.println("===========");

        // In Java, an Object's visibility is governed by the Access Modifiers.
        // Visibility is connected to Scope, and we need to look at that aspect of it 1st before covering the
        // Access Modifiers themselves, and how they actually relate to Access control.
        // N.B. - The Inner Class still had access to var1 from base class, DESPITE it being private.
        // This is because the Inner Class has access to all the variables of the container/base class, so
        // not only is var1 in scope within the Inner Class, it's also visible.
        // The same is true the other way around: The Containing Class can also access all the methods and
        // fields of a contained class EVEN IF they're marked as private
        scopeInstance_2.useInner();
    }
}
