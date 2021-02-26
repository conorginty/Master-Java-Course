package Section_5_Control_Flow_Statements;

import java.util.Scanner;

public class ProblemsAndSolutions {

    final private static String INVALID_BIRTH_YEAR_MESSAGE = "Invalid birth year entered: ";

    public static void main(String[] args) {
        // 73. Problems and Solutions

        // 2 main issues we need to handle with Scanner.nextInt() for reading in year of birth;
        // 1. users entering non-numeric characters
        // 2. users entering negative numbers

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String user_name = scanner.nextLine();

        System.out.println("And your birth year: ");
        // 1.
        boolean hasNextInt = scanner.hasNextInt();
        // Above line checks to see if the next input entered is an integer
        // However, it will NOT remove it from the scanner (i.e. it'll check if the next user input qualifies as an int)
        // Therefore, it allows us to avoid generating type errors when using nextInt()
        if (hasNextInt) {
            int user_birth_year = scanner.nextInt();

            System.out.println("Your name is: " + user_name);
            int age = 2021 - user_birth_year;

            // 2.
            if (age >= 0 && age <= 100) {
                System.out.println("This year, you are, or will be: " + age + " years old");
            } else {
                System.out.println(INVALID_BIRTH_YEAR_MESSAGE + "Birth Year outside of valid range");
            }
        } else {
            System.out.println(INVALID_BIRTH_YEAR_MESSAGE  + "Birth Year contained non-numeric characters");
        }


        scanner.close();

    }
}
