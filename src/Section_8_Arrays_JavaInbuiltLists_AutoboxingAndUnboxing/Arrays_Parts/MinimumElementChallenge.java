package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.Arrays_Parts;

import java.util.Scanner;

public class MinimumElementChallenge {
    // 103. Minimum Element Challenge

    // *** Challenge ***
    // (1) Write a method called readIntegers() with a parameter count that represents how many integers the user needs to enter
    // The method needs to read from the console until all the numbers are entered and then return an array containing the numbers entered

    // (2) write a method findMin() with the array as a parameter. This needs to return the minimum value in the array

    // in the main() method, read the count from the console and call the method readIntegers() with the count parameter

    // print the minimum number
    // **********************************************************************************************************

    // We need to set the Scanner as a static field so that static methods like main() and readIntegers()
    // will be able to access the scanner directly.
    // (i.e. the static methods can use Scanner without creating separate instances of that class)
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int length = 5;
        System.out.println("Enter the length of your desired int array: ");

        if (scanner.hasNextInt()) {
            length = scanner.nextInt();
        } else {
            System.out.println("Invalid number entered. 5 selected");
        }
        scanner.nextLine(); // Process the 'Enter' key

        int[] userIntArr = readIntegers(length);
        System.out.println("Minimum value of the user array = " + findMin(userIntArr));

        scanner.close();
    }

    public static int[] readIntegers(int length) {
        int[] arr = new int[length];

        int index = 0;
        while (index < length) {
            System.out.println("Please enter a valid number: ");
            if (scanner.hasNextInt()) {
                arr[index] = scanner.nextInt();
                index++;
            } else {
                System.out.println("Invalid number. Try again...");
            }
            scanner.nextLine(); // Process the 'Enter' key
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i=0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
