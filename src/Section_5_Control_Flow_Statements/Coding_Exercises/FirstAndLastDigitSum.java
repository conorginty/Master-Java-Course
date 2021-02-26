package Section_5_Control_Flow_Statements.Coding_Exercises;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }

        if (num < 10) {
            return num * 2;
        }

        // Extract least significant digit
        int sum = num % 10;

        // Extract most significant digit
        while (num > 9) {
            num /= 10;
        }

        sum += num;

        return sum;
    }
}
