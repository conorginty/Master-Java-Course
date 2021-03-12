package Section_11_NamingConventions_Packages_Static_Final_KWs.StaticStatement;

public class StaticTest {
    private String name;
    private int memberNumInstances = 0; // Member variable
    private static int classNumInstances = 0; // Class variable

    public StaticTest(String name) {
        this.name = name;
        memberNumInstances++;
        classNumInstances++;
    }

    public int getMemberNumInstances() {
        return memberNumInstances;
    }

    public int getClassNumInstances() {
        return classNumInstances;
    }

    public static int getStaticClassNumInstances() {
        return classNumInstances;
    }

    public String getName() {
        return name;
    }
}
