package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        String output;

        if (kiloBytes < 0) {
            output = "Invalid Value";
        } else {
            int megabytes = kiloBytes / 1024;
            int remaining_kilobytes = kiloBytes % 1024;

            output = kiloBytes + " KB = " + megabytes + " MB and " + remaining_kilobytes + " KB";
        }

        System.out.println(output);
    }
}
