package homeworks.test_zadanie;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Objects;

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
 * Выводить логи в консоль по определенному методу.
 * При работе с файлами использовать класс Files. В задаче не использовать методы класса Arrays и коллекции, System class.
 * Создать меню.
 * ###############
 * <p>
 * 1) Remove static
 * 2) All methods should be void
 * 3) Constructor - new int[10] + resize
 */

public class MyArrayList {


    private int[] mArraylist;

    public MyArrayList() {
        mArraylist = new int[10];//0
    }

    public void setArray(int[] array) {
        this.mArraylist = array;
    }


    //1 - Add an item to the list
    public void addElement(int value) {

        if (value == 0) {

            return;
        }

        String log = LocalDateTime.now() + "\taddElement" + "\tincoming param -> " + value;

        writeLog(log);


        resizeArray();

        for (int i = 0; i < mArraylist.length; i++) {

            if (mArraylist[i] == 0) {

                mArraylist[i] = value;

                break;
            }

        }
        System.out.println();
    }


    //2 - create method for resizing array

    public void changeElementByIndex(int index, int value) {

        String log = LocalDateTime.now() + "\tchangeElementByIndex" + "\tincoming param -> " + index + "\tincoming param -> " + value;

        writeLog(log);

        mArraylist[index] = value;
    }

    //3 - Delete items by index
    public void deleteElementByIndex(int index) throws Exception {

        String log = LocalDateTime.now() + "\tdeleteElementByIndex" + "\tincoming param -> " + index;

        writeLog(log);

        if (index < 0) {

            throw new Exception("Index can't < 0");

        }

        if (index > mArraylist.length - 1) {

            throw new Exception("Index can't by > array size");
        }

        int[] newArray = new int[mArraylist.length - 1];

        for (int i = 0, j = 0; i < mArraylist.length; i++) {

            if (i != index) {
                newArray[j++] = mArraylist[i];
            }

        }

        mArraylist = newArray;
    }

    //4 - Increase the sheet by a specified number of elements
    public void increaseArray(int addcount) throws Exception {

        String log = LocalDateTime.now() + "\tincreaseArray" + "\tincoming param -> " + addcount;

        writeLog(log);

        //new array with values already added
        int[] tmpArray = new int[mArraylist.length + addcount];

        //copy the new array values from the old one
        System.arraycopy(mArraylist, 0, tmpArray, 0, mArraylist.length);

        mArraylist = tmpArray;
    }

    //5 - Reducing the sheet to a specified number of elements
    public void decreaseArray(int colelement) throws Exception {

        String log = LocalDateTime.now() + "\tdecreaseArray" + "\tincoming param -> " + colelement;

        writeLog(log);

        if (colelement > mArraylist.length)
            throw new Exception("The number of elements removed is greater than the array");

        int[] newArray = new int[mArraylist.length - colelement];

        for (int i = 0; i < mArraylist.length - colelement; i++) {

            newArray[i] = mArraylist[i];
        }

        mArraylist = newArray;

    }

    //6 - Output elements to the console in the forward and reverse order
    public void printInRightOrder() {

        String log = LocalDateTime.now() + "\tprintInRightOrder";

        writeLog(log);

        String result = "";

        for (int i = 0; i < mArraylist.length; i++) {

            result = result.concat(String.valueOf(mArraylist[i]));

            if (i != mArraylist.length - 1) {

                result = result.concat(",");
            }

        }

        System.out.print("The array consists of: " + result + "\n");
    }

    //7 - Output of elements to the console in the opposite direction
    public void printInReverseOrder() {

        String log = LocalDateTime.now() + "\tprintInReverseOrder" + "\t";

        writeLog(log);

        String result = "";

        for (int j = mArraylist.length - 1; j >= 0; j--) {

            result = result.concat(String.valueOf(mArraylist[j]));

            if (j != mArraylist.length + 1) {

                result = result.concat(",");
            }
        }
        System.out.print(result + "\n");
    }

