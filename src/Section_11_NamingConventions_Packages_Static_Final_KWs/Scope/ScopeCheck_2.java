package Section_11_NamingConventions_Packages_Static_Final_KWs.Scope;

public class ScopeCheck_2 {
    // 146. Scope
    public int publicVar = 0;
    private int var1 = 1;

    public ScopeCheck_2() {
        System.out.println("ScopeCheck created");
        System.out.println("publicVar = " + publicVar);
        System.out.println("var1 = " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo() {
        int var2 = 2; // defined locally to the method, so it's in scope
        // If we commented out the above line, it would STILL work (it would use the member variable/field instead)
        for (int i=1; i <= 10; i++) {
            System.out.println(i + " X " + var2 + " = " + i * var2);
            // However, the next line uses the privateVar on ln 6;
            System.out.println(i + " X " + this.var1 + " = " + i * this.var1);
            System.out.println("============");
        }
    }

    // Accessing Inner Class members from Container Class;
    public void useInner() {
        System.out.println("CANNOT access var3 directly from outer (as it's defined in the InnerClass)...");
        System.out.println("BUT can instantiate it first then access it via that instance;");
        InnerClass innerClass = new InnerClass();
        System.out.println("Accessing var3 from Outer/Container class: " + innerClass.var3);
    }

    // Showing scope of classes
    public class InnerClass {
        private int var3 = 3;

        public InnerClass() {
            System.out.println("InnerClass instantiated");
            System.out.println("var3 = " + var3);
            System.out.println("Can still access var1 from base class, DESPITE it being private = " + var1);
        }

        public void timesTwo() {
            int var2 = 2;
            System.out.println("Can still access var1 here in the Inner Class method too: " + var1);
            for (int i=1; i <= 10; i++) {
                System.out.println(i + " X " + var2 + " = " + i * var2);
                System.out.println(i + " X " + this.var3 + " = " + i * this.var3);
                System.out.println(i + " X " + ScopeCheck_2.this.var1 + " = " + i * ScopeCheck_2.this.var1);
                System.out.println("============");
            }
        }
    }
}
