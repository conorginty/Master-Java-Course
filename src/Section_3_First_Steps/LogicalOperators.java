package Section_3_First_Steps;

public class LogicalOperators {
    public static void main(String[] args) {
        // 36. Logical AND Operator

        int your_score = 100;
        if (your_score == 100) {
            System.out.println("You scored 100!");
        }

        if (your_score != 100) {
            System.out.println("You did NOT score 100!");
        }

        if (your_score > 100) {
            System.out.println("You scored MORE THAN 100");
        }

        if (your_score < 100) {
            System.out.println("You scored LESS THAN 100");
        }

        int second_score = 60;
        // Version 1: Without parentheses (less readable)
        if (your_score > second_score && your_score >= 100) {
            System.out.println("You beat the 2nd score AND your score was greater than, or equal to, 100!!!");
        }

        // Version 2: With parentheses (more readable)
        if ((your_score > second_score) && (your_score >= 100)) {
            System.out.println("You beat the 2nd score AND your score was greater than, or equal to, 100!!!");
        }

        // AND operator comes in 2 flavours in Java;
        // 1. && (logical AND): Operates on boolean operands (checking if condition is true/false)
        // 2. & (Bitwise AND): Works at the Bit Level

        // 37. Logical OR Operator
        int small_number, big_number;
        small_number = 5;
        big_number = 100;

        if ((small_number < 2) || (big_number > 50)) {
            System.out.println("Either small_number is < 2 OR big_number > 50 OR BOTH ARE TRUE");
        }

        if ((small_number < 2) || (big_number > 500)) {
            System.out.println("Either small_number is < 2 OR big_number > 500 OR BOTH ARE TRUE"); // DOESN'T GET PRINTED!
        }

        // OR operator comes in 2 flavours in Java;
        // 1. || (logical OR): Operates on boolean operands (checking if condition is true/false)
        // 2. | (Bitwise OR): Works at the Bit Level

        // 38. Assignment Operator Vs Equals Operator SKIPPED!!!
        System.out.println("=================================");

        // 39. Ternary Operator

        boolean isBlue = true;

        String colour = isBlue ? "Blue" : "Red";
        System.out.println("The colour decided is: " + colour);

        // 3 Operands we're testing in a Ternary Expression:
        // 1. Condition we're testing (Needs to return true/false) (e.g. isBlue)
        // 2. Value to assign to variable IF condition is True (e.g. "Blue")
        // 3. Value to assign to variable IF condition is False (e.g. "False")

        // The ternary operator = shortcut to assigning 1 of 2 values to a variable, depending on a given condition
        // Basically a shortcut to an if/else statement

        int personsAge = 20;

        boolean isOfIrishDrinkingAge = personsAge >= 18 ? true : false;
        if (isOfIrishDrinkingAge) {
            System.out.println("Person can drink legally in Ireland");
        }

        // Adding parentheses here to make the conditional expression more clear
        boolean isOfAmericanDrinkingAge = (personsAge >= 21) ? true : false;
        if (! isOfAmericanDrinkingAge) {
            System.out.println("BUT NOT in America");
        }


    }
}
