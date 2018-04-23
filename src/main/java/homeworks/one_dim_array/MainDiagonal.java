package homeworks.one_dim_array;

/*
    22.04.2018
    Вычислить сумму элементов равномерного двумерного массива входящих в главную диагональ
*/

import java.util.Random;

public class MainDiagonal {

    public static void main(String[] args) {

        int row = 4;

        int column = 4;

        Random random = new Random();

        int[][] array = new int[row][column];

        for (int x = 0; x < row; x++) {

            for (int j = 0; j < column; j++) {

                array[x][j] = random.nextInt(10);

                System.out.print(array[x][j] + "\t");
            }
            System.out.println();

        }

        int s = 0;

        for (int i = 0; i < array.length; ++i) {

            for (int j = 0; j < array[i].length; ++j) {

                if (i == j) {

                    s += array[i][j];

                }
            }
        }

        System.out.println("The sum of the elements of a uniform two-dimensional array entering the main diagonal  " + s);

    }
}

