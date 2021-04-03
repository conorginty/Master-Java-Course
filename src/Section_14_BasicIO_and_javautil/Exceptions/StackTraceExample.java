package Section_14_BasicIO_and_javautil.Exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StackTraceExample {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
//        } catch (NoSuchElementException e) {
        } catch (ArithmeticException | NoSuchElementException e) { // Bitwise OR to handle multiple exceptions in 1 catch
            System.out.println(e.toString());
            System.out.println("Unable to perform division... Shutting down...");
        }
    }

    private static int divide() {
        int numerator;
        int denominator;
        try {
//            numerator = getInt();
//            denominator = getInt();
            numerator = getIntBetter();
            denominator = getIntBetter();
            System.out.println("Numerator is: " + numerator);
            System.out.println("Denominator is: " + denominator);
            return numerator / denominator;
        } catch (NoSuchElementException e) {
//            numerator = getIntBetter(); // BAD IDEA AS CAN ALSO LEAD TO EXCEPTIONS (e.g. cmd+d closes the input stream, so this will fail!!!)
//            denominator = getIntBetter(); // BAD IDEA AS CAN ALSO LEAD TO EXCEPTIONS (e.g. cmd+d closes the input stream, so this will fail!!!)
            throw new NoSuchElementException("No suitable input");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Attempted to divide by Zero");
        }
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        return scanner.nextInt();
    }

    private static int getIntBetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        // N.B. - Doing cmd+d forces a NoSuchElementException
        // We need to be able to catch BOTH InputMismatchException AND NoSuchElementException
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                // Ask them again...
                scanner.nextLine(); // Clear the buffer
                System.out.println("Invalid number entered. Try again");
            }
        }
    }
}
