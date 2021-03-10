package Section_9_InnerAndAbstractClassesAndInterfaces.Interface_Parts;

public interface ITelephone {
    // We define just the methods that a class that implements this interface needs to implement (it's a contract)
    // The code for these methods is defined in the classes that implement the interface
    // By convention, Interface names begin with the letter "I", and then the name of the Interface
    // (i.e. in this case it's: ITelephone)
    // Defining the access modifier is pointless, because we do this in the class that implements this

    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
