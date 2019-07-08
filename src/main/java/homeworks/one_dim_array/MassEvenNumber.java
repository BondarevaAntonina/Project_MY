package homeworks.one_dim_array;

/**
 * Создать два массива из 20 чисел. Первый массив проинициализировать четными числами.
 * Проинициализировать второй массив элементами первого массива при условии,
 * что индекс делится на 4 без остатка и элемент больше 3, но меньше 16.
 * Если условие не выполняется оставить элемент массива без изменения.
 */
public class MassEvenNumber {
    public static void main(String[] args) {

        int length = 20;

        int[] arrayOne = new int[length];

        int[] arrayTwo = new int[length];

        int j = 0;

        for (int i = 2; (i < 100) && (j < 20); i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                arrayOne[j] = i;
                j++;
            }
        }
        System.out.println();

        for (int i = 0; i < length; ++i) {
            arrayOne[i] = i * 2;
            System.out.print(arrayOne[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < length; i++) {
            if (i % 4 == 0 && arrayOne[i] > 3 && arrayOne[i] < 16) {
                arrayTwo[i] = arrayOne[i];
            }

//            System.out.println(arrayTwo[i] + "\t");

        }

        for (int al : arrayTwo) {
            System.out.print(al + " ");
        }
    }
}
