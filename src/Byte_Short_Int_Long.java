public class Byte_Short_Int_Long {
    public static void main(String[] args){

        // ===== INT =====

        int myValue = 10_000;
        int minIntValue = Integer.MIN_VALUE; // Smallest value we can set an int to
        int maxIntValue = Integer.MAX_VALUE; // Largest value we can set an int to
        // N.B. - We use Integer instead of int, coz int only allows us to set the variable's value.
        // Integer, by comparison, is a Wrapper Class, which allows us to perform operations on integer numbers.

        System.out.println("Minimum int value: " + minIntValue); // Minimum int value: -2147483648
        System.out.println("Maximum int value: " + maxIntValue); // Maximum int value: 2147483647

        // --- Overflow ---
        System.out.println("Busted MAX int value, resulting in Overflow: " + (maxIntValue + 1));
        // The reason the value becomes a negative number (i.e. -2147483648) is due to Overflow
        // We tried to put too large a number into the space allocated by the computer for an integer.
        // It didn't fit, but the computer tried to fit it anyway and by doing that it overflowed.
        // The reverse is also true...

        // --- Underflow ---
        System.out.println("Busted MIN int value, resulting in Underflow: " + (minIntValue - 1));

        // With Overflow and Underflow, the computer just skips back to the minimum or the maximum number
        // respectively, which is usually what you do NOT want!
        // Therefore, as programmers, it's our responsibility to use the appropriate data type and ensure that the
        // range of number we're trying to store is within the min/max value

        int tooLargeForInt_Fine_1 = Integer.MAX_VALUE + 1;
        int tooLargeForInt_Fine_2 = 2147483647 + 1;

        // HOWEVER, You cannot set Literal values that are greater/smaller than the upper/lower bounds of the range
        // int tooLargeForInt_Problem = 2147483648; // Err: "Integer number too large"
        System.out.println("===========================");

        // ===== BYTE =====

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum byte value: " + minByteValue); // Minimum byte value: -128
        System.out.println("Maximum byte value: " + maxByteValue); // Maximum byte value: 127

        // Byte data type is used quite sparingly in modern times, as modern computers have a lot of memory so don't need to be too conscious
        // However, generally in terms of performance, smaller data types takes up less space and can be quicker to access.
        System.out.println("===========================");

        // ===== SHORT =====

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short value: " + minShortValue); // Minimum Short value: -32768
        System.out.println("Maximum Short value: " + maxShortValue); // Maximum Short value: 32767
        System.out.println("===========================");

        // ===== Size of Primitive Types and Width =====

        // A Byte occupies 8 bits. So we say a Byte has a Width of 8 (2**8 (2**7 lower bound, 2**7 upper bound))
        // A Short occupies 16 bits, so can store a much larger range of numbers. It has a Width of 16 (2**16)
        // An Int occupies 32 bits (2**32)
        // A Long occupies 64 bits (2**64)
        // So, the main point here is that each primitive type occupies a different amount of memory
        // (e.g. int requires X4 times as much space as a byte)

        // ===== LONG =====
        long myLongValue_lower_l = 100l; // 'long' literal '100l' ends with lowercase 'l'
        // N.B. - We're even told that we should change from l to L, so to not confuse with the number 1;
        long myLongValue_upper_L = 100L;

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long value: " + minLongValue); // Minimum Long value: -9223372036854775808
        System.out.println("Maximum Long value: " + maxLongValue); // Maximum Long value: 9223372036854775807

        // long bigLongLiteralValue_Problem = 1_234_567_890_123; // Integer number too large
        long bigLongLiteralValue_Fine = 1_234_567_890_123L; // adding L at the end fixes the issue


    }
}
