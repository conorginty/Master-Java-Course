package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.ListAndArrayList_Parts.ArrayListChallenge.Solution;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    private boolean on;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
        this.on = false;
    }

    public void clickPowerButton() {
        if (on) {
            this.on = false;
            System.out.println("Switching phone off...");
        } else {
            this.on = true;
            System.out.println("Switching phone on");
        }
    }

    // If the contact was added successfully, return true, otherwise false
    public boolean addNewContact(Contact contact) {
        int foundIndex = findContact(contact);
        if (foundIndex >= 0) {
            printContactExists(contact, true);
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private void printContactExists(Contact contact, boolean exists) {
        if (exists) {
            System.out.println("Contact: " + contact.getName() + " is already on file");
        } else {
            System.out.println("Contact: " + contact.getName() + " does not exist.");
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
//        int foundIndex = findContact(oldContact.getName());
        int foundIndex = findContact(oldContact);
        if (foundIndex < 0) {
            printContactExists(oldContact, false);
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name: " + newContact.getName() + " already exists.");
            System.out.println("Update was unsuccessful.");
            return false;
        }
        myContacts.set(foundIndex, newContact);
        System.out.println(oldContact.getName() + " was replaced with: " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundIndex = findContact(contact);
        if (foundIndex < 0) {
            printContactExists(contact, false);
            return false;
        }
        myContacts.remove(foundIndex);
        System.out.println("Contact: " + contact.getName() + " removed successfully");
        return true;
    }

    // 2 findContact methods: Both return the index of the contact if they exist in the Contacts list
    // 1. Takes a Contact param
    // 2. Takes a Name param

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i=0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    // 3. Takes a Contact (and returns the data from another method, and returns it as a String)
//  NOT SURE WHY TIM INCLUDED THIS METHOD?????
//    public String queryContact(Contact contact) {
//        if (findContact(contact) >= 0) {
//            return contact.getName();
//        }
//        return null;
//    }

    public Contact queryContact(String contactName) {
        int index = findContact(contactName);
        if (index >= 0) {
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("=== Contact List ===");
        for (int i=0; i < myContacts.size(); i++) {
            String contactName = myContacts.get(i).getName();
            String phoneNumber = myContacts.get(i).getPhoneNumber();
            System.out.println((i+1) + ". " + contactName + " -> " + phoneNumber);
        }
    }
}
