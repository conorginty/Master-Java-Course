package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts.Challenge.Solution;//package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts.Challenge.MyAttempt;

public class MyLinkedList implements NodeList {
    private ListItem head = null;

    @Override
    public ListItem getHead() {
        return head;
    }

    // We need to check for an emtpy listitem first, then add a new item as the head of the list if it
    // was empty, but if the list wasn't empty, then we need to compare each item in the list with a new item
    // to work out where the next item should be inserted
    @Override
    public boolean addItem(ListItem newItem) {
        if (newItem == null) {
            return false;
        }
        if (head == null) {
            // The list was empty, so this item becomes the head
            head = newItem;
            return true;
        }
        ListItem currentItem = head;
        while (currentItem != null) {
            // Compare
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // newItem is Greater, so move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // We've reached the end, so insert at the end of the list
//                    currentItem.setNext(newItem);
//                    newItem.setPrevious(currentItem);
                    currentItem.setNext(newItem).setPrevious(currentItem); // Same as 2 lines above
                    // Reducing the amount of code is based on setNext() and setPrevious() returning the set
                    // item, but I prefer the 2 lines of code instead (it's more clear)
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, so insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    // The node without the previous element is the head
//                    newItem.setNext(currentItem);
//                    currentItem.setPrevious(newItem);
                    newItem.setNext(head);
                    head.setPrevious(newItem);
                    head = newItem;
                }
                return true;
            } else {
                // They're equal
                System.out.println(newItem.getValue() + " is already present. Not added.");
                return false;
            }
        }
        // We'll never hit here...
        return false;
    }

    // Traverse the LL until we find the item to be removed
    // Then we set the previous link to point to where our item to be deleted points
    @Override
    public boolean removeItem(ListItem itemToDelete) {
        if (itemToDelete != null) {
            System.out.println("Attempting to delete item: " + itemToDelete.getValue());
        }
        ListItem current = head;
        while (current != null) {
            int comparison = current.compareTo(itemToDelete);
            if (comparison == 0) {
                // found the item to delete
                if (current == head) {
                    head = current.next();
                } else {
                    current.previous().setNext(current.next());
                    if (current.next() != null) {
                        current.next().setPrevious(current.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                // We haven't found the item of interest, so continue navigating through
                current = current.next();
            } else {
                // Comparison > 0, so we've gone past the point where we could've deleted the node (coz the List is in order)
                System.out.println("Item: " + itemToDelete.getValue() + " not in the list");
                return false;
            }
        }
        // We've reached the end without finding the item
        return false;
        // My Attempt below;
//        if (head == null) {
//            System.out.println("The list is empty");
//            return false;
//        } else if (itemToDelete == head) {
//            head = head.next();
//            head.setPrevious(null);
//            return false;
//        }
//        ListItem current = head;
//        while (current != null) {
//            if (current == itemToDelete) {
//                current.previous().setNext(current.next());
//                current.next().setPrevious(current.previous());
//                return true;
//            }
//        }
    }

    @Override
    public void traverse(ListItem head) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        ListItem current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.next();
        }
        // === Recursive Variant (but NOT a good idea as recursive call stack could get HUGE) ===
//        if (head != null) {
//            System.out.println(head.getValue());
//            traverse(head.next());
//        }
        // HOWEVER, Binary Trees DO lend themselves well to recursion (e.g. coz if you have 63 nodes depth,
        // that'll be a max 63 recursive calls, but for a LL that would be 9,000,000,000,000,000,000 nodes!!!)
        System.out.println("===== DONE =====");
    }
}
