package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Constructors_Parts;

public class Main {
    // ================== MAIN METHOD (for testing) ==================
    public static void main(String[] args) {
        BankAccount bank_account = new BankAccount();

        System.out.println(bank_account.getAccountNumber()); // null
        System.out.println(bank_account.getBalance()); // 0.0

        bank_account.setAccountNumber("12345");
        bank_account.setBalance(1_000);
        System.out.println(bank_account.getAccountNumber()); // 12345
        System.out.println(bank_account.getBalance()); // 1000.0

        bank_account.deposit(400);
        bank_account.deposit(300);
        bank_account.withdraw(200);
        System.out.println(bank_account.getBalance()); // 1500.0

        bank_account.withdraw(2_000); // Insufficient funds. Withdrawal not processed...
        System.out.println(bank_account.getBalance()); // 1500.0
        bank_account.withdraw(1_500);
        System.out.println(bank_account.getBalance()); // 0.0
        System.out.println("==================");

        // Instances created with No-Arg Constructor
        Dog default_dog1 = new Dog();
        System.out.println(default_dog1.getName());
        System.out.println(default_dog1.getAge());
        Dog default_dog2 = new Dog();
        System.out.println(default_dog1.getName());
        System.out.println(default_dog1.isShaggy());
        System.out.println("-------");

        // Instances created with Constructor with Args
        Dog poochie = new Dog("Labrador", "Poochie", 4, true);
        System.out.println("Details about our poochie instance...");
        System.out.println("Species: " + poochie.getSpecies());
        System.out.println("Name: " + poochie.getName());
        System.out.println(poochie.getName() + " is: " + poochie.getSpecies() + " years old");
        System.out.println("Does " + poochie.getName() + " have a shaggy coat?: " + poochie.isShaggy());
        System.out.println("==================");

        // ===== VipCustomer Testing =====
        System.out.println("=== No Arg VipCustomer ===");
        VipCustomer noArgVipCustomer = new VipCustomer();
        System.out.println(noArgVipCustomer.getName());
        System.out.println(noArgVipCustomer.getCreditLimit());
        System.out.println(noArgVipCustomer.getEmailAddress());

        System.out.println("=== 2 args (name and email) VipCustomer ===");
        VipCustomer twoArgVipCustomer = new VipCustomer("Jimmy", "jimmy@yahoo.ie");
        System.out.println(twoArgVipCustomer.getName());
        System.out.println(twoArgVipCustomer.getCreditLimit());
        System.out.println(twoArgVipCustomer.getEmailAddress());

        System.out.println("=== ALL Args VipCustomer ===");
        VipCustomer allArgsVipCustomer = new VipCustomer("Michelle", 40_000, "michelle@eircom.net");
        System.out.println(allArgsVipCustomer.getName());
        System.out.println(allArgsVipCustomer.getCreditLimit());
        System.out.println(allArgsVipCustomer.getEmailAddress());

    }
}
