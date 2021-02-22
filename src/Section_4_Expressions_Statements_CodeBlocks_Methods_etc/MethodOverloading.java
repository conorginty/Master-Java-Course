package Section_4_Expressions_Statements_CodeBlocks_Methods_etc;

public class MethodOverloading {
    public static void main(String[] args) {
        // 58. Method Overloading

        int newScore = calclulateScore("John", 50);
        System.out.println("New score: " + newScore);

        int justScore = calclulateScore(250);
        System.out.println("New score: " + justScore);

        int noScore = calclulateScore();
        System.out.println("New score: " + noScore);

        // ***** Challenge *****
        // 1.
        // Create a method called: calcFeetAndInchesToCentimeters (1 inch = 2.54cm, 1 foot = 12 inches)
        // It needs to have 2 params: 1. feet, 2. inches
        // Should validate that the 1st param is >= 0
        // Should validate that the 2nd param is >= 0 and <= 12
        // return -1 if either is not true
        // If the params are valid, then calculate how many centimetres comprise the feet and inches passed in, and return the value

        // 2.
        // Create a 2nd method called: calcFeetAndInchesToCentimeters BUT with only 1 param: inches
        // Should validate that the param is >= 0
        // return -1 if this is not true
        // If the param is valid, then calculate how many feet comprise the inches AND THEN,
        // call the other overloaded method, passing the correct feet and inches, so it can perform this calculation for this func.

        System.out.println(calcFeetAndInchesToCentimetres(6, 2));
        System.out.println(calcFeetAndInchesToCentimetres(0, 2));
        System.out.println(calcFeetAndInchesToCentimetres(6, 0));
        System.out.println(calcFeetAndInchesToCentimetres(-5, 11)); // -1
        System.out.println(calcFeetAndInchesToCentimetres(5, -11)); // -1
        System.out.println(calcFeetAndInchesToCentimetres(5, 15)); // -1
        System.out.println(calcFeetAndInchesToCentimetres(74));

        // 59. Method Overloading Recap

        // Method Overloading = a feature that allows us to have > 1 method with the same method (as long as we use different number of params)
        // It's the ability to create multiple methods of the same name with different implementations.
        // Calls to an overloaded method will run a specific implementation of that method.
        // It's good practice as it improves code readability and re-usability, easier to remember 1 name than multiple variant names
        // Gives programmers flexibility to call the method on different types of data arguments.
    }

    public static int calclulateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calclulateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 100;
    }

    public static int calclulateScore() {
        System.out.println("No Player name, No Player score");
        return 0;
    }

    // 1.
    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
        // Create a method called: calcFeetAndInchesToCentimeters (1 inch = 2.54cm, 1 foot = 12 inches)
        boolean are_valid_params = feet >= 0 && inches >= 0 && inches <= 12;
        if (!are_valid_params) {
            return -1;
        }

        double feet_to_inches = feet * 12;
        double total_inches = feet_to_inches + inches;
        double inches_to_cm = total_inches * 2.54;

        return inches_to_cm;
    }

    // 2.
    public static double calcFeetAndInchesToCentimetres(double inches) {
        boolean is_valid_inches = inches >= 0;

        if (!is_valid_inches) {
            return -1;
        }

        double total_feet = inches / 12;
        double total_inches = inches % 12;

        return calcFeetAndInchesToCentimetres(total_feet, total_inches);
    }
}
