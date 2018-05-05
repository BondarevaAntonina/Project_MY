package homeworks.one_dim_array;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by antoni on 24.04.2018.
 * В двумерном массиве натуральных случайных чисел от 10 до 99 найти количество всех двухзначных чисел, у которых сумма цифр кратная 2.
 */
public class TwoDigitNumber {
    private static Scanner in;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = 4;

        int column = 4;

        Random random = new Random();

        int[][] array = new int[row][column];

        int count = 0;

        for (int x = 0; x < row; x++) {
            for (int j = 0; j < column; j++) {
                array[x][j] = random.nextInt(90) + 10;

                int dozens = array[x][j] / 10;

                int numbers = array[x][j] % 10;

                if ((dozens + numbers) % 2 == 0) {
                    count++;
                }

                System.out.print(array[x][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(count);

    }
}