package homeworks;

/**
 * Создать два массива из 30 чисел. Первый массив проинициализировать нечетными числами.
 * Проинициализировать второй массив элементами первого массива при условии,
 * что индекс элемента больше 4 и делится без остатка на 5 и элемент больше 0, но меньше 6 или больше 10, но меньше 20.
 * Если условие не выполняется оставить элемент массива без изменения.
 */
public class MassOddNumber {

    public static void main(String[] args) {
        int[] mass1 = new int[30];
        int[] mass2 = new int[30];
        int j = 0;
        for (int i = 0; (i < 1000) && (j < 30); i++) {
            if (i % 2 - 1 == 0) {
                System.out.print(i + " ");
                mass1[j] = i;
                j++;
            }
        }

        System.out.println();
        for (int i = 0; i < 30; i++) {
            if ((i > 4) && (i % 5 == 0) && ((mass1[i] > 0) && ((mass1[i] < 6) || ((mass1[i] > 10) && (mass1[i] < 20))))) {
                mass2[i] = mass1[i];
                System.out.println(mass2[i]);
            }
        }
        for (int al : mass2) {
            System.out.print(al + " ");
        }
    }
}

