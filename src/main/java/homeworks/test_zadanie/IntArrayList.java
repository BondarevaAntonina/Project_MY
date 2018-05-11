package homeworks.test_zadanie;

import java.util.Arrays;

/**
 * Создать имитацию коллекции(с помощью массива) ArrayList для работы с типом int.
 * Создать класс с полем типа массив.
 * Класс должен выполнять следующие операции:
 * 1) добавление элементов. СДЕЛАНО
 * 2) изменение/удаление элементов по индексу.  При удалении элемента не обнулять его, а удалять физически. ЧАСТИЧНО СДЕЛАНО
 * 3) увеличение листа на заданное количество элементов. СДЕЛАНО
 * 4) уменьшение листа до заданного количество элементов.
 * 5) вывод элементов в консоль в прямом и обратном порядке.
 * 6) сортировка листа методом пузырька(http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/).
 * 7) добавление массива в массив.
 * 8) удалять дубликаты.
 * 9) Поиск элемента методом линейного поиска.
 * Начальную размерность листа юзер вводит с консоли.
 * Создать меню для работы с листом из консоли.
 * Условие добавления: перезаписывать если элемент равен 0;
 * Все действия юзера записывать в файл с название Logs.txt в формате дата + название метода + входящие параметры.
 * По запросу юзера выводить в консоль данные файла Logs.txt.
 * При работе с файлами использовать класс Files. В задаче не использовать методы класса Arrays и коллекции.
 * Создать меню.
 */
public class IntArrayList {


    //1 - Add an item to the list
    public static int[] addElementToEnd(int[] array, int element) {

        int[] myArray2 = new int[array.length + 1];

        for (int j = 0; j < array.length; j++) {

            myArray2[j] = array[j];
        }

        myArray2[myArray2.length - 1] = element;

        return myArray2;
    }


    //2 - create method for resizing array
    public static int[] removeElementByIndex(int[] array, int index, int value) {
        array[index] = value;
        return array;
    }

    //3 - Delete items by index
    public static int[] deleteElementIndex(int[] array, int index) throws Exception {

        if (index < 0) throw new Exception("Index can't < 0");

        if (index > array.length - 1) throw new Exception("Index can't by > array size");

        int[] new_array = new int[array.length - 1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (i != index) new_array[j++] = array[i];

        }
        return new_array;
    }


    //4 - Increase the sheet by a specified number of elements
    public static int[] addEmptyElement(int[] array, int addcount) throws Exception {

        //new array with values already added
        int[] tmparray = new int[array.length + addcount];

        //copy the new array values from the old one
        System.arraycopy(array, 0, tmparray, 0, array.length);

        return tmparray;
    }


    //5 - Reducing the sheet to a specified number of elements
    public static int[] deleteEmptyElement(int[] array, int colelement) throws Exception {

        if (colelement > array.length) throw new Exception("The number of elements removed is greater than the array");
/*
        int[] new_array = new int[array.length - colelement];
        for (int i = 0; i < array.length - colelement ; i++) {
            new_array[i] = array[i];
        }
*/
        return Arrays.copyOf(array, array.length - colelement);

    }

    //6 - Output elements to the console in the forward and reverse order
    public static int[] forwardReverseOrder(int[] array) {

        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        return array;
    }

    //7 - Output of elements to the console in the opposite direction
    public static int[] reverseOrder(int[] array) {

        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println(array[j]);
        }
        return array;
    }

    //8 - Sorting sheet by bubble method
    public void blisterSort() {

    }

    //9 - Adding an Array to an Array
    public void addArrayToArray() {

    }

    //10 - Delete duplicates
    public void deleteDuplicat() {

    }

    //11 - Searching for an element using the linear search method
    public void searchLinear() {

    }

    public static void toString(int[] val) {
        for (int j = 0; j < val.length; j++) {
            System.out.print(" " + val[j]);
        }
    }
}

