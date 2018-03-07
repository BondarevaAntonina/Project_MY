package lesson;

import java.util.Scanner;

/**
 * Created by antoni on 15.02.2018.
 */
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("ты пошел в школу");
                break;
            case 18:
                System.out.println("ты закончил школу");
                break;
                default:
                    System.out.println("не одно из предыдущих условий не подошло");
        }
    }
}
