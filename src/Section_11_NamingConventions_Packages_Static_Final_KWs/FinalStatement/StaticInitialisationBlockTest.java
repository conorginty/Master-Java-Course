package Section_11_NamingConventions_Packages_Static_Final_KWs.FinalStatement;

public class StaticInitialisationBlockTest {
    public static final String owner;

    // 1st SIB
    static {
        owner = "Tim";
        System.out.println("StaticInitialisationBlockTest static initialisation block called");
    }

    // Regular Instance Constructor
    public StaticInitialisationBlockTest() {
        System.out.println("StaticInitialisationBlockTest Constructor called");
    }

    // 2nd SIB
    static {
        System.out.println("2nd static initialisation block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
