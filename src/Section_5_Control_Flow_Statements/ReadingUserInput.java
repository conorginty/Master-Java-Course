package Section_5_Control_Flow_Statements;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        // 72. Reading User Input

        // next returns a string, so allows us to store the read in input to a variable
        // Scanner uses methods like parseInt internally
        // We'll write an app that will prompt the user for 2 elements;
        // 1. their name
        // 2. their birth year

        Scanner scanner = new Scanner(System.in);
        // We've seen System.out before (which dumps text as output info to the console)
        // System.in, by contrast, allows us to read input from the console, which gets returned to the program.
        // "new" keyword allows us to create an instance (new object) of the Scanner class

        System.out.println("Enter your name: ");
        String user_name = scanner.nextLine(); // read a line of input from the console
        System.out.println("And your birth year: ");
        int user_birth_year = scanner.nextInt();

        // When we're done with the scanner, we should close it, coz then it releases the underlying memory that Scanner was using internally

        System.out.println("Your name is: " + user_name);
        int age = 2021 - user_birth_year;
        System.out.println("This year, you are, or will be: " + age + " years old");

        // N.B. - If we swapped the nextLine() and nextInt() lines, we would have a problem
        // After typing in the birth_year and pressing enter, we would NOT be prompted for a name. Why?
        // Because whenever we read a number from a scanner (int, double etc), we hit the enter key to submit our number.
        // Doing so ends the line, so it's recommended that after a call to nextInt to call nextLine again without assigning it to a variable
        // i.e. to handle the enter key issue, we need to call nextLine(), so that the scanner works as expected
        // Let's see this in action

        scanner = new Scanner(System.in);

        System.out.println("And your birth year: ");
        user_birth_year = scanner.nextInt();
        scanner.nextLine(); // needed to handle the next line character (i.e. enter key)

        System.out.println("Enter your name: ");
        user_name = scanner.nextLine(); // read a line of input from the console

        // When we're done with the scanner, we should close it, coz then it releases the underlying memory that Scanner was using internally
        scanner.close();

        System.out.println("Hi " + user_name + " who was born in " + user_birth_year);
    }
}
