package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.ListAndArrayList_Parts;

import java.util.ArrayList;

public class BetterGroceryList {
    // Part of 105 and 106.

    // Creating a private variable for our ArrayList to store Strings (i.e. the groceries)
    private ArrayList<String> groceryList = new ArrayList<String>();
    // Notice because we have parentheses () at the end is because ArrayList is a class
    // (unlike an integer array, which is just a primitive type) I THINK THIS IS WRONG??????
    // Here we're calling an empty Constructor (Which initialises it with an empty array of size 10)

    // *** Adding a Getter here ***
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    // Add to the ArrayList
    public void addGroceryItem(String item) {
        groceryList.add(item);
        // Automatically adds the item to the ArrayList to the correct location, the amount of space to allocate it etc
        // (i.e. this level of detail is abstracted away from us)
    }

    // Print the elements
    public void printGroceryList() {
        // ArrayList.size() returns the number of elements in the ArrayList
        System.out.println("You have " + groceryList.size() + " items in your Grocery List");
        for (int i=0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    // ************************************************************************************************************
    // Making better, overloaded versions of modifyGroceryItem() and removeGroceryItem() that DOESN'T require knowledge
    // of where the elements are kept in the ArrayList;

    // Change a grocery item at a given position to a new one
    // === BAD ===
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    // === HELPER OVERLOADED METHOD ===
    public void modifyGroceryItem(String currentItem, String newItem) {
        int index = findItem(currentItem);
        if (index >= 0) {
            modifyGroceryItem(index, newItem);
        }
    }

    // Remove a grocery item from the list
    // === BAD ===
    private void removeGroceryItem(int position) {
        String itemToRemove = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(itemToRemove + " removed");
    }

    // === HELPER OVERLOADED METHOD ===
    public void removeGroceryItem(String itemToRemove) {
        int index = findItem(itemToRemove);
        if (index >= 0) {
            removeGroceryItem(index);
        }
    }

    // ANOTHER HELPER (That makes this possible)
    // Locate an item from the Grocery List
    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
    // ************************************************************************************************************

    // Check if item of interest exists in the grocery list
    public boolean existsInList(String searchItem) {
        int index = findItem(searchItem);
        return index >= 0;
    }
}
