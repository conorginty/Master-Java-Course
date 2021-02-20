package Section_3_First_Steps;

public class FloatAndDouble {
    public static void main(String[] args){

        // ==== 29. float and double Primitive Types =====

        // Floating Point Numbers have fractional parts, represented by decimal point (e.g. 3.56)
        // Also known as real numbers. Used when we need more precision in calculations
        // 2 Primitive Types in Java for expressing Primitive Numbers
        // 1. Float = Single Precision Number (occupies 32bits / 4bytes - so has a width of 32)
        // 2. Double = Double Precision Number (occupies 64bits / 8bytes - so has a width of 64)
        // Precision here refers to the format and amount of space occupied by the type
        // Therefore, Double has a much larger range and is a lot more precise than a float

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue); // Float Minimum Value = 1.4E-45
        System.out.println("Float Maximum Value = " + myMaxFloatValue); // Float Maximum Value = 3.4028235E38

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue); // Double Minimum Value = 4.9E-324
        System.out.println("Double Maximum Value = " + myMaxDoubleValue); // Double Maximum Value = 1.7976931348623157E308
        System.out.println("========================");

        int myIntValue = 5;

        float myFloatValue_V1 = 5;
        float myFloatValue_V2 = 5f;

        double myDoubleValue_V1 = 5;
        double myDoubleValue_V2 = 5d;

        // We have an issue when we try to create a decimal float without f
        double doubleValue_Fine = 5.25; // Doesn't require "d" at the end
        // float floatValue_Problem = 1.23; // DOES require f at the end
        float floatValue_Fine = 1.23f;
        // This is because Java assumes all decimal values as doubles (so need to cast floats to doubles, or use f at the end)
        float floatValue_Casted = (float) 3.21; // So Java sees that we have a literal double that we want treated as a float
        // N.B. - it's more common to use the "f" suffix rather than the (float) cast.
        // N.B. - Doubles are preferred to be used over floats these days

        // ==== 30. Floating Point Precision and a Challenge =====
        int myIntValue_IntDivisor = 10 / 4;

        float myFloatValue_IntDivisor = 5f / 3;
        float myFloatValue_FloatDivisor = 5f / 3f;

        double myDoubleValue_IntDivisor = 5d / 3;
        double myDoubleValue_DoubleDivisor = 5d / 3d;

        System.out.println("myIntValue_IntDivisor = " + myIntValue_IntDivisor); // 2 (You get the quotient returned)
        System.out.println("myFloatValue_IntDivisor = " + myFloatValue_IntDivisor); // 1.6666666
        System.out.println("myFloatValue_FloatDivisor = " + myFloatValue_FloatDivisor); // 1.6666666
        System.out.println("myDoubleValue_IntDivisor = " + myDoubleValue_IntDivisor); // 1.6666666666666667
        System.out.println("myDoubleValue_DoubleDivisor = " + myDoubleValue_DoubleDivisor); // 1.6666666666666667
        // Notice how the double values are more precise (have a greater range) than float

        // Although doubles occupy twice the space of floats, they're actually faster to process on modern computers
        // Because at the chip level modern computers are designed to deal with double numbers faster.
        // Java libraries (especially maths-based ones) are patternal-written to process doubles and not floats, and return doubles etc
        // This is largely because it is more precise and we don't lose much in terms of memory by using doubles over floats

        // ===== CHALLENGE =====
        // Convert a given number of lbs -> kgs

        double pounds = 200d;
        double kilogram_conversion = pounds * 0.45359237d;

        System.out.println(pounds + "lb => " + kilogram_conversion + "kg");

        // N.B. - Important to note that float and double are great for general floating point operations.
        // However, both are not great to use where precise calculations are required - this is due to a limitation with how
        // floating point numbers are stored, and not a Java problem as such.

        // Java has a solution to this - A class called BigDecimal. Used for precise calculations (e.g. currency conversions)
    }
}
