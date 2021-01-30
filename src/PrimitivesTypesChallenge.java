public class PrimitivesTypesChallenge {
    public static void main(String[] args){
        // Challenge = create a byte var and set it to any valid bte num.
        // Do the same with a short and int
        // Finally create a long variable and make it equal to 50,000 + 10 * sum of the byte + short + int

        byte some_value = 10;

        byte myByte = (byte) (Byte.MAX_VALUE - some_value);
        short myShort = (short) (Short.MAX_VALUE - some_value);
        int myInt = Integer.MAX_VALUE / some_value; // N.B. - No need for casting here

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);

        long myLong_V1 = (50_000 + (10 * (long)(myByte + myShort + myInt))); // integer multiplication implicitly cast to long
        System.out.println(myLong_V1); // 2147862380

        long myLong_V2 = (long) (50_000 + (10 * (long)(myByte + myShort + myInt)));
        System.out.println(myLong_V2); // 2147862380
    }
}
