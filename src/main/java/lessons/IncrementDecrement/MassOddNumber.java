package lessons.IncrementDecrement;

/**
 * Создать два массива из 30 чисел. Первый массив проинициализировать нечетными числами.
 * Проинициализировать второй массив элементами первого массива при условии,
 * что индекс элемента больше 4 и делится без остатка на 5 и элемент больше 0, но меньше 6 или больше 10, но меньше 20.
 * Если условие не выполняется оставить элемент массива без изменения.
 */
public class MassOddNumber {

    public static void main(String[] args) {
        int mass1[];
        mass1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int sum = 0;
        int n = 0;
        int j = 0;

        for (int x = 0; x < mass1.length; x++) {
            if (mass1[x] % 2 - 1 == 0) {
                System.out.print(mass1[x] + " ");
                mass1[x] = j;
            }
        }

        int[] mass2 = mass1;

        int i = 0;
        for (int myInt : mass2) {
            if (myInt % 5 == 0)
//            {
//                System.out.println("");
                if (myInt > 4 && myInt > 0 && myInt <= 6 || myInt > 10 && myInt < 20) {
                    System.out.println("Элемент массива равно:" + myInt++);
                }
//            }

        }

    }
}

