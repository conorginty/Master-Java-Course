package Section_11_NamingConventions_Packages_Static_Final_KWs.AccessModifiers;

public class Main {
    public static void main(String[] args) {
        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1_000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-100);
        timsAccount.calculateBalance();
        System.out.println("Balance on account is: " + timsAccount.getBalance());

        // Notice how we've made all the members of Account public, meaning any class can access and modify
        // the balance directly (e.g.)
        System.out.println("Unsafe access of Tim's Balance: " + timsAccount.balance);

        // We can also do things like this;
        timsAccount.balance = 50_000;
        // You may think the bank may be able to spot this fraud by checking the transaction list, but that
        // can be modified as well;
        timsAccount.transactions.add(45_500);

        // In a well-designed system, the transactions list should ONLY be modified by the deposit() and
        // withdrawal() methods. But, by allowing access to the transactions list from outside the class,
        // and the balance for that matter, we are introducing the potential for errors in the program OR,
        // in this case, fraud.

        // Objects can also be modified (or member fields made public) by mistake, coz the implications of doing
        // so aren't apparent, as the programmer didn't understand the ramifications of what they were doing.

        // The point is if you expose fields of your classes, then anyone using the class will reasonably assume
        // that they can manipulate the values of those fields. And because this bypasses the methods you've written
        // to use those fields, the class may no longer behave the way it intended to.

        // The fix for use would be to change the member variables of Account from public -> private
    }
}
