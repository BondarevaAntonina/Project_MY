package homeworks.bank_account;

/**
 * Created by antoni on 20.04.2018.
 */
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(200, "Antoni", "dollar");

        BankAccount bankAccount2 = new BankAccount(500, "Antoni99", "dollar");

        bankAccount.cutBalance(100);

        System.out.println(bankAccount.getBalance());

        bankAccount.cutBalance(500);

        System.out.println(bankAccount.getBalance() + "\n" + bankAccount2.getBalance());

    }
}
