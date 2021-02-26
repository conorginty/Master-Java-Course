package Section_5_Control_Flow_Statements.Coding_Exercises;

public class EvenDigitSum {
    public static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1;
        }

        int even_sum = 0;

        while (num > 0) {
            int least_sig_digit = num % 10;

            if (least_sig_digit % 2 == 0) {
                even_sum += least_sig_digit;
            }

            num /= 10;
        }

        return even_sum;
    }
}
