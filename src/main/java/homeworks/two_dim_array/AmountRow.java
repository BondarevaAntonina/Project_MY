package homeworks.two_dim_array;

/*
    Дан двумерный массив целых чисел. Вычислить сумму элементов первой и последней строк данной матрицы.
 */

import java.util.Random;

public class AmountRow {
    public static void main(String[] args) {

        int row = 5;
        int column = 4;

        Random random = new Random();

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

//                array[i][j] = ((int) Math.round(Math.random() * 9));
                array[i][j] = random.nextInt(20);

                System.out.print(array[i][j] + "\t");

            }

            System.out.println();

        }

        int sumOneRow = 0;

        int sumLastRow = 0;

        for (int i = 0; i < column; i++) {
            sumOneRow += array[0][i];

            sumLastRow += array[row - 1][i];
        }

        System.out.println("Sum one row -> " + sumOneRow + "\nSun last row -> " + sumLastRow);
    }
}

