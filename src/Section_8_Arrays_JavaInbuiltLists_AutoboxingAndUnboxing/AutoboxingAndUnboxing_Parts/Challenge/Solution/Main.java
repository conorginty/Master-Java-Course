package Section_8_Arrays_JavaInbuiltLists_AutoboxingAndUnboxing.AutoboxingAndUnboxing_Parts.Challenge.Solution;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomerToBranch("Adelaide", "Tim", 50.05);
        bank.addCustomerToBranch("Adelaide", "Mike", 175.34);
        bank.addCustomerToBranch("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.addBranch("Sydney");

        bank.addCustomerToBranch("Sydney", "Bob", 150.54);

        bank.listCustomers("Adelaide", false);
        System.out.println("============");
        bank.listCustomers("Adelaide", true);

        // Error Checking (Making sure they're handled correctly)

        if (!bank.addCustomerToBranch("Melbourne", "Brian", 5.53)) {
            System.out.println("ERROR: Melbourne branch does not exist");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("ERROR: Adelaide branch already exists");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("ERROR: Customer does not exists at branch");
        }

        if (!bank.addCustomerToBranch("Adelaide", "Tim", 12.21)) {
            System.out.println("ERROR: Customer Tim already exists at Adelaide branch");
        }
    }
}
