package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.ListAndArrayList_Parts.ArrayListChallenge.MyAttempt;

import java.util.ArrayList;

public class MobilePhone {
    // Create a program that implements a simple mobile phone with the following capabilities.
    // (1). Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:

    // - Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
    private String myNumber;
    private ArrayList<Contact> myContacts;

    // - A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // - And seven methods, they are (their functions are in their names):

    // 1. addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
    public void addNewContact(Contact contact) {
        myContacts.add(contact);
    }

    // 2. updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
    private void updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index >= 0) {
            updateContact(index, newContact);
        }
    }

    // === Public Overloaded Method ===
    public void updateContact(int index, Contact newContact) {
        myContacts.set(index, newContact);
    }

    // 3. removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
    private void removeContact(Contact contact) {
        int index = findContact(contact);
        if (index >= 0) {
            removeContact(index);
        }
    }

    // === Public Overloaded Method ===
    public void removeContact(int index) {
        myContacts.remove(index);
    }

    // 4. findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    // 5. findContact(), same as above, only it has one parameter of type String.
    public int findContact(String contact) {
        return myContacts.indexOf(contact);
    }
    // THIS IS WRONG!!!!!!!!

    // 6. queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return myContacts.get(index);
        }
        return null;
    }
    // 7. printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
    public void printContacts() {
        System.out.println("Contact List");
        for (int i=0; i < myContacts.size(); i++) {
            Contact currentContact = myContacts.get(i);
            System.out.println(i+1 + ". " + currentContact.getName() + " -> " + currentContact.getPhoneNumber());
        }
    }
    // Contact List:
    //        1. Bob -> 31415926
    //        2. Alice -> 16180339
    //        3. Tom -> 11235813
    //        4. Jane -> 23571113
}
