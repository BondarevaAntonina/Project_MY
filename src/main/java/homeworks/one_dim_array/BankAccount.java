package homeworks.one_dim_array;

import org.eclipse.jetty.util.IO;

import java.util.Scanner;

/**
 * Created by antoni on 20.04.2018.
 * Создать класс Банковский счет.  Установить сумму для счета - 200$. Создать метод, который будет отнимать от счета
 * сумму. Если денег недостаточно,  тогда написать в консоль - "Пополните счет".  Счет можно пополнить другим методом.
 */
public class BankAccount {
    private double balance = 200.0;
    private String owner = "Владелец";
    private String currency;


    public BankAccount() {
    }

    public BankAccount(double initialBalance, String name, String currencyDollar) {
        balance = initialBalance;
        owner = name;
        currencyDollar = currency;

    }

    public String getValuta() {
        return currency;
    }

    public void setValuta(String valuta) {
        this.currency = valuta;
    }

    public double getSum() {
        return balance;
    }

    public void setSum(double sum) {
        this.balance = sum;
    }


}



