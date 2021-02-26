package Section_5_Control_Flow_Statements.Coding_Exercises;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }

        int sum = 0;

        for (int i=1; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }
}
