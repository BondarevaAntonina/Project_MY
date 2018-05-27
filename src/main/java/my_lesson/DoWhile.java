package my_lesson;

import java.util.Scanner;

/**
 * Created by antoni on 15.02.2018.
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } while (value!=5);
        System.out.println("Вы ввели 5");
    }
}


//public class DoWhile {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введи 5");
//        int value = scanner.nextInt();
//        while (value != 5) {
//            System.out.println("Введи 5");
//            value = scanner.nextInt();
//        }
//        System.out.println("Вы ввели 5");
//    }
//}