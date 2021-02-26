package Section_5_Control_Flow_Statements.Coding_Exercises;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // bigCount represents 5kg bags
        // smallCount represents 1kg bags
        // goal represents the amount of kg needed to assemble a package

        boolean valid_params = bigCount >= 0 && smallCount >= 0 && goal >= 0;

        if (!(valid_params)) {
            return false;
        }

        int bigCountTotal = bigCount * 5;
        if (bigCountTotal > goal) {
            return false;
        }

        return bigCountTotal + smallCount >= goal;
    }
}
