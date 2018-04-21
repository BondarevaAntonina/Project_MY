package homeworks.one_dim_array;

/*
Дан двумерный массив целых чисел. Вычислить сумму элементов первой и последней строк данной матрицы.
 */

public class AmountRow {
    public static void main(String[] args) {

        int arrayCountOne = 5;
        int arrayCountTwo = 4;


        int[][] massive = new int[arrayCountOne][arrayCountTwo];

        for (int i = 0; i < arrayCountOne; i++) {
            int sum = 0;
            for (int j = 0; j < arrayCountTwo; j++) {

                massive[i][j] = ((int) Math.round(Math.random() * 9));
                System.out.print(massive[i][j] + "\t");

                massive[i][j] = sum;

            }

            System.out.println(+sum);
        }
    }
}

