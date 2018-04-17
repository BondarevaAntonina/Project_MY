package lessons.IncrementDecrement;

/**
 * Создать два массива из 20 чисел. Первый массив проинициализировать четными числами.
 * Проинициализировать второй массив элементами первого массива при условии,
 * что индекс делится на 4 без остатка и элемент больше 3, но меньше 16.
 * Если условие не выполняется оставить элемент массива без изменения.
 */
public class MassEvenNumbers {
    public static void main(String[] args) {
        //the variable a will store the array size value
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }
        int[] mas1 = new int[a];
        int[] mas2 = new int[a];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                mas1[b] = i;
                System.out.print(mas1[b] + " ");
                b++;
            }
        }

        //Проинициализировать второй массив элементами первого массива при условии, что индекс делится на 4 без остатка и элемент больше 3, но меньше 16

        int n = 0;
        for (int x = 0; x < mas2.length; x++) {
            if (mas2[x] % 2 - 1 == 0) {
                n++;
                a += mas2[x];

                System.out.println("Нечетный элемент = " + mas2[a]);
            }
        }
    }
}


//        System.out.println( "Всего нечетных элементов = " + n );
//        System.out.println( "Cумма нечетных элементов = " + sum );
