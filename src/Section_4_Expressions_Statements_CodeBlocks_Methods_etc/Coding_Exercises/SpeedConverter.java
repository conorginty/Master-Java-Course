package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class SpeedConverter {
    // 1.
    public static long toMilesPerHour(double kilometresPerHour) {
        long miles;

        if (kilometresPerHour < 0) {
            miles = -1L;
        } else {
            double km_to_mile_conversion = 0.621371;
            miles = Math.round(kilometresPerHour * km_to_mile_conversion);
        }
        return miles;
    }

    // 2.
    public static void printConversion(double kilometresPerHours) {
        long miles = toMilesPerHour(kilometresPerHours);
        String output;

        if (kilometresPerHours >= 0) {
            output = kilometresPerHours + "km/h = " + miles + "mi/h";
        } else {
            output = "Invalid Value";
        }
        System.out.println(output);
    }
}
