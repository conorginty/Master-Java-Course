package Section_5_Control_Flow_Statements.Coding_Exercises;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (!(scanner.hasNextInt())) {
            count = 1; // just so we can get a result of 0 for average
        }

        while (scanner.hasNextInt()) {
            int input_num = scanner.nextInt();
            sum += input_num;
            count++;

            System.out.print("Enter a number: ");
        }

        scanner.close();

        System.out.println("Total sum of numbers = " + sum);
        System.out.println("Average of numbers = " + (double) sum/count);
    }
}
