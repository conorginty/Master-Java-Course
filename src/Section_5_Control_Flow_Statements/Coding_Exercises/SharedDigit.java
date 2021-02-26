package Section_5_Control_Flow_Statements.Coding_Exercises;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        boolean valid_params_num1 = num1 >= 10 && num1 <= 99;
        boolean valid_params_num2 = num2 >= 10 && num2 <= 99;

        if (!(valid_params_num1 && valid_params_num2)) {
            return false;
        }

        int num1_most_sig_num = num1 / 10;
        int num1_least_sig_num = num1 % 10;

        int num2_most_sig_num = num2 / 10;
        int num2_least_sig_num = num2 % 10;

        boolean same_most_sig = num1_most_sig_num == num2_most_sig_num;
        boolean same_least_sig = num1_least_sig_num == num2_least_sig_num;
        boolean most_sig_num1_same_as_least_sig_num2 = num1_most_sig_num == num2_least_sig_num;
        boolean least_sig_num1_same_as_most_sig_num2 = num1_least_sig_num == num2_most_sig_num;

        return same_most_sig || same_least_sig || most_sig_num1_same_as_least_sig_num2 || least_sig_num1_same_as_most_sig_num2;
    }
}
