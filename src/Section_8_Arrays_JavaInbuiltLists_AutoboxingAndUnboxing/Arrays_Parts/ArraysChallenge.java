package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.Arrays_Parts;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
    // 100. Arrays (Challenge)

    // *** Challenge ***
    // Create a Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately
    // have an array with [106, 81, 26, 15, 5] in it.
    // Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
    // Implement the following methods:
    // (1) getIntegers has 1 parameter of type int which is the size of the array.
    // It returns an array of entered integers from the keyboard.
    // (2) printArray accepts an array and prints out the contents of the array.
    // It should be printed in the following format:
    //Element 0 contents 106
    //Element 1 contents 81
    //Element 2 contents 26
    //Element 3 contents 15
    //Element 4 contents 5
    // (3) sortIntegers accepts the unsorted array.
    // It should sort the array and return a new array containing the sorted numbers.
    // The scenario is:
    // 1. getIntegers() is called.
    // 2. The returned array from getIntegers() is then used to call sortIntegers().
    // 3. The returned array from sortIntegers() is then printed to the console.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] testArr = {5,4,3,2,1};
        printArray(testArr);
        System.out.println("=========");
        int[] sortedArr = sortArray_Mine(testArr, false);
        printArray(testArr);
        System.out.println("------------");
        printArray(sortedArr);
        System.out.println("**********************************");

        int[] anotherArr = {1,2,3,4,5};
        printArray(anotherArr);
        System.out.println("=========");
        int[] backwardSortedArr = sortArray_Mine(anotherArr, true);
        printArray(anotherArr);
        System.out.println("------------");
        printArray(backwardSortedArr);
        System.out.println("**********************************");

        int[] intArray = getIntegers(5);
        int[] intArraySortedBackwards = sortArray_Mine(intArray, true);
        printArray(intArray);
    }

    // (1)
    public static int[] getIntegers(int length) {
        int[] arr = new int[length];
        System.out.println("Enter " + length + " numbers");

        int i = 0;
        while (i < length) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                arr[i] = input;
                i++;
            } else {
                System.out.println("Try again: ");
            }
            scanner.nextLine();
        }
        return arr;
    }

    // (2)
    public static void printArray(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents: " + arr[i]);
        }
    }

    // (3)
    public static int[] sortArray_Mine(int[] arr, boolean backward) {
        // Make a copy of the array so we don't sort it in place
        // --- Version 1 ---
        int endPoint = arr.length;
//        int[] copyArr = new int[endPoint];
//        for (int i=0; i < endPoint; i++) {
//            copyArr[i] = arr[i];
//        }
        // --- Version 2 ---
        int[] copyArr = Arrays.copyOf(arr, endPoint);

        if (backward) {
            // Descending Bubble Sort
            for (int i=0; i < endPoint; i++) {
                for (int j=0; j < endPoint-1; j++) {
                    if (copyArr[j] < copyArr[j+1]) {
                        // System.out.println(copyArr[j] + " smaller than " + copyArr[j+1]);
                        int temp = copyArr[j+1];
                        copyArr[j+1] = copyArr[j];
                        copyArr[j] = temp;
                    }
                }
            }
        } else {
            // Ascending Bubble Sort
            for (int i=0; i < endPoint; i++) {
                for (int j=0; j < endPoint-1; j++) {
                    if (copyArr[j] > copyArr[j+1]) {
                        // System.out.println(copyArr[j] + " bigger than " + copyArr[j+1]);
                        int temp = copyArr[j+1];
                        copyArr[j+1] = copyArr[j];
                        copyArr[j] = temp;
                    }
                }
            }
        }
        return copyArr;
    }

    public static int[] sortArray_Solution(int[] array) {
        // Creating a copy of the original array
        int[] sortedArray = new int[array.length];
        for (int i=0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        // Sorting the array
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i=0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
