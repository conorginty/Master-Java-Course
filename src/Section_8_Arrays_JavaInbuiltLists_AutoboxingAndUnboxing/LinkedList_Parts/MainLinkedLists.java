package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.LinkedList_Parts;

import java.util.*;

public class MainLinkedLists {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printLinkedList(placesToVisit);

        // Adding a record
        placesToVisit.add(1, "Alice Springs");
        printLinkedList(placesToVisit);

        // Removing a record
        placesToVisit.remove(4);
        printLinkedList(placesToVisit);

        // N.B. - Writing methods with side effects (e.g. using .next()) is generally to be avoided
        // So unless you really know what you are doing, it's not a good idea to write a method that both
        // returns a value and changes the object that it's called from
        // (and this is what's happening in the "addInOrder()" method we created)

        LinkedList<String> groceryList = new LinkedList<String>();
        groceryList.add("Apple");
        groceryList.add("Bread");
        groceryList.add("French Dressing");
        groceryList.add("Haloumi");
        groceryList.add("Jam");
        groceryList.add("Oranges");
        groceryList.add("Peanuts");

        printLinkedList(groceryList);

        ArrayList<String> itemsToInclude = new ArrayList<String>();
        itemsToInclude.add("Chocolate");
        itemsToInclude.add("Toilet Roll");
        itemsToInclude.add("Baby Wipes");
        itemsToInclude.add("Alcohol");
        itemsToInclude.add("Chestnuts");
        itemsToInclude.add("Baby Wipes");
        itemsToInclude.add("Zuccini");
        itemsToInclude.add("Chocolate");

        for (int i=0; i < itemsToInclude.size(); i++) {
            String current = itemsToInclude.get(i);
            addInOrder(groceryList, current);
        }

        printLinkedList(groceryList);

        // Evidently, Linked Lists are great when we need to constantly insert elements in a sorted order regularly

        // We can go back and forth in a LinkedList because Java has implemented the LinkedList as a
        // Doubly Linked List (i.e. stores a reference to the previous and next item)
        // We'll implement that now
        visit(groceryList);
    }

    private static void printLinkedList(LinkedList<String> inputLinkedList) {
        // Going to use the concept of an Iterator, which is another way of going through and accessing
        // all entries that are in a particular array, ArrayList, LinkedList etc
        Iterator<String> i = inputLinkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList<String> inputLinkedList, String newEntry) {
        // Create an List Iterator (gives you more flexibility than a traditional iterator)
        // Useful for the problem we're trying to solve here.
        ListIterator<String> stringListIterator = inputLinkedList.listIterator(); // N.B. - This is NOT pointing to the 1st record yet
        // Logic
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newEntry); // After .next(), NOW it is pointing to the 1st record.
            // 0 = both elements are equal
            // > 0 =
            // < 0 =
            if (comparison == 0) {
                // Do not add
                System.out.println(newEntry + " already in the input Linked List");
                return false;
            } else if (comparison > 0) {
                // entry should appear before the current element
                stringListIterator.previous(); // go back a previous step (this is NOT possible with normal iterators)
                stringListIterator.add(newEntry);
                return true;
            } else if (comparison < 0) {
                // Move onto the next entry
            }
        }
        // Add it at the very end
        stringListIterator.add(newEntry);
        return true;
    }

    private static void visit(LinkedList<String> inputLinkedList) {
        ListIterator<String> listIterator = inputLinkedList.listIterator();

        if (inputLinkedList.isEmpty()) {
            System.out.println("No elements in the LinkedList");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; // To track the direction

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine(); // clear input buffer
            switch (action) {
                case 0:
                    System.out.println("Finished going through the Linked List");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        // Test the ability to go to next element
                        if (listIterator.hasNext()) {
                            // Go to the next element
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting: " + listIterator.next());
                    } else {
                        System.out.println("Reached the END of the Linked List");
                    }
                    break;
                case 2:
                    if (goingForward) {
                        // Test the ability to go to previous element
                        if (listIterator.hasPrevious()) {
                            // Go to the previous element
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now going back to: " + listIterator.previous());
                    } else {
                        System.out.println("Reached the START of the Linked List");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions: ");
        System.out.println("press: ");
        System.out.println("\t 0 - to quit");
        System.out.println("\t 1 - go to next city");
        System.out.println("\t 2 - go to previous city");
        System.out.println("\t 3 - print menu options");
    }
}









