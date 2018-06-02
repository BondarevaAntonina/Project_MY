package homeworks.test_zadanie;

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

    }

    //5 - Reducing the sheet to a specified number of elements
    public void decreaseArray(int colelement) throws Exception {

        if (colelement > mArraylist.length)
            throw new Exception("The number of elements removed is greater than the array");

        int[] newArray = new int[mArraylist.length - colelement];
        for (int i = 0; i < mArraylist.length - colelement; i++) {
            newArray[i] = mArraylist[i];
        }
    }

    //6 - Output elements to the console in the forward and reverse order
    public void printInRightOrder() {

//        for (int j = 0; j < mArraylist.length; j++) {
//            System.out.println(mArraylist[j]);
//        }

        for (int j : mArraylist) {
            System.out.println(mArraylist[j]);
        }
    }

    //7 - Output of elements to the console in the opposite direction
    public void printInReverseOrder() {

        for (int j = mArraylist.length - 1; j >= 0; j--) {
            System.out.print(mArraylist[j]);
        }

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

    }

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


    public void toString1() {
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


}
