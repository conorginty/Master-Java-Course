package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int lower_limit = 25;
        int upper_limit = summer ? 45 : 35;

        return temperature >= lower_limit && temperature <= upper_limit;
    }
}
