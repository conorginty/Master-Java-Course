package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.ListAndArrayList_Parts;

import java.util.ArrayList;

public class GroceryList {
    // Part of 105 and 106.

    // Creating a private variable for our ArrayList to store Strings (i.e. the groceries)
    private ArrayList<String> groceryList = new ArrayList<String>();
    // Notice because we have parentheses () at the end is because ArrayList is a class
    // (unlike an integer array, which is just a primitive type) I THINK THIS IS WRONG??????
    // Here we're calling an empty Constructor (Which initialises it with an empty array of size 10)

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

    // Change a grocery item at a given position to a new one
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    // Remove a grocery item from the list
    public void removeGroceryItem(int position) {
        String itemToRemove = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(itemToRemove + " removed");
    }

    // Locate an item from the Grocery List
    public String findItem_V1(String itemOfInterest) {
        // ArrayList.contains is going to be MUCH FASTER than us manually looking for the itemOfInterest by looping
        // over the ArrayList and comparing the strings that represent the items
        boolean itemExists = groceryList.contains(itemOfInterest);
        if (itemExists) {
            return itemOfInterest;
        } else {
            return null;
        }
    }

    // I think this version is better???
    public String findItem_V2(String itemOfInterest) {
        // Return the item in the grocery list
        // (so we don't only want to figure out if it's in there, we also want to return the item back)

        // .indexOf() is similar to .contains() ins that it searches the ArrayList for you, and it finds the item
        // that you've passed, and it returns the index position of the item (or -1 if it doesn't exist);
        int position = groceryList.indexOf(itemOfInterest);

        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
