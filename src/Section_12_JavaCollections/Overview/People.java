package Section_12_JavaCollections.Overview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Implemented this myself to try to understand part 156 - Comparable and Comparator
public class People {
    private List<Person> group = new ArrayList<>();

    // Anonymous Inner Class implementing Comparator
    static final Comparator<Person> GROUP_ORDER = new Comparator<Person>() {
        @Override
        public int compare(Person person1, Person person2) {
        // N.B. - This ordering is NOT consistent with equals (as 2 Persons can have the same first name, BUT be different Persons)
            String p1FirstName = person1.getFirstName();
            String p2FirstName = person2.getFirstName();
            return p1FirstName.compareTo(p2FirstName);
        }
    };

    public List<Person> getGroup() { return group; }

    public void printGroup() {
        for (Person person: group) {
            System.out.println(person);
        }
    }

    // === Inner Class ===
//    public class Person implements Comparable<Person> {
    public class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            group.add(this);
        }

        private String getFirstName() { return firstName; }
        private String getLastName() { return lastName; }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }

//        @Override
//        public int compareTo(Person other) {
//            String p1FirstName = this.getFirstName();
//            String p2FirstName = other.getFirstName();
//            return p1FirstName.compareTo(p2FirstName);
//        }
    }
}