    //8 - Sorting sheet by bubble method
    public void blisterSort() {

        String log = LocalDateTime.now() + "\tblisterSort" + "\t";

        writeLog(log);

        for (int i = mArraylist.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (mArraylist[j] > mArraylist[j + 1]) {

                    int tmp = mArraylist[j];

                    mArraylist[j] = mArraylist[j + 1];

                    mArraylist[j + 1] = tmp;
                }
            }
        }
    }

    //9 - Adding an Array to an Array
    public void addArrayToArray(int[] newArray) {

        String log = LocalDateTime.now() + "\taddArrayToArray" + "\tincoming param -> " + newArray;

        writeLog(log);


        // Checking for space availability
        int countZero = 0;

        for (int i : mArraylist) {

            if (i == 0) countZero++;
        }

        // Check availability

        if (newArray.length >= countZero) {

            //places are not enough
            int[] tmpArray = new int[mArraylist.length + newArray.length - countZero];

            System.arraycopy(mArraylist, 0, tmpArray, 0, mArraylist.length);

            mArraylist = tmpArray;
        }

        // Begin to insert an array from the first zero
        int newarrayIndex = 0;

        for (int i = 0; i < mArraylist.length; i++) {

            if (mArraylist[i] == 0) {

                mArraylist[i] = newArray[newarrayIndex];

                newarrayIndex++;
            }
            if (newarrayIndex >= newArray.length) break;
        }


    }
//        /*
//        * array - 1 2 3 0 0 0 0 0, newArray - 4 5 6 -> 1 2 3 4 5 6 0 0
//        * 1) Проверяем наличие места
//        * 2) Если места достаточно - добавляем, нет - расширяем массив
//        * 3) Начинать вставлять массив с первого нуля
//        * */


    //10 - Delete duplicates

    public void deleteDuplicates() throws Exception {

        String log = LocalDateTime.now() + "\tdeleteDuplicates" + "\t";

        writeLog(log);

        for (int i = 0; i < mArraylist.length; i++) {

            for (int j = 0; j < mArraylist.length; j++) {

                if (mArraylist[i] == mArraylist[j]) {

                    deleteElementByIndex(j);
                }
            }
        }
    }


    //11 - Searching for an element using the linear search method
    public void searchLinear(int item) {

        String log = LocalDateTime.now() + "\tsearchLinear" + "\tincoming param -> " + item;

        writeLog(log);

        boolean isValue = false;

        for (int d = 0; d < mArraylist.length; d++) {

            if (mArraylist[d] == item) {

                System.out.println(item + " present oneself " + (d + 1) + " on account in an array");

                isValue = true;

                break;
            }
        }
        if (!isValue) {

            System.out.println("Number " + item + " not found in array");
        }
    }


    public void resizeArray() {

        String log = LocalDateTime.now() + "\tresizeArray" + "\t";

        writeLog(log);

        if (mArraylist[mArraylist.length - 1] != 0) {

            int newSize = mArraylist.length * 2;

            int[] tmpArray = new int[newSize];

            System.arraycopy(mArraylist, 0, tmpArray, 0, mArraylist.length);

            mArraylist = tmpArray;
        }
    }


    private void writeLog(String log) {

        Path path = Paths.get("./Logs", "Logs.txt");

        try {

            Files.write(path, ("\n" + log).getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

    public static void readLogs() throws IOException {
        Path path = Paths.get("./Logs", "Logs.txt");

        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line;

            while (Objects.nonNull(line = reader.readLine())) {
                System.out.println(line);
            }
        }
    }


    public void readLogsByMethod(String metod) throws IOException {
        Path path = Paths.get("./Logs", "Logs.txt");

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;

            while (Objects.nonNull(line = reader.readLine()))  {
                if (line.contains(metod)) {
                    System.out.println(line);
                }
            }
        }
    }
}
