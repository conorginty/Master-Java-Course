package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts.Challenge.Solution;

// 135. Abstract Class Challenge Part 3

// Search trees are very similar to Linked Lists, but the differences are mainly in the implementations
// of the add item, remove item and traverse methods

// N.B. - NodeList uses head instead of root nomenclature (to suit LLs) - may need to change this
// N.B. - Instead of "root" I will use "head" to mean the root!!!!!!!! (to suit what we've already done)
public class SearchTree implements NodeList {
    private ListItem head = null;

    @Override
    public ListItem getHead() {
        return head;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (head == null) {
            // The tree is empty, so our item becomes the head (root) of the tree
            head = newItem;
            return true;
        }
        // Otherwise, start comparing from the head/root of the tree
        ListItem current = head;
        while (current != null) { // Could also do "while (true)" here
            int comparison = current.compareTo(newItem);
            if (comparison < 0) {
                // newItem is greater, so move right if possible
                if (current.next() != null) {
                    // Move to the right one step
                    current = current.next();
                } else {
                    // There's no node to the right, so add at this point
                    current.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, so move left if possible
                if (current.previous() != null) {
                    // Move to the left one step
                    current = current.previous();
                } else {
                    // There's no node to the left, so add at this point
                    current.setPrevious(newItem);
                    return true;
                }
            } else {
                // Equal, so don't add
                System.out.println(newItem.getValue() + " is already present in the tree");
                return false;
            }
        }
        // Will never get here (I THINK???)
        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToDelete) {
        if (itemToDelete != null) {
            System.out.println("Attempting to delete: " + itemToDelete.getValue() + " from the tree");
        }
        ListItem current = head;
        ListItem parent = current;

        while (current != null) {
            int comparison = current.compareTo(itemToDelete);
            if (comparison < 0) {
                // itemToDelete is greater -> go down right subtree if possible
                parent = current;
                current = current.next();
            } else if (comparison > 0) {
                // itemToDelete is smaller -> go down left subtree if possible
                parent = current;
                current = current.previous();
            } else {
                // Equal - We've found the item, so remove it
                performRemoval(current, parent);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem child, ListItem parent) {
        // Remove item from the tree
        if (child.next() == null) {
            // No right tree, so make parent point to the left tree (which may be null)
            if (parent.next() == child) {
                // child is right child of its parent
                parent.setNext(child.previous());
            } else if (parent.previous() == child) {
                // child is left child of its parent
                parent.setPrevious(child.previous());
            } else {
                // parent must be the item, which means we were looking at the head/root of the tree
                head = child.previous();
            }
        } else if (child.previous() == null) {
            // No left tree, so make parent point to the right tree (which may be null)
            if (parent.next() == child) {
                // child is right child of its parent
                parent.setNext(child.next());
            } else if (parent.previous() == child) {
                // child is left child of its parent
                parent.setPrevious(child.next());
            } else {
                // parent must be the item, which means we were looking at the head/root of the tree
                head = child.next();
            }
        } else {
            // Neither left nor right are null, deletion is now a LOT trickier!
            // From the right sub-tree, find the smallest value (i.e. leftmost)
            ListItem current = child.next();
            ListItem leftmostParent = child;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            child.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == child) {
                // There was no leftmost node, so 'current' points to the smallest node (the 1 that must now be deleted)
                child.setNext(child.next());
            } else {
                // set the smallest node's parent to point to the smallest node's right child (which may be null)
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    // Recursive methods
    @Override
    public void traverse(ListItem head) {
        ListItem current = head;
        if (current != null) {
            traverse(current.previous()); // Left (This keeps getting called until we reach the left-most leaf
            System.out.println(current.getValue());
            traverse(current.next()); // Right
        }
    }
}
