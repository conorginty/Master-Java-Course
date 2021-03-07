package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.ListAndArrayList_Parts.ArrayListChallenge.Solution;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123-456-7890");

    public static void main(String[] args) {

        boolean quit = false;
        mobilePhone.clickPowerButton(); // Turn phone on
        printActions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clears the input buffer

            switch(choice) {
                case 0:
                    mobilePhone.clickPowerButton(); // Turn phone off
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNum = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNum);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: Name = " + name + ", Phone = " + phoneNum);
        } else {
            System.out.println("Can't add contact - " + name + " already exists in the contact list");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing Contact Name: ");
        String contactName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(contactName);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new Contact Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Contact Phone Number");
        String newNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);

        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Successfully updated the record.");
        } else {
            System.out.println("Error updating the record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing Contact Name: ");
        String contactName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(contactName);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Record successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing Contact Name: ");
        String contactName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(contactName);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + ", phone number: " + existingContact.getPhoneNumber());
    }

    private static void printActions() {
        System.out.println("Press: ");
        System.out.println("\t 0 - To shut down.");
        System.out.println("\t 1 - To print contacts.");
        System.out.println("\t 2 - To add a new contact to contact list.");
        System.out.println("\t 3 - To update/modify an existing contact in the contact list.");
        System.out.println("\t 4 - To remove an existing contact from the contact list.");
        System.out.println("\t 5 - To search for an existing contact from the contact list.");
        System.out.println("\t 6 - To print a list of available actions.");
        System.out.println("\t Anything Else - To quit the application.");
    }
}
