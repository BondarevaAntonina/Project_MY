package homeworks.one_dim_array;

/*
Создать два одномерных массива любой размерности.
Проинициализировать массивы с помощи циклов(for, while, do-while).
Вывести на консоль элементы с помощью тех же циклов.
 */

public class Сycle {
    public static void main(String[] args) {
        //for
        int[] number1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i] + " ");
        }
        //while
        System.out.println(" ");

        int k = 13;

        int[] number2 = new int[k];

        int j = 0;

        while (k > 0) {
            System.out.print(k + " ");

            number2[j++] = k--;
        }

        //do-while
        System.out.println(" ");

        int x = 4;

        int[] number3 = new int[x];

        do {
            System.out.print(x + " ");
            x++;
        } while (x < 15);
    }
}
