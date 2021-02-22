package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class ExerciseSeparator {
    public static void separate_exercises(int separatorLength) {
        String output = "";
        for (int i=0; i < separatorLength; i++) {
            output += "=";
        }
        System.out.println(output);
    }
}
