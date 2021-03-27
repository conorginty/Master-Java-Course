package Section_12_JavaCollections.Overview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre olympian = new Theatre("Olympian", 8, 12);
        olympian.printSeats();

        if (olympian.reserveSeat("H11")) {
            System.out.println("Seat reserved successfully.");
        } else {
            System.out.println("Sorry, seat is already taken.");
        }

        // Trying to book it again (should fail, which it does)
        if (olympian.reserveSeat("H11")) {
            System.out.println("Seat reserved successfully.");
        } else {
            System.out.println("Sorry, seat is already taken.");
        }
        System.out.println("==================");

        // === Implementing Binary Search method to reserve a seat (part of 154) ===

        if (olympian.reserveSeat("H12")) {
            System.out.println("Seat reserved successfully.");
        } else {
            System.out.println("Sorry, seat is already taken.");
        }

        // Trying to book it again (should fail, which it does)
        if (olympian.binaryReserveSeat("H12")) {
            System.out.println("Seat reserved successfully.");
        } else {
            System.out.println("Sorry, seat is already taken.");
        }
        System.out.println("==================");

        // === (part of 155) ===

        // We'll now create a new Array of Seat objects and if we pass in the existing seats from our theatre
        // object, we'll get a new list containing all the seats

        List<Theatre.Seat> seatListCopy = new ArrayList<>(olympian.seats);
        printList(seatListCopy);

        // The seatListCopy contains all of the elements that were in the original. The method we used to create
        // the seatListCopy and populate it with all the elements was a Shallow Copy
        // This means that an ArrayList containing all the elements from the list that were passed to the
        // Constructor was created,
        // N.B. - Note that these are NOT copied (meaning that if we modify elements in one list (e.g. reserve
        // a seat) then this will also affect the other list (As the elements are effectively the same shared objects)

        // Proof (These are pointing to the same elements)
        System.out.println(olympian.seats.get(18).getSeatNumber());
        System.out.println(seatListCopy.get(18).getSeatNumber());

        olympian.seats.get(18).reserve(); // Success
        seatListCopy.get(18).reserve(); // Failure (as trying to reserve the same seat)

        // === Reversing a List ===
        System.out.println("=== Reversing a List ===");
        Collections.reverse(seatListCopy);
        printList(seatListCopy); // changed to reverse order
        printList(olympian.seats); // remains in original order

        // N.B. - Evidently these are separate ArrayLists, BUT they refer to the same objects that were
        // initially created.
        // Therefore, the same logic applies if we shuffle a list (i.e. it won't affect the order of the shallow copy)

        // === Shuffling a List ===
        System.out.println("=== Shuffling a List ===");
        Collections.shuffle(olympian.seats);
        printList(seatListCopy); // remains in reverse order
        printList(olympian.seats); // changed to shuffled order

        // === Returning Minimum element from a List ===
        Theatre.Seat minSeat = Collections.min(seatListCopy);
        System.out.println("Min seat number = " + minSeat.getSeatNumber());

        // === Returning Maximum element from a List ===
        Theatre.Seat maxSeat = Collections.max(olympian.seats);
        System.out.println("Max seat number = " + maxSeat.getSeatNumber());

        // === Sorting the List in Order (with our Bubble Sort variant) ===
        sortList(seatListCopy);
        System.out.println("Sorted seatListCopy;");
        printList(seatListCopy);

        // We'll look at an odd Copy method, that's provided by the Collections class.
        // It takes 2 parameters: the Destination and Source list. The Destination has to be of Generic type
        // that is a superset of the Source list (i.e. it can be a Collection, Iterable or List) and the Source
        // MUST be a list. The problem that tends to arise with the Collections copy method is that people expect
        // to use it to create a Shallow or Deep copy of the list.
        // A Deep Copy is a copy where the Elements are NOT just references to the same Elements as in the
        // Original List, BUT are themselves copied (unlike a Shallow Copy).
        // The Collections.copy() method will fail unless the Destination is big enough to hold all the elements
        // to be copied into it. This leads to people making the following common mistake;

//        List<Theatre.Seat> newList = new ArrayList<>(olympian.seats.size());
//        Collections.copy(newList, olympian.seats);

        // The reason is that ln103 only sets the capacity of the ArrayList, giving it the potential to hold
        // that many elements, but initially containing none (so it doesn't actually create a list of elements)
        // So, to get the copy to work, you actually need to have 96 Seat objects in the list we created on
        // ln103 before we can attempt the copy. Therefore it's hard to think of an actual use for the
        // Collections.copy() method that would allow all of the elements of a list to be copied into another
        // Collections object, provided the object had been initialised by enough elements 1st, and that's
        // probably why it was included (I DON'T GET THIS AT ALL???)

        System.out.println("======================================");
        // ============================================================================

        People group1 = new People();
        People.Person johnSmith = group1.new Person("John", "Smith");
        People.Person jamesSutherland = group1.new Person("James", "Sutherland");
        People.Person jimSouth = group1.new Person("Jim", "South");

        System.out.println(group1.getGroup().size());

//        for (People.Person person: group1.getGroup()) {
//            System.out.println(person);
//        }
        group1.printGroup();
        System.out.println("-----------");

        // Creating a Copy of the Group (optional)
//        List<People.Person> group1Copy = new ArrayList<>(group1.getGroup());

        Collections.sort(group1.getGroup(), People.GROUP_ORDER);
        group1.printGroup();
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat: list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=================================================");
    }

    // Variant of Bubble Sort method
//    public static void sortList(List<Theatre.Seat> list) {
    public static void sortList(List<? extends Theatre.Seat> list) { // "? extends" makes the argument generic, so that it can be any kind of list of Theatre seats, so long as they implement the Comparable Interface
        for (int i=0; i < list.size()-1; i++) {
            for (int j=i+1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    // Then swap them
                    Collections.swap(list, i, j); // (pass in list and 2 indexes)
                }
            }
        }
    }
}
