package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.Arrays_Parts;

import java.util.Arrays;

public class ReverseArrayChallenge {
    // 104. Reverse Array Challenge

    // *** Challenge ***
    // Write a method called reverse() with an int array as a parameter
    // This method should NOT return any value. It should just modify the array parameter (i.e. in place!)
    // In main() test the reverse() methods by testing the original array before and after being passed into the method

    public static void main(String[] args) {
        int[] testArr = new int[] {45, 23, 12, 50, 8};
        System.out.println("Original Array " + Arrays.toString(testArr));
        // Naive Approach
        int[] naiveReversed = naiveReverse(testArr);
        System.out.println("Reversed NOT in place: " + Arrays.toString(naiveReversed));
        System.out.println("==============");

        System.out.println("Original Array " + Arrays.toString(testArr));
        betterReverse(testArr);
        System.out.println("Reversed IN PLACE: " + Arrays.toString(testArr));
    }

    public static int[] naiveReverse(int[] arr) {
        // My exhaustive solution (works at O(n) OR MAYBE O(2n)???)

        // 1st create default array of same length as input array
        int[] reversed = new int[arr.length];

        int index = 0;
        // Then loop over to reverse the elements (O(n))
        for (int i=arr.length-1; i >= 0; i--) {
            reversed[i] = arr[index];
            index++;
        }
        return reversed;
    }

    public static void betterReverse(int[] arr) {
        // Reverses the array in place at O(n/2) I THINK???

        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            // increase start and decrease end
            start++;
            end--;
        }
    }
}
