package Section_11_NamingConventions_Packages_Static_Final_KWs.AccessModifiers;

// What are the visibilities of all of these?

interface AccessibleChallenge {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
//    private boolean methodD(); // NOT possible (otherwise, need a body)
}

// Answers;
// 1. AccessibleChallenge = package-private
// 2. SOME_CONSTANT = public
// 3. methodA() = public
// 4. methodB() = public
// 5. methodC() = public

// Why?
// 2. ALL interface variables are: public static final

// 3. 4. 5. Same as (2.), ALL interface methods are public
// This makes sense that you can ONLY have public methods in an interface because the whole point of declaring
// an interface is to provide methods that have to be implemented (so if you hide those methods in any class
// implementing the interface, it will struggle to implement the hidden methods which defeats the whole purpose
// of using an Interface).
// You can make the methods effectively package-private by ensuring that the interface itself is package-private
// Although all 3 methods are public, if the interface itself is NOT visible outside the current package, then
// those methods obviously won't be visible either.
