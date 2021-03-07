public class MurexTest_1 {
    public static void main(String[] args) {
        System.out.println(correctedPalindrome("acba"));
    }

    public static String correctedPalindrome(String almostPalindrome) {
        // initialise two variables that represent front and back indexes
        // front = 0
        // end = length of string-1

        // halfWay = length of string / 2

        // loop as far as halfway
        // - if the chars at the front and back are the same, front++, end-- continue
        // - else grab the char at end and insert it in front-1

        // initialise an empty string called finalpalindrome

        // append the solution to that string

        int front = 0;
        int end = almostPalindrome.length()-1;

        int halfWay = almostPalindrome.length()/2;

        String output = "";

        for (int i=0; i <= halfWay; i++) {
            if (almostPalindrome.charAt(front) == almostPalindrome.charAt(end)) {
                front++;
                end--;
            } else {
                front--;
                break;
            }
        }
        // Now we know that the index front is where the char at index back should be

        // "acba" -> "abcba"

        for (int i=0; i < almostPalindrome.length()-1; i++) {
            if (i != front) {
                output += almostPalindrome.charAt(i);
            } else {
                output += (almostPalindrome.charAt(end));
            }
        }

        return output;
    }
}
