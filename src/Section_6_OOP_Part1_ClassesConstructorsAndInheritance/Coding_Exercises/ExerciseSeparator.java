package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises;

public class ExerciseSeparator {
    public static void separate_exercises(int separatorLength) {
        String output = "";
        for (int i=0; i < separatorLength; i++) {
            output += "=";
        }
        System.out.println(output);
    }
}
