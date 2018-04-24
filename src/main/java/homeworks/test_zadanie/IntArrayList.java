package homeworks.test_zadanie;

/**
 * Создать имитацию коллекции(с помощью массива) ArrayList для работы с типом int.
 * Создать класс с полем типа массив.
 * Класс должен выполнять следующие операции:
 * 1) добавление элементов.
 * 2) изменение/удаление элементов по индексу.
 * 3) увеличение листа на заданное количество элементов.
 * 4) уменьшение листа до заданного количество элементов.
 * 5) вывод элементов в консоль в прямом и обратном порядке.
 * 6) сортировка листа методом пузырька(http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/).
 * 7) добавление массива в массив.
 * 8) удалять дубликаты.
 * 9) Поиск элемента методом линейного поиска.
 * При удалении элемента не обнулять его, а удалять физически.
 * Начальную размерность листа юзер вводит с консоли.
 * Создать меню для работы с листом из консоли.
 * Условие добавления: перезаписывать если элемент равен 0;
 * Все действия юзера записывать в файл с название Logs.txt в формате дата + название метода + входящие параметры.
 * По запросу юзера выводить в консоль данные файла Logs.txt.
 * При работе с файлами использовать класс Files. В задаче не использовать методы класса Arrays и коллекции.
 * Создать меню.
 */
public class IntArrayList {

    private int[] array;

    public IntArrayList() {
        array = new int[10];//0
    }

    public static void main(String[] args) {
        int[] myArray = new int[27];

        int length = myArray.length;

        for (int i = 0; i < length; i++) {
            myArray[i] = i;

            System.out.println("The last element of the array " + myArray[i]);
        }

        System.out.println(length);
    }

    //1 - Adding an item to the list
    public void addElement(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = element;
                break;
            }
            System.out.println();
        }
    }

    //2 - create method for resizing array
    public void removeElementByIndex(int index, int newElement) {
        array[index] = newElement;
    }

    //3 - Delete items by index
    public void deleteElementIndex(int index, int newElement) {
        array[index] = newElement;
        if (index >= 0 && index < array.length) {
            int[] copy = new int[array.length - 1];
            System.out.println();
        }
        return;
    }

    //4 - Increase the sheet by a specified number of elements
    public void increaseElement() {

    }

    //5 - Reducing the sheet to a specified number of elements
    public void decreasingElement() {

    }

    //6 - Output elements to the console in the forward and reverse order
    public void forwardReverseOrder() {

    }

    //7 - Sorting sheet by bubble method
    public void blisterSort() {

    }

    //8 - Adding an Array to an Array
    public void addArrayToArray() {

    }

    //9 - Delete duplicates
    public void deleteDuplicat() {

    }

    //10 - Searching for an element using the linear search method
    public void searchLinear() {

    }

}

