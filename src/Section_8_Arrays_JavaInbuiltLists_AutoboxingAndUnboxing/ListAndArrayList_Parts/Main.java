package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.ListAndArrayList_Parts;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clears the input buffer

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                default:
                    quit = true;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Press: ");
        System.out.println("\t 0 - To print Instructions again (i.e. choices).");
        System.out.println("\t 1 - To print the list of Grocery Items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t Anything Else - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the name of the grocery item you wish to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
        System.out.println("Item added successfully");
    }

    // ***********************************************************************************************
    // These 2 Methods should be re-written in a different way, so that we're not passing the position of the
    // item that we wish to edit (i.e. either modify or remove). Good programming practice would dictate that
    // we would not require the client (i.e. our Main class) to know what the index of the element is.
    // In reality, GroceryList should be self-contained and be left to handle the element numbers/positions,
    // and from the POV of the calling process, both these methods should work like 'addItem()', where we just
    // pass the item we wish to add, and leave the rest to the GroceryList class to handle

    public static void modifyItem() {
        System.out.print("Please enter the position/number of the grocery item you wish to modify: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter item you wish to replace that item with: ");
        String replacementItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, replacementItem);
        // We're deducting 1 from the itemNo position to get the index of the item of interest
    }

    public static void removeItem() {
        System.out.print("Please enter the position/number of the grocery item you wish to remove: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    // Therefore, we will make BETTER versions of these 2 methods, and create a new class: BetterGroceryList to do this;
    // We will also run the code in BetterMain (as we need to instantiate a BetterGroceryList

    // ***********************************************************************************************

    public static void searchForItem() {
        System.out.print("Please enter the name of the grocery item you wish to locate: ");
        String itemOfInterest = scanner.nextLine();
        if (groceryList.findItem_V2(itemOfInterest) != null) {
            System.out.println("Found " + itemOfInterest + " in our Grocery List");
        } else {
            System.out.println(itemOfInterest + " is not in the shopping list");
        }
    }
}
