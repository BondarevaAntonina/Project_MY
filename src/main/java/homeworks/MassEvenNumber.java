package homeworks;

/**
 * Создать два массива из 20 чисел. Первый массив проинициализировать четными числами.
 * Проинициализировать второй массив элементами первого массива при условии,
 * что индекс делится на 4 без остатка и элемент больше 3, но меньше 16.
 * Если условие не выполняется оставить элемент массива без изменения.
 */
public class MassEvenNumber {
    public static void main(String[] args) {
        int[] mass1 = new int[20];
        int[] mass2 = new int[20];
        int j = 0;
        for (int i = 2; (i < 100) && (j < 20); i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                mass1[j] = i;
                j++;
            }
        }

        System.out.println();
        for (int i = 0; i < 20; i++) {
            if ((i % 4 == 0) && ((mass1[i] > 3) && ((mass1[i] < 16)))) {
                mass2[i] = mass1[i];
                System.out.println(mass2[i]);
            }
        }
        for (int al : mass2) {
            System.out.print(al + " ");
        }
    }
}
