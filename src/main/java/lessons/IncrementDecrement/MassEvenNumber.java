package lessons.IncrementDecrement;

/**
 * Создать два массива из 20 чисел. Первый массив проинициализировать четными числами.
 * Проинициализировать второй массив элементами первого массива при условии,
 * что индекс делится на 4 без остатка и элемент больше 3, но меньше 16.
 * Если условие не выполняется оставить элемент массива без изменения.
 */
public class MassEvenNumber {
    public static void main(String[] args) {
        //the variable a will store the array size value
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;
        }
        int[]mas2=new int[a];
        int[] mas1 = mas2;
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                mas1[b] = i;
                System.out.print(mas1[b] + " ");
                b++;

            }
        }
        System.out.println("");
        //
        int i = 0;
        for (int myInt : mas2) {
            if (myInt % 4 == 0) {
                if (myInt > 3 && myInt <= 16) {
                    System.out.println("Элемент массива равно:" + myInt++);
                }
            }
        }
    }
}
