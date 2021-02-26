package Section_5_Control_Flow_Statements.Coding_Exercises;

public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        int reverse = 0;
        num = Math.abs(num);
        int copy_num = num;

        while (num > 0) {

            reverse *= 10;

            int least_sig_digit = num % 10;

            // This becomes the most_sig_digit in reverse
            reverse += least_sig_digit;

            // Update num
            num /= 10;
        }
        return reverse == Math.abs(copy_num);
    }
}
