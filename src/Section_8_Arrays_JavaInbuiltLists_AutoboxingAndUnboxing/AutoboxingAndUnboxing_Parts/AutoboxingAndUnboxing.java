package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.AutoboxingAndUnboxing_Parts;

import java.util.ArrayList;

// Creating a class to represent an int primitive so we can store it in an ArrayList
class IntClass {
    private int intValue;

    public IntClass(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }
}

public class AutoboxingAndUnboxing {
    // 112. Autoboxing and Unboxing

    public static void main(String[] args) {
        // We've seen how to work with Arrays
        String[] strArray = new String[10];
        int[] intArr = new int[10];

        // And ArrayLists
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        // BUT we CAN'T do the following;
        // ArrayList<int> = new ArrayList<int>(); // Error message: Type argument cannot be of primitive type
        // We need a class reference to be able use it to save something to an ArrayList
        // So, we CAN do the following with our newly created IntClass;
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // However, it's a little messy as there's all this extra constructor code, getters etc that we'd need to create 1st
        // It turns out that there is an easier way to do this whereby we can pass primitive types as classes
        // This is called: Autoboxing
        // Java supports this by allowing for object wrappers of primitives (just like we saw for IntClass)
        // But, also, Java has a lot of this in-built - and we've seen this before with Integer and Double classes

        Integer integer = new Integer(20);
        // N.B. - The difference between Integer and int, is that Integer is a class (or int wrapper), and int is a primitive

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        // Let's now add entries to this ArrayList of Integers;
        for (int i=0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); // Converting the primitive int (i) to the class Integer (wrapping it)
            // This is known as Autoboxing (i.e. primitive =wrapping=> Class)
        }

        // Printing the values
        for (int i=0; i <= 10; i++) {
            System.out.println("Index: " + i + " -> " + intArrayList.get(i).intValue());
            // This is known as Unboxing (i.e. Class =unwrapping=> primitive)
            // Below is the equivalent (Java makes conversion under the hood)
            System.out.println("Index: " + i + " -> " + intArrayList.get(i)); // .intValue()
            System.out.println("=========");
        }

        // Java makes it really easy to create code to convert using Autoboxing and Unboxing
//        Integer myIntValue = new Integer(56); // Unnecessary boxing 'new Integer(56)'
        Integer myIntValue = 56; // at compile time, this line gets converted to -> Integer.valueOf(56);
        // We can then also do this;
        int myInt = myIntValue; // Java is effectively converting myIntValue under the hood -> myInt.intValue();

        // Another example to try make it make sense
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl=0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i=0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println("Index " + i + " => " + value);
        }
    }
}
