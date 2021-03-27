package Section_12_JavaCollections.Sets;

public class HashSet_EqualsAndHashCode {
    // 164. HashSet - equals() and hashCode()

    // The Java docs warn you that if you're using your own objects as either a key in a map, or an element in a set,
    // then you should override the equals() and hashCode() methods.
    // If we DON'T override them, we can get into some problems...

    // N.B. - It's a common mistake to Overload the equals() method, rather than Overriding it!

    // https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-

    // The equals method implements an equivalence relation on non-null object references:

    // 1. It is reflexive: for any non-null reference value x, x.equals(x) should return true.
    // 2. It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if
    //    y.equals(x) returns true.
    // 3. It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z)
    //    returns true, then x.equals(z) should return true.
    // 4. It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently
    //    return true or consistently return false, provided no information used in equals comparisons on the objects
    //    is modified.
    // 5. For any non-null reference value x, x.equals(null) should return false.
}
