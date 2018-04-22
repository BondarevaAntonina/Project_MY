package homeworks.bank_account;

/**
 * Created by antoni on 20.04.2018.
 * Создать класс Банковский счет.  Установить сумму для счета - 200$. Создать метод, который будет отнимать от счета
 * сумму. Если денег недостаточно,  тогда написать в консоль - "Пополните счет".  Счет можно пополнить другим методом.
 */
public class BankAccount {
    private double balance;
    private String owner;
    private String currency;


    public BankAccount(double initialBalance, String name, String currencyDollar) {
        balance = initialBalance;
        owner = name;
        currency = currencyDollar;
    }

    public double getBalance() {
        return balance;
    }

    public void cutBalance(double cutValue) {
        /*if (balance >= cutValue) {
            balance = balance - cutValue;
        } else {
            System.out.println("У Вас недостаточно средств. Пожалуйста пополните счет");
        }*/

        if (balance < cutValue) {
            System.out.println("У Вас недостаточно средств. Пожалуйста пополните счет");

            return;
        }

        balance = balance - cutValue;
    }

}



