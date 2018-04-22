package for_test;

import java.util.Random;

public class Calculator {
    public int sum(int value1, int value2) {
        return value1 + value2 + getValue();
    }

    public int sumParams(int value1, int value2) {
        return value1 + value2;
    }

    private int getValue() {

        int anotherValue = getAnotherValue();

        int anotherValue1 = getAnotherValue();

        int anotherValue2 = getAnotherValue();

        return new Random().nextInt(20) + anotherValue + anotherValue1;
    }

    public int getAnotherValue() {
        return new Random().nextInt(20);
    }

    public boolean getBool() {
        return true;
    }

    public static int getStaticValue() {
        return new Random().nextInt(20);
    }

}
