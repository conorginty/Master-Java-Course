package Section_4_Expressions_Statements_CodeBlocks_Methods_etc;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value!";

    public static void main(String[] args) {
        // 60. Seconds and Minutes Challenge
        System.out.println(getDurationString(100, 20));
        System.out.println(getDurationString(100, 80));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-500));
    }

    public static String getDurationString(int minutes, int seconds) {
        boolean valid_params = minutes >= 0 && seconds >= 0 && seconds < 60;

        if (!valid_params) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remaining_mins = minutes % 60;

        String output = hours + "h " + remaining_mins + "m " + seconds + "s";
        return output;
    }

    // Overloaded Method
    public static String getDurationString(int seconds) {
        boolean valid_param = seconds >= 0;

        if (!valid_param) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remaining_secs = seconds % 60;

        return getDurationString(minutes, remaining_secs);
    }
}
