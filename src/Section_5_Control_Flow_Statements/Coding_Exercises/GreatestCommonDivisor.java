package Section_5_Control_Flow_Statements.Coding_Exercises;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (!(greaterThanNine(num1) && greaterThanNine(num2))) {
            return -1;
        }

//        int smallest = num1 > num2 ? num2 : num1;
        int smallest = Math.min(num1, num2);
        int biggest = Math.max(num1, num2);

        int greatestCommonDivisor = -1;
        int i = 2;

        if (biggest % smallest == 0) {
            return smallest;
        }

        while (i <= smallest/2) {
            if (smallest % i == 0 && biggest % i == 0) {
                greatestCommonDivisor = i;
            }
            i++;
        }
        return greatestCommonDivisor;
    }

    public static boolean greaterThanNine(int num) {
        return num > 9;
    }
}
