package homeworks.test_zadanie;

import java.util.Arrays;


/**
 * Создать имитацию коллекции(с помощью массива) ArrayList для работы с типом int.
 * Создать класс с полем типа массив.
 * Класс должен выполнять следующие операции:
 * 1) добавление элементов. СДЕЛАНО
 * 2) изменение/удаление элементов по индексу.  При удалении элемента не обнулять его, а удалять физически. СДЕЛАНО
 * 3) увеличение листа на заданное количество элементов. СДЕЛАНО
 * 4) уменьшение листа до заданного количество элементов. СДЕЛАНО
 * 5) вывод элементов в консоль в прямом и обратном порядке. СДЕЛАНО
 * 6) сортировка листа методом пузырька(http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/). СДЕЛАНО
 * 7) добавление массива в массив. СДЕЛАНО
 * 8) удалять дубликаты. СДЕЛАНО
 * 9) Поиск элемента методом линейного поиска.
 * Начальную размерность листа юзер вводит с консоли. СДЕЛАНО
 * Создать меню для работы с листом из консоли.  СДЕЛАНО
 * Условие добавления: перезаписывать если элемент равен 0;
 * Все действия юзера записывать в файл с название Logs.txt в формате дата + название метода + входящие параметры.
 * По запросу юзера выводить в консоль данные файла Logs.txt.
 * При работе с файлами использовать класс Files. В задаче не использовать методы класса Arrays и коллекции, System class.
 * Создать меню.
 * ###############
 * <p>
 * 1) Remove static
 * 2) All methods should be void
 * 3) Constructor - new int[10] + resize
 */
public class IntArrayList {

    private int[] array;

    public IntArrayList() {
        array = new int[10];
    }

    //1 - Add an item to the list
    public static int[] addElementToEnd(int[] arraylist, int element) {

        int[] myArray2 = new int[arraylist.length + 1];

        for (int j = 0; j < arraylist.length; j++) {

            myArray2[j] = arraylist[j];
        }

        myArray2[myArray2.length - 1] = element;

        return myArray2;
    }

    public void addElement(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = element;
                break;
            }
        }
    }


    //2 - create method for resizing array
    public static int[] changeElementByIndex(int[] arraylist, int index, int value) {
        arraylist[index] = value;
        return arraylist;
    }

    //3 - Delete items by index
    public static int[] deleteElementIndex(int[] arraylist, int index) throws Exception {

        if (index < 0) {
            throw new Exception("Index can't < 0");
        }

        if (index > arraylist.length - 1) {
            throw new Exception("Index can't by > array size");
        }

        int[] new_array = new int[arraylist.length - 1];//rename

        for (int i = 0, j = 0; i < arraylist.length; i++) {//test for deleting first and last element

            if (i != index) {
                new_array[j++] = arraylist[i];
            }

        }
        return new_array;
    }


    //4 - Increase the sheet by a specified number of elements
    public static int[] addEmptyElement(int[] arraylist, int addcount) throws Exception {//rename

        //new array with values already added
        int[] tmparray = new int[arraylist.length + addcount];

        //copy the new array values from the old one
        System.arraycopy(arraylist, 0, tmparray, 0, arraylist.length);

        return tmparray;
    }


    //5 - Reducing the sheet to a specified number of elements
    public static int[] deleteEmptyElement(int[] arraylist, int colelement) throws Exception {//rename

        if (colelement > arraylist.length)
            throw new Exception("The number of elements removed is greater than the array");
/*
        int[] new_array = new int[array.length - colelement];
        for (int i = 0; i < array.length - colelement ; i++) {
            new_array[i] = array[i];
        }
*/
        return Arrays.copyOf(arraylist, arraylist.length - colelement);

    }

    //6 - Output elements to the console in the forward and reverse order
    public static int[] forwardReverseOrder(int[] arraylist) {//rename

        for (int j = 0; j < arraylist.length; j++) {//foreach
            System.out.println(arraylist[j]);
        }
        return arraylist;
    }

    //7 - Output of elements to the console in the opposite direction
    public static int[] reverseOrder(int[] arraylist) {

        for (int j = arraylist.length - 1; j >= 0; j--) {
            System.out.println(arraylist[j]);
        }
        return arraylist;
    }

    //8 - Sorting sheet by bubble method
    public static int[] blisterSort(int[] arraylist) {
        for (int i = arraylist.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arraylist[j] > arraylist[j + 1]) {
                    int tmp = arraylist[j];
                    arraylist[j] = arraylist[j + 1];
                    arraylist[j + 1] = tmp;
                }
            }
        }
        return arraylist;
    }

    //9 - Adding an Array to an Array
    public void addArrayToArray() {
        /*
        * array - 1 2 3 0 0 0 0 0, newArray - 4 5 6 -> 1 2 3 4 5 6 0 0
        * 1) Проверяем наличие места
        * 2) Если места достаточно - добавляем, нет - расширяем массив
        * 3) Начинать вставлять массив с первого нуля
        * */
    }

    //10 - Delete duplicates
    //1 1 2 2 5 8 9 7
    public static int[] deleteDuplicat(int[] arraylist, int value) {

        int dub_count = 0;

        for (int j = 0; j < arraylist.length; j++) {
            if (arraylist[j] == value) {
                dub_count++;
            }
        }

        int[] tempArray = arraylist;

        if (dub_count > 1) {
            int[] tmp_array = new int[arraylist.length - dub_count];//rename
            int t = 0;

            for (int j = 0; j < arraylist.length; j++) {
                if (arraylist[j] != value) {
                    tmp_array[t] = arraylist[j];
                    t++;
                }
            }

            tempArray = tmp_array;
        }

        return tempArray;
    }

    //11 - Searching for an element using the linear search method
    public static int[] searchLinear(int[] arraylist, int item) {

        boolean isValue = false;

        for (int d = 0; d < arraylist.length; d++) {
            if (arraylist[d] == item) {
                System.out.println(item + " present oneself " + (d + 1) + " on account in an array");

                isValue = true;

                break;
            }
        }

        if (!isValue) {
            System.out.println("Number " + item + " not found in array");
        }


        return arraylist;
    }


    public static void toString(int[] val) {//remove and replace on call printForwardOrder
        for (int j = 0; j < val.length; j++) {
            System.out.print(" " + val[j]);
        }
    }
}

