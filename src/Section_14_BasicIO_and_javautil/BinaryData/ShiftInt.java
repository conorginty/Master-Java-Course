package Section_14_BasicIO_and_javautil.BinaryData;

// Part of 239.
public class ShiftInt {
    // These haven't much to do with the IO section - we're just using it to show the 4 values that the
    // the rightInt() method produces when it saves an int value to the Binary Stream.
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        int x = 922_342_959;

        writeInt(x);
    }

    private static void display(int x) {
        String all = String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0");
        String colouredBinary = all.substring(0, 24) + ANSI_PURPLE + all.substring(24) + ANSI_RESET;
        int y = x & 0xFF; // masks all but the rightmost 8 bits (i.e. Mask = 0.0.0.11111111)
        String output = String.format("%10d and 0xFF is %8s \t %10d is ", y, Integer.toBinaryString(y), x) + colouredBinary;
        System.out.println(output);
    }

    private static void writeInt(int v) {
        int x;
        display(v >>> 24);
        display(v >>> 16);
        display(v >>> 8);
        display(v >>> 0);
    }
}
