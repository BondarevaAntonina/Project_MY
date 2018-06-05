package homeworks.test_zadanie;

import static homeworks.test_zadanie.OperationArray.SCANNER;

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
 * 7) добавление массива в массив.
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
            System.out.println();//
            return;
        }

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

        mArraylist[index] = value;
    }

    //3 - Delete items by index
    public void deleteElementByIndex(int index) throws Exception {

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

        //new array with values already added
        int[] tmpArray = new int[mArraylist.length + addcount];

        //copy the new array values from the old one
        System.arraycopy(mArraylist, 0, tmpArray, 0, mArraylist.length);
        mArraylist = tmpArray;
    }

    //5 - Reducing the sheet to a specified number of elements
    public void decreaseArray(int colelement) throws Exception {

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
        String result = "";
        for (int i = 0; i < mArraylist.length; i++) {//fpreach

            result = result.concat(String.valueOf(mArraylist[i]));

            if (i != mArraylist.length - 1) {
                result = result.concat(",");
            }

        }

        System.out.print(result);
        System.out.println();
    }

    //7 - Output of elements to the console in the opposite direction
    public void printInReverseOrder() {
        String result = "";

        for (int j = mArraylist.length - 1; j >= 0; j--) {

            result = result.concat(String.valueOf(mArraylist[j]));

            if (j != mArraylist.length + 1) {

                result = result.concat(",");
            }
        }
        System.out.print(result);
        System.out.println();
    }

    //8 - Sorting sheet by bubble method
    public void blisterSort() {
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

    //10 - Delete duplicates
    //1 1 2 2 5 8 9 7
    public void deleteDuplicat() {

        int n = mArraylist.length;

        for (int i = 0, m = 0; i != n; i++, n = m) {

            for (int j = m = i + 1; j != n; j++) {

                if (mArraylist[j] != mArraylist[i]) {

                    if (m != j) mArraylist[m] = mArraylist[j];
                    m++;
                }
            }
        }
        if (n != mArraylist.length) {

            int[] b = new int[n];

            for (int i = 0; i < n; i++) b[i] = mArraylist[i];

            mArraylist = b;
        }

        for (int x : mArraylist)

            System.out.print(x + " ");
            System.out.println();


    }

    //9 - Adding an Array to an Array
    public void addArrayToArray(int size) {
        int newArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = SCANNER.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        /*
        Scanner input = new Scanner(System.in); // Объявляем Scanner
    System.out.println("Enter array length: ");

    int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
    int array[] = new int[size]; // Создаём массив int размером в size
    System.out.println("Insert array elements:");
//    /*Пройдёмся по всему массиву, заполняя его*/
//        for (int i = 0; i < size; i++) {
//            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
//        }
//        System.out.print ("Inserted array elements:");
//        for (int i = 0; i < size; i++) {
//            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
//        }
//        System.out.println();
//
//         */

        int length = 5;



//        //define the new array
//        int[] newArray = new int[mArraylist.length + 1];

        //copy values into new array
        for (int i = 0; i < mArraylist.length; i++) {
            newArray[i] = mArraylist[i];
        }
        //another solution is to use
        System.arraycopy(mArraylist, 0, newArray, 0, mArraylist.length);

        //add new value to the new array
        newArray[newArray.length - 1] = size;
        //copy the address to the old reference
        //the old array values will be deleted by the Garbage Collector
        mArraylist = newArray;

    }
//        /*
//        * array - 1 2 3 0 0 0 0 0, newArray - 4 5 6 -> 1 2 3 4 5 6 0 0
//        * 1) Проверяем наличие места
//        * 2) Если места достаточно - добавляем, нет - расширяем массив
//        * 3) Начинать вставлять массив с первого нуля
//        * */


    //11 - Searching for an element using the linear search method
    public void searchLinear(int item) {

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
}
