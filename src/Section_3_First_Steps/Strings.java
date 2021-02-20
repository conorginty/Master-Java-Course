package Section_3_First_Steps;

public class Strings {
    public static void main(String[] args) {
        // 32. Primitive Type Reacp and the String Data Type

        // The String = datatype in Java which is NOT a primitive. It's a Class, BUT treated differently to traditional classes
        // A String = contains a sequence of characters whose length is only limited in theory by memory (heap space) or the max value of an int (2.4 billion)

        String myString = "This is a string literal";
        myString += ", and this is extra text"; // Set myString to what it already is at this point, concatenated with another text portion at the end
        System.out.println(myString);

        String copyright_2021 = "\u00A9 2021";
        System.out.println(copyright_2021); // © 2021

        String numberStr = "250";
        // int castStrToInt = (int) numberStr; // DOESN'T WORK
        // Instead need to use Interger.parseInt()
        int castStrToInt = Integer.parseInt(numberStr); // DOESN'T WORK
        System.out.println(castStrToInt + 2000); // 2250

        int someNum = 10;
        numberStr += someNum;

        System.out.println(numberStr); // 25010

        // someNum += numberStr; // Required type: int, Provided: String
        // N.B. - So you CAN concat a num (which is cast automatically to a String) to a String
        // BUT CAN'T add a String number to an int to make them add mathematically

        // Can apply the same logic for doubles;
        double someDouble = 123.45d;
        numberStr += someDouble;
        System.out.println(numberStr); // 25010123.45

        // Section_3_First_Steps.Strings in Java are immutable (can't be changed after they're created).
        // If we want to modify them (add or delete characters) then a new String must be created.
        // So on ln22, numberStr does NOT get appended the value 10 (stored in someNum).
        // Instead a new String is created which consists of the previous value of numberStr concatted with the String repr of 10.
        // The result is that a new string got created and replaced the old one, which got discarded.

        // Appending strings, resulting in the creation of new strings is generally INEFFICIENT!!!
        // A better alternative is to use StringBuffers, which can be modified (we'll look at this in a later video)


    }
}
