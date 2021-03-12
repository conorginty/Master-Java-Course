package Section_11_NamingConventions_Packages_Static_Final_KWs.FinalStatement;

public class Password {
    private static final int key = 123456789;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
        // Just checks the bits in both and returns a 1 in any position where there is a 1 in only one of the values
        // Has applications in cryptography (but in a more complex manner)
    }

    public void storePassword() {
        System.out.println("Saving password as: " + encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("No entry allowed!");
            return false;
        }
    }
}
