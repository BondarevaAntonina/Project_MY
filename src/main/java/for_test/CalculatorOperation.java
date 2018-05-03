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

//---------------------------------------------------
public class CalculatorOperation {

    private int d1;
    private int d2;


    public int multiply(int d1, int d2) {
        return multiply(d1, d2);
    }

    public int divide(int d1, int d2) {
        return divide(d1, d2);
    }

    public int minus(int d1, int d2) {
        return minus(d1, d2);
    }

    public int add(int d1, int d2) {
        return add(d1, d2);
    }

    public int percent(int d1, int d2) {
        return percent(d1, d2);
    }

    public int getAnotherValue() {
        return new Random().nextInt(20);
    }

}

