package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        boolean result = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    result = true;
                } else {
                    return result;
                }
            } else {
                result = true;
            }
        } else {
            return result;
        }

        return result;
    }
}
