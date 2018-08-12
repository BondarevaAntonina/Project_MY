package homeworks.generic_home;


/**
 * Create a generic class ArrayWorker with generic array field for working Integer and Double
 * Add code to counts the number of elements in each of arrays that are greater
 * than a specified element.
 * <p>
 * Создайте общий класс ArrayWorker с общим полем массива для работы Integer и Double
 *     Добавьте код, чтобы подсчитать количество элементов в каждом из массивов, которые больше
 *     чем указанный элемент.
 */

public class ArrayWorker {

    public static void main(String[] args) {
        GeneralArray<Integer, Double> integerType = new GeneralArray<>();

        Integer[] arrayInt = {1, 2, 3};

        Double[] arrayDouble = {1D, 2D, 3D};

    }


}

class GeneralArray<T, D extends Number> {
    private T[] arrayInt;
    private D[] arrayDouble;

    public T[] getArrayInt() {
        return arrayInt;
    }

    public void setArrayInt(T[] arrayInt) {
        this.arrayInt = arrayInt;
    }

    public D[] getArrayDouble() {
        return arrayDouble;
    }

    public void setArrayDouble(D[] arrayDouble) {
        this.arrayDouble = arrayDouble;
    }


    public static <T, D extends Number> void methodcalcNum(T[] arrayInt, D[] arrayDouble, T maxElem, D maxElemD) {

        int count = 0;

        for (T t : arrayInt) {

        }


        System.out.println(count);
    }

}
