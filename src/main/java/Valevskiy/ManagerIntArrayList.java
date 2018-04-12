package Valevskiy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by antoni on 10.04.2018.
 */
public class ManagerIntArrayList {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int actionNumber;
        do{
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
            System.out.println("3 - Поиск элемента методом линейного поиска");
            System.out.println("0 - Выход");
            try{
                actionNumber = Integer.parseInt(reader.readLine());
            }catch(Exception e){
                System.out.println("Ошибка ввода: " + e);
                actionNumber = -1;
            }
        }while(actionNumber != 0);
    }


}


