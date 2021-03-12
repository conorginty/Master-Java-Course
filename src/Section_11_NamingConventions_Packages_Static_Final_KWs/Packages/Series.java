package Section_11_NamingConventions_Packages_Static_Final_KWs.Packages;

public class Series {

    public static void main(String[] args) {
        for (int i=0; i <= 10; i++) {
            System.out.print(nSum(i) + " ");
        }
        System.out.println();
        System.out.println("============");

        for (int i=0; i <= 10; i++) {
            System.out.print(factorial(i) + " ");
        }
        System.out.println();
        System.out.println("============");

        for (int i=0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println("============");
    }

    public static int nSum(int n) {
        int sum = 0;
        for (int i=0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i=1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int fibonacci(int n) {
        int fibonacci = 0;
        if (n == 0) {
            fibonacci = 0;
        } else if (n == 1) {
            fibonacci = 1;
        } else {
            int prev = 0;
            int next = 1;
            for (int i=1; i < n; i++) {
                fibonacci = prev + next;
                prev = next;
                next = fibonacci;
            }
        }
        return fibonacci;
    }
}
