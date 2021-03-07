package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.Arrays_Parts;

import java.util.Arrays;

public class ReferenceTypesVsValueTypes {
    // 102. Reference Types Vs Value Types

    // Primitive Types = Value Types (i.e. they hold a value)
    // e.g. int, double, bool

    // Reference Types = hold a reference/address to the object, BUT NOT the object itself
    // e.g. Array, String, Class

    public static void main(String[] args) {
        // === Primitive/Value Types ===
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue += 5;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        // When we create variables storing primitives, a single space in memory is allocated to store the value
        // And that variable directly holds the value.
        // If you assign it to another variable, the value is copied directly,
        // then both variables work INDEPENDENTLY (they've each got their own copy of a specific value)
        System.out.println("==========");

        // By Comparison, Reference Types, work differently
        // Whenever you see the 'new' keyword, it means we're creating a new object.

        int[] myIntArr = new int[5];
        // We're using the reference to "manipulate" the object in memory.
        // In this example, 'myIntArr' is storing a reference to the int array stored in memory
        int[] anotherIntArr = myIntArr;
        // Now we have 2 references pointing to the same array

        // Let's print the arrays
        System.out.println("myIntArray = " + Arrays.toString(myIntArr));
        System.out.println("anotherIntArr = " + Arrays.toString(anotherIntArr));

        // Let's see what happens when we make a change to one of the arrays
        anotherIntArr[0] = 1;
        myIntArr[4] = 25;
        System.out.println("myIntArray = " + Arrays.toString(myIntArr));
        System.out.println("anotherIntArr = " + Arrays.toString(anotherIntArr));

        modifyArrayInPlace(myIntArr, 1);
        modifyArrayInPlace(anotherIntArr, 3);
        System.out.println("myIntArray = " + Arrays.toString(myIntArr));
        System.out.println("anotherIntArr = " + Arrays.toString(anotherIntArr));

        // De-referencing anotherIntArr and pointing it to a new array;
        anotherIntArr = new int[] {10,20,30,40,50};
        modifyArrayInPlace(myIntArr, 0);
        modifyArrayInPlace(myIntArr, 4);
        System.out.println("myIntArray = " + Arrays.toString(myIntArr));
        System.out.println("anotherIntArr = " + Arrays.toString(anotherIntArr));
    }

    private static void modifyArrayInPlace(int[] arr, int index) {
        int randomNumber = (int) (Math.random() * 10); // I think a random number between 0-9 inclusive???
        arr[index] = randomNumber;

        // If we de-reference our arr that was passed and assign it to a new one;
        arr = new int[] {1,2,3,4,5};
        // Then that does NOT affect the original array (i.e. it doesn't become [1,2,3,4,5]) as it doesn't
        // point to the original reference anymore
    }
}
