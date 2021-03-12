package Section_11_NamingConventions_Packages_Static_Final_KWs.Scope;

public class ScopeCheck {
    // 146. Scope
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created");
        System.out.println("publicVar = " + publicVar);
        System.out.println("privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2; // defined locally to the method, so it's in scope
        // If we commented out the above line, it would STILL work (it would use the member variable/field instead)
        for (int i=1; i <= 10; i++) {
            System.out.println(i + " X " + privateVar + " = " + i * privateVar);
            // However, the next line uses the privateVar on ln 6;
            System.out.println(i + " X " + this.privateVar + " = " + i * this.privateVar);
            System.out.println("============");
        }
    }

    // Showing scope of classes
    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass instantiated");
            System.out.println("privateVar = " + privateVar);
        }

        public void timesTwo() {
            int privateVar = 2; // defined locally to the method, so it's in scope
            // If we commented out the above line, it would STILL work (it would use the member variable/field instead)
            for (int i=1; i <= 10; i++) {
                System.out.println(i + " X " + privateVar + " = " + i * privateVar);
                // However, the next line uses the privateVar on ln 31;
                System.out.println(i + " X " + this.privateVar + " = " + i * this.privateVar);
                // and the next line uses the privateVar on ln 6!;
                System.out.println(i + " X " + ScopeCheck.this.privateVar + " = " + i * ScopeCheck.this.privateVar);
                System.out.println("============");
            }
        }
    }
}
