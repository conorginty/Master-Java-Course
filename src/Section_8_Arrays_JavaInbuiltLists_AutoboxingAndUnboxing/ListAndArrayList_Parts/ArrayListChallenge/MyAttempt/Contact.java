package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.ListAndArrayList_Parts.ArrayListChallenge.MyAttempt;

public class Contact {
    // (2). Implement the Contact class with the following attributes:
    // - Two fields, both String, one called name and the other phoneNumber.
    private String name;
    private String phoneNumber;

    // - A constructor that takes two Strings, and initialises name and phoneNumber.
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // - And Three methods, they are:
    // 1. getName(), getter for name.
    public String getName() {
        return name;
    }

    // 2. getPhoneNumber(), getter for phoneNumber.
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // 3. createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
