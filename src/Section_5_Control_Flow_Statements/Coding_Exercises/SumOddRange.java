package Section_5_Control_Flow_Statements.Coding_Exercises;

public class SumOddRange {

    public static boolean isOdd(int num) {
        if (num < 0) {
            return false;
        }
        return num % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        boolean valid_params = start > 0 && end > 0 && end >= start;

        if (!valid_params) {
            return -1;
        }

        int sum = 0;

        for (int i=start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
