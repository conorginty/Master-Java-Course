package Section_11_NamingConventions_Packages_Static_Final_KWs.Scope;

import java.util.Scanner;

public class ScopeChallenge {
    // 148. Scope Challenge
    // Although we use "x" everywhere, we use the appropriate scope to access the appropriate "x"

    public class X {
        private int x;

        public X(int x) {
            this.x = x;
        }

        public void x() {
            for (int x=1; x <= 12; x++) {
                System.out.println(x + " times " + this.x + " = " + (x * this.x));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get the times tables from 1-12: ");
        int input = scanner.nextInt();

        ScopeChallenge scopeChallenge = new ScopeChallenge();
        X x = scopeChallenge.new X(input);

        x.x();

    }
}
