package Section_5_Control_Flow_Statements;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        // 75. Min and Max Challenge

        // Read the numbers from the console entered by the user and print out the minimum and maximum number they entered

        int number_counter = 0;
        int min = Integer.MAX_VALUE; // Start at MAX_VALUE, so more likely that user will enter a smaller number
        int max = Integer.MIN_VALUE; // Start at MIN_VALUE, so more likely that user will enter a bigger number

        Scanner scanner = new Scanner(System.in);

        while (number_counter < 5) {
            System.out.print("Enter a number: "); // print, rather than println, to make sure we enter number on same line

            if (scanner.hasNextInt()) {
                int num_input = scanner.nextInt();

                if (num_input < min) {
                    min = num_input;
                }
                if (num_input > max) {
                    max = num_input;
                }
                number_counter++;

            } else {
                System.out.println("Invalid number entered. Try again...");
            }
            scanner.nextLine();
        }

        scanner.close();

        System.out.println("Final minimum number was: " + min);
        System.out.println("Final maximum number was: " + max);
    }
}
