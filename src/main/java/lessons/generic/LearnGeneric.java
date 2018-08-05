package lessons.generic;

import java.util.Arrays;

public class LearnGeneric {

    public static <E> void printArray(E[] array) {
        System.out.println(Arrays.toString(array));
    }

    public <E> void printArrayNotStatic(E[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        CommonType<Integer, Double, String> integerType = new CommonType<>();

        CommonType<Double, String, Integer> doubleType = new CommonType<>();

        Integer[] arrayInt = {1, 2, 3};

        Double[] arrayDouble = {1D, 2D, 3D};

        integerType.setArray(arrayInt);

//        integerType.print();

        printArray(arrayDouble);
    }
}

class CommonType<T, F, Y> {
    T[] array;
    F[] arrayE;
    Y[] arrayY;

    public void print() {
        System.out.println(Arrays.toString(array));
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}

class WorkInteger {
    private Integer[] array;

    //methods for work with array
}

class WorkDouble {
    private Double[] array;

    //methods for work with array
}