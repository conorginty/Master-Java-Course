package Section_3_First_Steps;

public class OperatorPrecedenceAndChallenge {
    public static void main(String[] args){
        // 40. Operator Precedence and Operator Challenge

        // BOMDAS

        // 7 Steps to this Challenge
        // -------------------------
        // 1. Create a double variable with a value of 20.00
        // 2. Create a 2nd variable of type double with a value of 80.00
        // 3. Add both numbers together, then multiply them by 100.00
        // 4. Use the remainder operator to figure out what the remainder from the result of the operation in
        //    Step 3 and 40.00.
        // 5. Create a boolean variable that assigns the value true if the remainder in step 4 is 0, or false otherwise
        // 6. Output the boolean variable
        // 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.

        // My Solution
        // -----------
        // 1.
        double twenty_double = 20.00d;
        // 2.
        double eighty_double = 80.00d;
        // 3.
        double result = (twenty_double + eighty_double) * 100;
        // 4.
        double step_4 = result % 40.00d;
        // 5.
        boolean remainder_is_0 = (step_4 == 0) ? true : false;
        // 6.
        System.out.println("Value of remainder_is_0 = " + remainder_is_0);
        // 7.
        if (!remainder_is_0) {
            System.out.println("Got some remainder");
        }
    }
}
