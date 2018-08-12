package homeworks.generic_home;

import java.util.Arrays;

/**
 * Created by antoni on 10.08.2018.
 * <p>
 * Create class MyTestMethod with generic static methodcalcNum (with two parameters: an array T[] and
 * variable maxElem of type T) that counts the number of elements in
 * an array T[] that are greater than a specified element maxElem.
 *
 * Создайте класс MyTestMethod с помощью общего static methodcalcNum (с двумя параметрами: массив T [] и
 *   * переменная maxElem типа T), которая подсчитывает количество элементов в
 *   * массив T [], который больше заданного элемента maxElem.
 */

public class MyTestMethod {


    public static void main(String[] args) {
        Integer[] array = {8, 6, 7, 5, 5};

        CalcNum.methodcalcNum(array, 5);

    }
}


class CalcNum {
    public static <T extends Comparable<T>> void methodcalcNum(T[] array, T maxElem) {

        int count = 0;

        for (T t : array) {
            if (t.compareTo(maxElem) > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
