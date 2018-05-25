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
    public static void addElementToEnd(int[] arraylist, int element) {

        int[] myArray2 = new int[arraylist.length + 1];

        for (int j = 0; j < arraylist.length; j++) {

            myArray2[j] = arraylist[j];
        }

        myArray2[myArray2.length - 1] = element;


    }

//    public void addElement(int element) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                array[i] = element;
//                break;
//            }
//        }
//    }
//
//
//    //2 - create method for resizing array
//    public  void changeElementByIndex(int[] arraylist, int index, int value) {
//
//        arraylist[index] = value;
//    }
//
//    //3 - Delete items by index
//    public void deleteElementIndex(int[] arraylist, int index) throws Exception {
//
//        if (index < 0) {
//            throw new Exception("Index can't < 0");
//        }
//
//        if (index > arraylist.length - 1) {
//            throw new Exception("Index can't by > array size");
//        }
//
//        int[] newArray = new int[arraylist.length - 1];//rename
//
//        for (int i = 0, j = 0; i < arraylist.length; i++) {//test for deleting first and last element
//
//            if (i != index) {
//                newArray[j++] = arraylist[i];
//            }
//
//        }
//    }
//
//
//    //4 - Increase the sheet by a specified number of elements
//    public void addEmptyElement(int[] arraylist, int addcount) throws Exception {//rename
//
//        //new array with values already added
//        int[] tmpArray = new int[arraylist.length + addcount];
//
//        //copy the new array values from the old one
//        System.arraycopy(arraylist, 0, tmpArray, 0, arraylist.length);
//
//    }
//
//
//    //5 - Reducing the sheet to a specified number of elements
//    public void deleteEmptyElement(int[] arraylist, int colelement) throws Exception {//rename
//
//        if (colelement > arraylist.length)
//            throw new Exception("The number of elements removed is greater than the array");
///*
//        int[] newArray = new int[array.length - colelement];
//        for (int i = 0; i < array.length - colelement ; i++) {
//            newArray[i] = array[i];
//        }
//*/
////        return Arrays.copyOf(arraylist, arraylist.length - colelement);
//
//    }
//
//    //6 - Output elements to the console in the forward and reverse order
//    public void forwardReverseOrder(int[] arraylist) {//rename
//
//        for (int j = 0; j < arraylist.length; j++) {//foreach
//            System.out.println(arraylist[j]);
//        }
//    }
//
//    //7 - Output of elements to the console in the opposite direction
//    public void reverseOrder(int[] arraylist) {
//
//        for (int j = arraylist.length - 1; j >= 0; j--) {
//            System.out.println(arraylist[j]);
//        }
//    }
//
//    //8 - Sorting sheet by bubble method
//    public void blisterSort(int[] arrayList) {
//        for (int i = arrayList.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arrayList[j] > arrayList[j + 1]) {
//                    int tmp = arrayList[j];
//                    arrayList[j] = arrayList[j + 1];
//                    arrayList[j + 1] = tmp;
//                }
//            }
//        }
//    }
//
//    //9 - Adding an Array to an Array
//    public void addArrayToArray() {
//        /*
//        * array - 1 2 3 0 0 0 0 0, newArray - 4 5 6 -> 1 2 3 4 5 6 0 0
//        * 1) Проверяем наличие места
//        * 2) Если места достаточно - добавляем, нет - расширяем массив
//        * 3) Начинать вставлять массив с первого нуля
//        * */
//    }
//
//    //10 - Delete duplicates
//    //1 1 2 2 5 8 9 7
//    public void deleteDuplicat(int[] arrayList, int value) {
//
//        int dubCount = 0;
//
//        for (int j = 0; j < arrayList.length; j++) {
//            if (arrayList[j] == value) {
//                dubCount++;
//            }
//        }
//
//        int[] tempArray = arrayList;
//
//        if (dubCount > 1) {
//            int[] tmpArray = new int[arrayList.length - dubCount];//rename
//            int t = 0;
//
//            for (int j = 0; j < arrayList.length; j++) {
//                if (arrayList[j] != value) {
//                    tmpArray[t] = arrayList[j];
//                    t++;
//                }
//            }
//
//            tempArray = tmpArray;
//        }
//
//    }
//
//    //11 - Searching for an element using the linear search method
//    public void searchLinear(int[] arraylist, int item) {
//
//        boolean isValue = false;
//
//        for (int d = 0; d < arraylist.length; d++) {
//            if (arraylist[d] == item) {
//                System.out.println(item + " present oneself " + (d + 1) + " on account in an array");
//
//                isValue = true;
//
//                break;
//            }
//        }
//
//        if (!isValue) {
//            System.out.println("Number " + item + " not found in array");
//        }

//    }


    public void toString(int[] val) {//remove and replace on call printForwardOrder
        for (int j = 0; j < val.length; j++) {
            System.out.print(" " + val[j]);
        }
    }


}


