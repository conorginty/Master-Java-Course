package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.ListAndArrayList_Parts;

import java.util.Arrays;
import java.util.Scanner;

public class ResizingArrays {
    // Part of 105.

    // Showing how to preserve data when resizing an array (i.e. to a bigger capacity)

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[4];

    public static void main(String[] args) {
        System.out.println("Enter " + baseData.length + " ints:");
        getInput();
        printArray(baseData);
        resizeArray();
        printArray(baseData); // Printing the resized array
        System.out.println("----------");
        System.out.println("Enter " + baseData.length + " ints:");
        getInput();
        printArray(baseData);

        System.out.println("====================");
        int[] test = new int[] {1,2,3,4,5};
        int [] copy = test;
        System.out.println("Original array = " + Arrays.toString(test));
        System.out.println("Copy array = " + Arrays.toString(test));

        test[0] = 1000; // This updates BOTH test AND copy
        System.out.println("Original array = " + Arrays.toString(test));
        System.out.println("Copy array = " + Arrays.toString(test));
    }

    private static void getInput() {
        for (int i=0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }

    private static void printArray(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray() {
        // Taking a copy of the original baseData array
        int[] original = baseData;

        // Dereference baseData from original reference and reference new, longer array
        baseData = new int[6];
        // Then assign old variables to the extended baseData
        for (int i=0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }
}
