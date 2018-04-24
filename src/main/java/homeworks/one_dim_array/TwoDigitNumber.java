package homeworks.one_dim_array;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by antoni on 24.04.2018.
 * В двумерном массиве натуральных случайных чисел от 10 до 99 найти количество всех двухзначных чисел, у которых сумма цифр кратная 2.
 */
public class TwoDigitNumber {
    private static Scanner in;

    public static void main (String[]args){
        Scanner in = new Scanner(System.in);

            int row = 4;

            int column = 4;

            Random random = new Random();

            int[][] array = new int[row][column];

            for (int x = 0; x < row; x++) {
                for (int j = 0; j < column; j++) {
                    array[x][j] = random.nextInt(100);
                    System.out.print(array[x][j] + "\t");
                }
                System.out.println();

            }
            int sum = 0;
        while (true) {
            int number = in.nextInt();
            if (number >= 100 || number <= 9) {
                break;
            } else {
                String str = "" + number;
                String numb1 = str.substring(0, 1);
                String numb2 = str.substring(1, 2);
                sum += (number / 10) + (number % 10);

            }
        }
        System.out.println(sum);
        }
    }