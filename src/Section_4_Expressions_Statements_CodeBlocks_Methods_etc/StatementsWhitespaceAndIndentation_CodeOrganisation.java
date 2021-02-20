package Section_4_Expressions_Statements_CodeBlocks_Methods_etc;

public class StatementsWhitespaceAndIndentation_CodeOrganisation {
    public static void main(String[] args) {
        // 45. Statements, Whitespace and Indentation (Code Organisation)

        // Statements are the "complete line" of code (i.e. expression along with data type and ';')
        // e.g.s
        int some_num = 10; // This full line is a statement
        some_num++; // Another statement
        some_num--; // And another statement
        // method calls are also statements: e.g.
        System.out.println("This line/method call is a complete statement");

        // semicolons (;) are usually needed to complete statements, BUT there are exceptions to this.

        // Statements can be on multiple lines. e.g.
        System.out.println(
                "This is " +
            "another " +
                        "statement"
        ); // This is another statement

        // We can even write multiple statements on the same line (though this is NOT advised);
        int another_num = 5; --another_num; System.out.println(another_num); // 4

        // Whitespace is used extensively to make your code readable and to separate keywords, variable names, operators etc

        // Indentation involves indenting your code to make it more readable.

    }
}
