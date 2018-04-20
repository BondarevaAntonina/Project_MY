package homeworks.one_dim_array;

import org.eclipse.jetty.util.IO;

import java.util.Scanner;

/**
 * Created by antoni on 20.04.2018.
 * Создать класс Банковский счет.  Установить сумму для счета - 200$. Создать метод, который будет отнимать от счета
 * сумму. Если денег недостаточно,  тогда написать в консоль - "Пополните счет".  Счет можно пополнить другим методом.
 */
public class BankAccount {
    private double balance = 0;
    private String owner = "Владелец";
    private String currency;


    public BankAccount() {
    }

    public BankAccount(double initialBalance, String name, String currencyDollar) {
        balance = initialBalance;
        owner = name;
        currencyDollar = currency;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double cutBalance(double cutvalue) {
        if (balance >= cutvalue) {
            balance = balance - cutvalue;
        }
        else {
            System.out.println("У Вас не достаточно средств. Пожалуйста пополните счет");
        }
        return balance;
    }

}



