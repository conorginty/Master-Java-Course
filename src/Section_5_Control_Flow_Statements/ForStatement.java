package Section_5_Control_Flow_Statements;

public class ForStatement {
    public static void main(String[] args) {
        // 65. The for Statement (and a Challenge Exercise)

        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000, 2));

        // Basic format of a for statement;
        // for (init; termination; incrememt) {
        //      DO SOMETHING
        // }

        // *** Challenge 1 ***
        for (int i=2; i < 5; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000, i)));
        }
        System.out.println("=========");

        // *** Challenge 2 ***
        for (int i=5; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000, i)));
        }
        System.out.println("=========");

        for (int i=1; i <= 10; i++) {
            System.out.println(i + ": " + isPrime(i));
        }

        int prime_count = 0;

        for (int i=10; i < 50; i++) {
            if (isPrime(i)) {
                prime_count++;
                System.out.println(i + " is a prime");
                if (prime_count == 3) {
                    System.out.println("Exiting for loop...");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * interestRate / 100;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
