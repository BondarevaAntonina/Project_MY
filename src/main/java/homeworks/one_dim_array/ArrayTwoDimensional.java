package homeworks.one_dim_array;

/**
 * Created by antoni on 19.04.2018.
 * В двумерном массиве Вывести максимальный элемент каждой строки
 */
public class ArrayTwoDimensional {
    public static void main(String[] args) {

        int arrayCount = 4;
        int maxb=0;

        int[][] massive = new int[arrayCount][arrayCount];

        for (int i = 0; i < arrayCount; i++) {

            for (int j = 0; j < arrayCount; j++) {

                massive[i][j] = ((int) Math.round(Math.random() * 9));

                System.out.print(massive[i][j] + "\t");

            }
            for (int d = 0; d < massive.length; d++) {
                for (int j = 0; j < massive[d].length; j++) {
                    if (maxb < massive[i][j]) {
                        maxb = massive[i][j];
//                        maxb++;
                    }
                }
            }
            System.out.println(+ maxb );

        }
        System.out.println("Максимальный элемент двумерного массива " + maxb);
    }
}
