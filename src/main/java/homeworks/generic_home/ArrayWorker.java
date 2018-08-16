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

        Integer[] arrayInt = {1, 2, 3, 1};

        Double[] arrayDouble = {1D, 2D, 3D, 1D};

        GeneralArray<Integer> integerType = new GeneralArray<>(arrayInt);

        GeneralArray<Double> doubleType = new GeneralArray<>(arrayDouble);

        integerType.methodcalcNum(1);
        doubleType.methodcalcNum(1);
    }


}

class GeneralArray<D extends Number> {
    private D[] array;

    public GeneralArray(D[] array) {
        this.array = array;
    }

    public <D extends Number> void methodcalcNum(D maxElem) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].doubleValue() == maxElem.doubleValue()) {
                count++;
            }
        }

        System.out.println(count);
    }

}
