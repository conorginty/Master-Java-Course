package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.LinkedList_Parts;

import java.util.ArrayList;

public class MainArrays {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tim", 54.96);
        Customer customer2 = customer1;
        customer2.setBalance(12.18);

        System.out.println(customer2.getBalance()); // 12.18
        System.out.println(customer1.getBalance()); // 12.18

        // When we assign customer2 to customer1, Java is storing a pointer to the same memory address that customer1
        // is pointing to
        // As a result of us only saving the memory address, when we edited the balance in one of them, the effects
        // were felt by all references to it

        // It's important to be cogniscent of this to understand the advantages of LinkedLists over Arrays
        System.out.println("===========");

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        // Remember that autoboxing is happening here
        intArrayList.add(1);
        intArrayList.add(3);
        intArrayList.add(4);

        for (int i=0; i < intArrayList.size(); i++) {
            System.out.println(i + ": " + intArrayList.get(i));
        }
        System.out.println("-----");

        // Insert the element "2" at index 1
        intArrayList.add(1, 2);
        for (int i=0; i < intArrayList.size(); i++) {
            System.out.println(i + ": " + intArrayList.get(i));
        }
        System.out.println("-----");

        // N.B. - Notice how the elements from index 1 onwards had to be shifted down one place each to accommodate
        // the new element. Similarly, if you have to remove an element from the start of the array, all other items
        // have to be moved back to fill the gap
        // This is fine for small arrays like this, but with 1000's or 1,000,000's of entries, this can be problematic.

        // A Linked List is an alternative to arrays and it works by storing the link to the next/subsequent item,
        // as well as the data.
    }
}
