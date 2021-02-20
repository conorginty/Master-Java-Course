package Section_4_Expressions_Statements_CodeBlocks_Methods_etc;

public class MethodsInJava {
    public static void main (String[] args) {
        // 48. Methods in Java
        calculateScore(true,800, 5, 100);
        calculateScore(true,10_000, 8, 200);

        // 49. More on Methods and a Challenge
        boolean gameOver = true;
        int myScore = 2500;
        int myCompletedLevel = 10;
        int myBonus = 500;

        int myHighScore = calculateScore(gameOver, myScore, myCompletedLevel, myBonus);
        System.out.println("My high score is: " + myHighScore);
        System.out.println("And again, my high score is: " + myHighScore);
        System.out.println("====================================");

        // ===== Challenge =====
        // 1.1. Create a Method called displayHighScorePosition
        // 1.2. It should take a player's name and position in the high score table as parameters.
        // 1.3. You should display the a message like "PLAYER_NAME managed to get into position POSITION on the high score table

        // 2.1. Create a 2nd method called calculateHighScorePosition
        // 2.2. It should be have an argument for player score
        // 2.3. It should return an int
        // 2.4. The return data should be:
        //      -   if the score is >= 1000: return 1
        //      -   if the score is >= 500 and < 1000: return 2
        //      -   if the score is >= 100 and < 500: return 3
        //      -   all other cases: return 4

        // 3.1. Call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50

        int amy_position = calculateHighScorePosition(1500);
        int bob_position = calculateHighScorePosition(900);
        int ciara_position = calculateHighScorePosition(400);
        int david_position = calculateHighScorePosition(50);

        displayHighScorePosition("Amy", amy_position);
        displayHighScorePosition("Bob", bob_position);
        displayHighScorePosition("Ciara", ciara_position);
        displayHighScorePosition("David", david_position);

        // N.B. - Void methods don't return any data, and can also be known as Procedures.
        //      - Methods can also be known as Functions
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        }
        return -1;
    }

    // ***** Challenge *****
    // === 1. ===
    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position: " + position);
    }

    // === 2. ===
    public static int calculateHighScorePosition(int playersScore) {

        int position;

        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
