public class MurexTest_2 {
    public static void main(String[] args) {

        int[] maxValues = {10, 9, 8, 11};
        int[] diceRolls = {2, 4, 6, 3};

        determineOutcome(maxValues, diceRolls);
    }

    public static String determineOutcome(int[] maxValues, int[] diceRolls) {

        // define a action score of 0

        // create a loop based on the size of either array
        // - check current item from both arrays
        // - update score as appropriate
        // - if they're equal, increase score by 2
        // - if the roll is 1, reduce score by 1
        // - if the roll is greater the current max from max values array / 2

        int score = 0;
        boolean match = false;
        boolean isOne = false;

        for (int i=0; i < maxValues.length; i++) {
            if (maxValues[i] == diceRolls[i]) {
                score += 2;
                match = true;
            } else if (diceRolls[i] == 1) {
                score--;
                isOne = true;
            } else if (diceRolls[i] > maxValues[i]/2) {
                score++;
            }
        }

        String output = "";

        if (score >= 5) {
            output = "CRITICAL_VICTORY";
        } else if (score >= 1) {
            output = "VICTORY";
        } else if (isOne && !match) {
            output = "CRITICAL_FAILURE";
        } else if (score == 0) {
            output = "FAILURE";
        } else {
            output = "NOT_SURE";
        }

        return output;

        /*
        === Output ===
        - CRITICAL_VICTORY if action score is >= 5
        - VICTORY if action score is >= 1
        - CRITICAL_FAILURE if there's never a match between a dice roll and its max value AND if a dice value is 1
        - FAILURE if action score is 0
        - NOT_SURE otherwise
        */
    }
}
