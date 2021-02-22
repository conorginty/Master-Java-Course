package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class EqualityPrinter {
    public static void printEqual(int num1, int num2, int num3) {
        boolean valid_params = num1 > 0 && num2 > 0 && num3 > 0;

        if (!valid_params) {
            System.out.println("Invalid Value");
        }

        boolean all_equal = num1 == num2 && num2 == num3;
        boolean all_different = num1 != num2 && num2 != num3;

        if (all_equal) {
            System.out.println("All numbers are equal");
        } else if (all_different) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
