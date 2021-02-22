package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {

        boolean num1_has_teen = num1 >= 13 && num1 <= 19;
        boolean num2_has_teen = num2 >= 13 && num2 <= 19;
        boolean num3_has_teen = num3 >= 13 && num3 <= 19;

        return num1_has_teen || num2_has_teen || num3_has_teen;
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}
