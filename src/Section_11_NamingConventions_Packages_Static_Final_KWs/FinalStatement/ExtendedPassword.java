package Section_11_NamingConventions_Packages_Static_Final_KWs.FinalStatement;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    @Override
    public void storePassword() {
        System.out.println("Saving password as " + decryptedPassword);
    }
}
