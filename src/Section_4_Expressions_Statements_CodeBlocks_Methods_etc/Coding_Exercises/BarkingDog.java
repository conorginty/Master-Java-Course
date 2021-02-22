package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        boolean wokenUp = false;

        if (barking) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                wokenUp = true;
            } else {
                wokenUp = false;
            }
        }

        return wokenUp;
    }
}
