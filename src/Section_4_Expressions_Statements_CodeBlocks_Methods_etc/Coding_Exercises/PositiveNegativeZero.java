package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class PositiveNegativeZero {
    // N.B. - Notice how we have NO main class here (it's in TestExercises)

    public static void checkNumber(int number) {
        String result;

        if (number > 0) {
            result = "Positive";
        } else if (number < 0) {
            result = "Negative";
        } else {
            result = "0";
        }
        System.out.println(number + " is: " + result);
    }
}
