public class IfThenStatement {
    public static void main(String[] args) {
        // 35. If-then Statement

        // if statements allow us to run specific blocks of code when a condition is met
        // Conditional logic uses specific statements in Java to  allow us to check a condition and execute
        // certain code based on whether that condition (the expression) is true or false

        boolean isAlien = false;

        // ==== If-Then (i.e. NO Code block (no {})) ====
        // Version 1;
        if (isAlien == false)
            System.out.println("It is NOT an alien");

        // Version 2;
        if (isAlien == false)
            System.out.println("Again, it's NOT an alien");

        // Version 3;
        if (!isAlien)
            System.out.println("For the LAST time, NOT an alien!!");

        // ==== WITH Code block (i.e. {}) ====
        // A code block allows for >1 statement to be executed (i.e. a block of code

        // Version 1;
        if (isAlien == false) {
            System.out.println("It is NOT an alien");
            System.out.println("EXTRA EXTRA");
        }

        // Version 2;
        if (isAlien == false) {
            System.out.println("Again, it's NOT an alien");
        }

        // Version 3;
        if (!isAlien) {
            System.out.println("For the LAST time, NOT an alien!!");
        }
    }
}
