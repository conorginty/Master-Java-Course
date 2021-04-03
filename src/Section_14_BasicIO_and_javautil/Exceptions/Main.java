package Section_14_BasicIO_and_javautil.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(divideLBYL(10, 2));
        System.out.println(divideEAFP(10, 2));
        System.out.println("-----");
        System.out.println(divideLBYL(5, 0));
        System.out.println(divideEAFP(5, 0));
        System.out.println("============");

        int eg1 = getIntNaive();
        System.out.println("Value of eg1 = " + eg1);
        int eg2 = getIntLBYL();
        System.out.println("Value of eg2 = " + eg2);
        int eg3 = getIntEAFP();
        System.out.println("Value of eg3 = " + eg3);

    }

    // --- Look Before You Leap approach (more common in Java) ---
    private static int divideLBYL(int numerator, int denominator) {
        // Check to see if the denominator is 0 before performing any processing
        if (denominator != 0) {
            return numerator / denominator;
        }
        return 0;
    }

    // --- Easy to Ask for Forgiveness than Permission ---
    private static int divideEAFP(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    // =============================================================

    // Naive Approach (NO exception/error handling used)
    private static int getIntNaive() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntLBYL() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String strInput = scanner.next();
        // Iterate over the stringified input and check that each character is a number
        for (int i=0; i < strInput.length(); i++) {
            if (! Character.isDigit(strInput.charAt(i))) {
                return 0;
            }
        }
        return Integer.parseInt(strInput);
    }

    // More elegant solution;
    private static int getIntEAFP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
}
