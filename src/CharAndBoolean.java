public class CharAndBoolean {
    public static void main(String[] args){
        // 31. The char and boolean Primitive Data Types

        // ===== CHAR =====

        char myChar = 'D';
        // Useful to use instead of strings for certain problems (e.g. storing last key pressed by a user in a game)
        // Or the last letter that's been typed etc.
        // They were a lot more relevant back when Java was created back in the 90's, but as we have faster computers
        // with lots more memory, this isn't an issue

        // In terms of storage, chars occupy 2 bytes of memory (16 bits), so has a width of 16
        // The reason it's not a single byte is to allow us to store Unicode characters
        // Unicode = international encoding standard for use with different languages and scripts, by which each letter,
        // digit or symbol is assigned a unique numeric value that applies across different platforms and programs.
        // Unicode was developed to represent all characters, punctuation etc from all languages and works by using a combo
        // of the 2 bytes that a char takes up in memory to represent up to 65535 different types of characters

        char myUnicodeFor_D = '\u0044';
        System.out.println("The character encoded by the Unicode \\u0044 = " + myUnicodeFor_D);

        char myUnicodeFor_1_over_4 = '\u00BC';
        System.out.println("The character encoded by the Unicode \\u00AE' = " + myUnicodeFor_1_over_4);

        // ===== BOOLEAN =====

        boolean trueBooleanValue = true;
        boolean falseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
