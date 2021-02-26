package Section_5_Control_Flow_Statements;

public class ParsingValuesFromString {
    public static void main(String[] args) {
        // 71. Parsing Values from a String

        // Often we'll have to convert a string into some other datatype (e.g. number string => int)
        // 1 use case where we may need to do this is when we're reading input from the user
        // (e.g. after it's been entered into the console, or from a user interface)

        // We'll first learn how to convert a String object into a primitive datatype;

        String numberAsString = "2021";
        System.out.println("numberAsString = " + numberAsString);

        // 1. Parsing methods can be used to convert strings to various primitive types, depending on the parse we choose to use.

        int integerForm = Integer.parseInt(numberAsString);
        System.out.println(integerForm * 2);

        // Integer = wrapper class for the primitive type "int", which contains some static methods (e.g. parseInt)
        // Integer.parseInt() will try to convert the string we're passing as an argument into an integer.
        // If it's successful, the number will be converted from a string to an integer.
        // But if it fails, we'll get an error.
        // In order to convert Strings into some other datatype, we need to include the type we're converting it to (e.g. int)
        // This is done so we can get the parsing method associated with that type.

        // Let's look at how the + operator differs for both;
        numberAsString += 1;
        integerForm += 1;

        System.out.println("numberAsString with 1 added on: " + numberAsString); // 20211
        System.out.println("integerForm with 1 added on: " + integerForm); // 2022

        // Working with Doubles instead;

        numberAsString = "200.5";
        double doubleForm = Double.parseDouble(numberAsString);

        numberAsString += 1;
        doubleForm += 1;

        System.out.println("numberAsString with 1 added on: " + numberAsString); // 200.51
        System.out.println("doubleForm with 1 added on: " + doubleForm); // 201.5
    }
}
