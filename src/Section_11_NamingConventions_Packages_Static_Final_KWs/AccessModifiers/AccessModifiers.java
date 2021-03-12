package Section_11_NamingConventions_Packages_Static_Final_KWs.AccessModifiers;

public class AccessModifiers {
    // 149. Access Modifiers

    // We'll look into why you'd want to restrict access to fields and methods in your classes
    // We'll implement a seriously flawed Bank Account to demonstrate this (see Account and Main)...

    // We'll now focus on the 4 Access Modifiers

    // Only Classes, Interfaces and Enums can exist at the top-level. Everything else must be included
    // within one of these.

    // ===== At the Top Level =====
    // 1. public - The object is visible to all classes everywhere, whether they are in the sam package
    //    or have imported the package containing the public class
    // 2. package-private - The object is only available within its own package (and is visible to every
    //    class within the same package). Package-private is specified by NOT specifying (i.e. there is
    //    NO "package-private" keyword).
    // 3. private - You CAN'T make classes at the Top-Level private

    // ===== At the Member Level =====
    // 1. public - has the same meaning as top level - a public class member/field or public method can be
    //    accessed from any other class anywhere, even in a different package.
    // 2. package-private - this also has the same meaning as it does at the top level. An object with no
    //    access modifier is visible to every class within the same package (but NOT to classes in
    //    external packages)
    // 3. private - The object is only visible within the class it is declared. It is NOT visible anywhere
    //    else (including in subclasses of its class)
    // 4. protected - The object is visible anywhere within its own package (like package-private), BUT also
    //    in subclasses, even if they are in another package.
}
