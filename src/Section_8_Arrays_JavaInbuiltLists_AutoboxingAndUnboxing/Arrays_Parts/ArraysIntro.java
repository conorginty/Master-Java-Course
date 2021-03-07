package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.Arrays_Parts;

import java.util.Scanner;

public class ArraysIntro {
    // I THINK WE DEFINE SCANNER HERE SO IT AN BE USED THROUGHOUT THE CLASS (INCLUDING IN STATIC METHODS)
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 99. Arrays

        // We'll be focusing on storing multiple values of the same type using Arrays
        // Arrays are data structures that can store a sequence of values of the same type
        // This works for primitives and objects

        // Initialising an int
        int myInt = 50;

        // Initialising an array of ints
//        int[] myArrayOfInts = new int[] {1, 2, 3};
        int[] myArrayOfInts = {1, 2, 3};
        int[] myArrayOfFiveZeroes = new int[5];

        // Declaration, Initialisation and adding elements;
        double[] doubleArray;
        doubleArray = new double[5];
        doubleArray[0] = 100;
        doubleArray[4] = 500;

        // Iterating over the array to print the elements at each index
        for (int i=0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
        System.out.println("============");

        int[] intArray = new int[5];
        for (int i=0; i < intArray.length; i++) {
            intArray[i] = i+1;
            System.out.println("Value at index " + i + " = " + intArray[i]);
        }

        printArray(intArray);

        // Reading input from a User and storing them in an array
//        Scanner scanner = new Scanner(System.in);

        int arrLength = 0;
        boolean flag = true;
        while (flag) {
            System.out.print("Enter the size of your desired array: ");
            if (scanner.hasNextInt()) {
                arrLength = scanner.nextInt();
                flag = false;
            } else {
                System.out.println("Try again: ");
            }
            scanner.nextLine();
        }

        // Generate array of desired length
        int[] myArr = new int[arrLength];

        // Array of Zeroes initially
        printArray(myArr);

        int[] filledArr = fillArray(myArr);
        printArray(filledArr);

        System.out.println("The average is: " + getAverage(myArr));

        scanner.close();

        // ********************************
        // Both of these formats seem OK????
        int[] arr_V1 = new int[10];
        int arr_V2[] = new int[10];
        // ********************************
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static int[] fillArray(int[] inputArr) {
        for (int i=0; i < inputArr.length; i++) {
            System.out.print("Enter an integer: ");
            inputArr[i] = scanner.nextInt();
        }
        return inputArr;
    }

    public static double getAverage(int[] inputArr) {
        double sum = 0;
        for (int i=0; i < inputArr.length; i++) {
            sum += inputArr[i];
        }
        return sum / inputArr.length;
    }
}
