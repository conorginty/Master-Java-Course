package Section_5_Control_Flow_Statements;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        // 74. Reading User Input Challenge

        // - Read 4 numbers from the console entered by the user and print the sum of those numbers
        // - Create an instance of Scanner
        // - Use the hasNextInt() method from the scanner to check if the user has entered an int value
        // - If invalid input entered, print an appropriate error message and continue reading until you have 4 nums
        // - print a message which states: "Enter number #X" where "X" is the current count.

        int sum = 0;
        int valid_num_counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (valid_num_counter < 4) {
            System.out.println("Enter Number #" + (valid_num_counter+1) + ":");
            if (scanner.hasNextInt()) {
                int input_num = scanner.nextInt();
                sum += input_num;
                valid_num_counter++;
            } else {
                System.out.println("Invalid Number, try again...");
            }
            scanner.nextLine();
        }

        scanner.close();

        System.out.println("Total valid numbers entered: " + valid_num_counter);
        System.out.println("Total sum of numbers entered = " + sum);
    }
}
