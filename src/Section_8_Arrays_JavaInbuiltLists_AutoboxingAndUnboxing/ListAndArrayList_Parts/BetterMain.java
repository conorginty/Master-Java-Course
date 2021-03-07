package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.ListAndArrayList_Parts;

import java.util.ArrayList;
import java.util.Scanner;

public class BetterMain {

    private static Scanner scanner = new Scanner(System.in);
    private static BetterGroceryList betterGroceryList = new BetterGroceryList();

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
                    betterGroceryList.printGroceryList();
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
                case 6:
                    processArrayList();
                    break;
                default:
                    quit = true;
            }
        }
    }

    // 0
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

    // 1.
    public static void addItem() {
        System.out.print("Please enter the name of the grocery item you wish to add: ");
        betterGroceryList.addGroceryItem(scanner.nextLine());
        System.out.println("Item added successfully");
    }

    // ************************************************************************************************
    // 3.
    public static void modifyItem() {
        System.out.print("Please enter the name of the grocery item you wish to modify: ");
        String currentItem = scanner.nextLine();
        System.out.println("Enter item you wish to replace that item with: ");
        String replacementItem = scanner.nextLine();
        betterGroceryList.modifyGroceryItem(currentItem, replacementItem);
        // We're deducting 1 from the itemNo position to get the index of the item of interest
    }

    // 4.
    public static void removeItem() {
        System.out.print("Please enter the name of the grocery item you wish to remove: ");
        String itemToRemove = scanner.nextLine();
        betterGroceryList.removeGroceryItem(itemToRemove);
    }
    // ***********************************************************************************************

    // 5.
    public static void searchForItem() {
        System.out.print("Please enter the name of the grocery item you wish to locate: ");
        String itemOfInterest = scanner.nextLine();
        if (betterGroceryList.existsInList(itemOfInterest)) {
            System.out.println("Found " + itemOfInterest + " in our Grocery List");
        } else {
            System.out.println(itemOfInterest + " is not in the shopping list");
        }
    }

    // ========== Additional Method added ==========
    // 6.
    private static void processArrayList() {
        // Copying an ArrayList to another ArrayList

        // === Option 1 ===
        ArrayList<String> copyArray1 = new ArrayList<String>();
        // Below we're taking the contents of groceryList and adding them to the new ArrayList
        // NOT SURE IF IT'S A SHALLOW OR DEEP COPY
        copyArray1.addAll(betterGroceryList.getGroceryList());

        // === Option 2 ===
        ArrayList<String> copyArray2 = new ArrayList<String>(betterGroceryList.getGroceryList());

        // === Option 3 (Copying from ArrayList -> normal array ===
        String[] arr = new String[betterGroceryList.getGroceryList().size()];
        arr = betterGroceryList.getGroceryList().toArray(arr);
    }
}

