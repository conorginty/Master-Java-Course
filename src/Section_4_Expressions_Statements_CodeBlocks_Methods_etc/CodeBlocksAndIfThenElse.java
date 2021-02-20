package Section_4_Expressions_Statements_CodeBlocks_Methods_etc;

public class CodeBlocksAndIfThenElse {
    public static void main(String[] args) {
        // 46. Code Blocks and the If/Then/Else Statements

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 4000) {
            System.out.println("Your score was 4000");
        } else if (score > 1000) {
            System.out.println("Your score was greater than 1000");
        } else {
            System.out.println("Got here!");
        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            // N.B. - As finalScore was initialised here, it cannot be accessed outside the block
            System.out.println("Your final score was: " + finalScore);
        }

        // N.B. - As finalScore is defined inside an if block, we can initialise another variable with the SAME NAME
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

        // N.B. - And finally, we can initialised finalScore in the global scope as well (i.e. with the SAME NAME)!
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score was: " + finalScore);

        // 47. if then else Recap

    }
}
