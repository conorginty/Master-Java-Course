package Section_4_Expressions_Statements_CodeBlocks_Methods_etc;

public class KeywordsAndExpressions {
    public static void main(String[] args) {
        // 44. Keywords and Expressions

        // Java has ~50 reserved/keywords: https://en.wikipedia.org/wiki/List_of_Java_keywords

        // keywords have a pre-defined meaning in the language
        // In the case of IntelliJ dark-mode: Any word in orange is a keyword

        // Expressions = building blocks of all Java programs. Built with values, variables, operators and method calls

        // e.g.1 let's look at converting a mile to a kilometre (1.609344 times a kilometre)
        double hundred_km = (100 * 1.609344d);
        // Here, everything after the data type (i.e. double) and before the ';' is part of the Expression
        // The entire thing forms a statement

        // e.g.2
        int score = 50;
        if (score > 30) { // Everything inside the brackets forms the expression
            System.out.println("Score is > 30"); // As well as the component within the brackets here!
        }

        // Challenge: In the following code, write down what parts of the code are expressions;
        int new_score = 100;
        if (new_score > 99) {
            System.out.println("You got the high score");
        }

        // My Solution (name all the expressions);
        // 1. new_score = 100
        // 2. new_score > 99
        // 3. "You got the high score"
    }
}
