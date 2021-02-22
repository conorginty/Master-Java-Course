package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        double num1_to_3_decimal_places = Math.round(num1 * 1_000d) / 1_000d;
        double num2_to_3_decimal_places = Math.round(num2 * 1_000d) / 1_000d;

//        System.out.println(num1_to_3_decimal_places);
//        System.out.println(num2_to_3_decimal_places);

        return num1_to_3_decimal_places == num2_to_3_decimal_places;
    }
}
