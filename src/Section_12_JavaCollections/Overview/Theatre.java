package Section_12_JavaCollections.Overview;

import java.util.*;

public class Theatre {
    private final String theatreName;
//    private List<Seat> seats = new ArrayList<>();
    // Can comment the above line and change to a LinkedList instead, and the code will still work fine;
//    private List<Seat> seats = new LinkedList<>();
    // We can be even more generic and change from list to a collection
//    private Collection<Seat> seats = new LinkedList<>();
    // The advantage of this is that it enables us to use any of the collection classes to hold our seats
    // Let's show that other Collection subclasses also work;
//    private Collection<Seat> seats = new HashSet<>(); // But note that the order of seats when we print them are NOT necessarily in order
//    private Collection<Seat> seats = new LinkedHashSet<>(); // However, this IS in order
    // If we try using a TreeSet (which is 1 level below Set, List etc), we'll get an error
//    private Collection<Seat> seats = new TreeSet<>(); // ClassCastException (because TreeSets require Comparable to be implemented, in order to sort the set, BUT we DIDN'T make the Seat class comparable)
    // Let's go back to an ArrayList and change it to a List...
//    private List<Seat> seats = new ArrayList<>();
    public List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows-1);
        // Create rows A - (potentially) Z
        for (char row='A'; row <= lastRow; row++) {
            // Allocate seats for that section (01 - XX)
            for (int seatNum=1; seatNum <= seatsPerRow; seatNum++) {
                // Create seat object (with a seat num like "B21" or "D07")
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                // Add it to the seats arraylist
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        for (Seat seat: seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                return seat.reserve();
            }
        }
        System.out.println("There is no seat: " + seatNumber);
        return false;
    }

    // More efficient version of reserveSeat (implements Binary Search method from Collections);
    public boolean binaryReserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat: " + seatNumber);
            return false;
        }
    }

    // Showing how Binary Search is implemented in practice
    public boolean binaryReserveSeat_FullCode(String seatNumber) {
        int lowIndex = 0;
        int highIndex = seats.size()-1;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            Seat midSeat = seats.get(midIndex);
            int compareResult = midSeat.getSeatNumber().compareTo(seatNumber);

            if (compareResult < 0) {
                // Then the target is bigger than midpoint value
                lowIndex = midIndex + 1;
            } else if (compareResult > 0) {
                // Then the target is less than midpoint value
                highIndex = midIndex - 1;
            } else {
                return seats.get(midIndex).reserve();
            }
        }
        System.out.println("There is no seat: " + seatNumber);
        return false;
    }

    public void printSeats() {
        for (Seat seat: seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        // N.B. - This ordering IS consistent with equals (as seatNumber is unique in Seats)
        @Override
        public int compareTo(Seat otherSeat) {
            // We use the compareToIgnoreCase method from the String class
            return seatNumber.compareToIgnoreCase(otherSeat.getSeatNumber());
            // returns a number >, < or == 0
            // By overriding compareTo of Comparable, we can now use a special set for our searching purposes
            // which is a lot more efficient:
        }

        public boolean reserve() {
            if (!reserved) {
                reserved = true;
                System.out.println("Seat: " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (reserved) {
                reserved = false;
                System.out.println("Reservation for Seat: " + seatNumber + " was cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}










