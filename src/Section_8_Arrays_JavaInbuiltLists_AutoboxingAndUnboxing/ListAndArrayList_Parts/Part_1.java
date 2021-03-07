package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.ListAndArrayList_Parts;

public class Part_1 {
    // 105. List and ArrayList

    // We can see in the class 'ResizingArrays' a way of manually resizing arrays
    // We do this by getting a copy of the original array (i.e. creating a new reference to it)
    // Then we dereference the original array by assigning it a new reference to a longer array
    // Evidently this is quite labour-intensive and inefficient

    // However, there is a better way to access arrays: Lists and Array Lists

    // List = effectively another way of looking at an array
    // List is an Interface and extends the Collection Interface
    // It is an ordered collection (aka a sequence). The user of this interface has precise control over where in the list each element is inserted

    // ArrayList inherits from AbstractList (which in turn implements the List interface)
    // ArrayLists are re-sizable arrays (i.e. it handles resizing automatically internally)
    // Not only does it maintain the size (i.e. how many elements), but also the capacity (i.e. how much memory is reserved)
    // As elements are added to an ArrayList, its capacity grows automatically
    // However, (AS FAR AS I CAN TELL BY GOOGLING), their size does NOT shrink dynamically as elements are removed.
    // When defining an ArrayList, notice that the autocomplete dropdown suggests: ArrayList<E>
    // What this basically means is that when we declare an ArrayList, we're NOT defining the type
    // (by contrast to an array, where we have to say it's storing ints (int[]), doubles (double[]), etc)
    // The reason we don't do this for ArrayLists is because they can store Objects, so we need to say what kind
    // of data is going into the ArrayList (i.e. the <E>)

    public static void main(String[] args) {

    }
}
