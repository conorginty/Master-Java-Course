package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long minutes_to_hours = minutes / 60;
        long hours_to_days = minutes_to_hours / 24;
        long days_to_years = hours_to_days / 365;
        long remaining_days = hours_to_days % 365;

        String output = minutes + " min = " + days_to_years + " years and " + remaining_days + " days";
        System.out.println(output);
    }
}
