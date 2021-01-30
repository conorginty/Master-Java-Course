public class CastingInJava {
    public static void main(String[] args) {
        // 27. Casting in Java

        int minIntValue = Integer.MIN_VALUE;
        int myIntValue = minIntValue / 2; // No problems here

        int minByteValue = Byte.MIN_VALUE;
        // byte myByteValue_Problem = (minByteValue / 2); // Required type: byte, Provided: int
        // Normally something half the minimum byte size would clearly fit into a byte datatype.
        // However, here we have an expression that uses a variable that's divided by 2 (rather than using a literal value)
        // The Default Whole Number used by Java is an int, so that's what caused the error on ln9.
        // So in effect: (minByteValue / 2) is being treated as an int by the computer.

        // In order to tell Java that the resulting value of the expression fits into a byte, we use Casting
        byte myByteValue_Fine = (byte) (minByteValue / 2);

        // Casting a short
        short minShortValue = Short.MIN_VALUE;
        // short myShortValue_Problem = (minShortValue / 2); // Required type: short, Provided: int
        short myShortValue_Fine = (short) (minShortValue / 2);

        // Evidently Java uses an int by default for the result of expressions, so you most likely want to use an int in most scenarios
        // So if you don't specify a type you wish to cast/convert to, then the int is assumed automatically by Java
    }
}
