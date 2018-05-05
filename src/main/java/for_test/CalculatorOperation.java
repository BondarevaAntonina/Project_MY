package for_test;

import java.util.Random;

/**
 * Created by antoni on 25.04.2018.
 * Создать калькулятор:
 * Метод класса возвращает значение для операции. Создать методы под действия *, /, -, +, %.
 * Создать два public метода, возвращающих случайные числа.
 * Каждый метод класса вызывает один из методов(возвращают случайные числа), чтобы получить значения для операций.
 * Протестировать методы, выполняющие мат. действия. Для каждой операции в тесте возвращать разные значения используя Mockito + verify.
 * Создать private методы, возвращающих случ. числа и сделать аналогичные операции, использовав PowerMock + verify.
 * Создать public static методы, возвращающих случ. числа и сделать аналогичные операции.PowerMock + verify
 */

public class CalculatorOperation {

    // metod *
    public int multiply(int value1, int value2) {

        return value1 * value2 + getValue();

    }

    // metod /
    public int divide(int value1, int value2) {
        try {
            int p = value1 / value2;
        } catch (ArithmeticException e) {
            System.out.println(e + " арифметичесская ошибка");
        }
        return (value1 / value2);
    }

    // metod -
    public int minus(int value1, int value2) {
        return value1 - value2 + getValue();
    }


//    // metod %
//    public int percent(int value1, int value2) {
//        return value1 + value2 + getValue();
//    }

    public int sum() {
        return getValueOne() + getValueTwo();
    }

    private int getValue() {

        int anotherValue = getValueOne();

        int anotherValue1 = getValueOne();


        return new Random().nextInt(20) + anotherValue + anotherValue1;
    }

    public int getValueOne() {
        return new Random().nextInt(15);
    }

    public int getValueTwo() {
        return new Random().nextInt(15);
    }

}

