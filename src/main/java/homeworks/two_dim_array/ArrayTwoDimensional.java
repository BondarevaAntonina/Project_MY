package homeworks.two_dim_array;

/**
 * Created by antoni on 19.04.2018.
 * В двумерном массиве Вывести максимальный элемент каждой строки
 */
public class ArrayTwoDimensional {
    public static void main(String[] args) {

        int size = 4;

        int max = 0;

        int min = 0;

        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                array[i][j] = ((int) Math.round(Math.random() * 9));


                System.out.print(array[i][j] + "\t");

            }

            System.out.println();

        }

        for (int i = 0; i < size; i++) {

            max = 0;

            min = 0;


            for (int j = 0; j < size; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }

                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }

            System.out.println("\nMax element " + max + "\tMin element " + min);

        }

    }
}


