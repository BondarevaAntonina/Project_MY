package Valevskiy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
            System.out.println("2 - Изъятие элемента из списока");
            System.out.println("3 - Расширение списка");
            System.out.println("4 - Уменьшение списка");
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
