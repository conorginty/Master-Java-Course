package Section_5_Control_Flow_Statements.Coding_Exercises;

public class LastDigitChecker {
    public static boolean hasSameDigit(int num1, int num2, int num3) {
//        boolean valid_num1 = num1 >= 10 && num1 <= 1000;
//        boolean valid_num2 = num2 >= 10 && num2 <= 1000;
//        boolean valid_num3 = num3 >= 10 && num3 <= 1000;
//
//        if (!(valid_num1 && valid_num2 && valid_num3)) {
//            return false;
//        }

        if(!(isValid(num1) && isValid(num2) && isValid(num3))) {
            return false;
        }

        int num1_least_sig_digit = num1 % 10;
        int num2_least_sig_digit = num2 % 10;
        int num3_least_sig_digit = num3 % 10;

        return num1_least_sig_digit == num2_least_sig_digit
                || num1_least_sig_digit == num3_least_sig_digit
                || num2_least_sig_digit == num3_least_sig_digit;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
}
