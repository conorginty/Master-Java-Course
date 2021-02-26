package Section_5_Control_Flow_Statements;

public class DigitSumChallenge {
    public static void main(String[] args) {
        // 70. Digit Sum Challenge
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int num) {
        if (num < 10) {
            return -1;
        }

        int sum = 0;

        while (num > 0) {
            // Extract the least significant digit
            int last_digit = num % 10;
            sum += last_digit;

            // Drop the least significant digit, and start again.
            num /= 10;
        }

        return sum;
    }

}
