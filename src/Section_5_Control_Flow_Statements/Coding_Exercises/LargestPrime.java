package Section_5_Control_Flow_Statements.Coding_Exercises;

public class LargestPrime {
    public static int getLargestPrimeFactor(int num) {
        if (num < 0) {
            return -1;
        }

        int largestPrimeFactor = -1;

        for (int i=1; i <= num/2; i++) {
            if (num % i == 0) {
                // Then it's a factor, so now check if it's prime
                if (isPrime(i)) {
                    largestPrimeFactor = i;
                }
            }
        }
        return largestPrimeFactor;
    }

    public static boolean isPrime(int num) {
        for (int i=2; i <= num/2; i++) {
            if (num % i == 0) {
                // Then it's NOT a prime
                return false;
            }
        }
        return true;
    }
}
