package homeworks.test_zadanie;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by antoni on 10.04.2018.
 */
public class ManagerIntArrayList {

    IntArrayList list = new IntArrayList();

    protected void doAction(int actionNum) {
        switch (actionNum) {
            case 1:
                list.addElement(5);
            case 2:
                list.changeElementByIndex(0,7);
            case 3:
                list.deleteElementIndex();
            case 4:
                list.increaseElement();
            case 5:
                list.decreasingElement();
            case 6:
                list.forwardReverseOrder();
            case 7:
                list.blisterSort();
            case 8:
                list.addArrayToArray();
            case 9:
                list.deleteDuplicat();
            case 10:
                list.searchLinear();
            case 0:
                return;
            default:
                break;
        }
    }

    public void showMenu(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int actionNumber;
        do {
            System.out.println("------- Меню -----------");
            System.out.println("1 - Печать всех элементов");
            System.out.println("2 - Добавлеие элемента в список");
            System.out.println("3 - Изменение/удаление элементов по индексу");
            System.out.println("4 - Увеличение листа на заданное количество элементов");
            System.out.println("5 - Уменьшение листа до заданного количество элементов");
            System.out.println("6 - Вывод элементов в консоль в прямом и обратном порядке");
            System.out.println("7 - сортировка листа методом пузырька");
            System.out.println("8 - добавление массива в массив");
            System.out.println("9 - Удалять дубликаты");
            System.out.println("10 - Поиск элемента методом линейного поиска");
            System.out.println("0 - Выход");
            try {
                actionNumber = Integer.parseInt(reader.readLine());
                doAction(actionNumber);
            } catch (Exception e) {
                System.out.println("Ошибка ввода: " + e);
                actionNumber = -1;
            }
        } while (actionNumber != 0);

        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            actionNumber = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.println(actionNumber);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }


}


