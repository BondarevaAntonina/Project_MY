package homeworks.one_dim_array;

import java.util.Random;

/**
 * Дан массив чисел: а[0], a[1], a[2], ..., а[n-1]. В массиве числа в диапазоне от -15 до 15.
 * Выяснить, имеются ли в данном массиве два идущих подряд  положительных элемента. Подсчитать количество таких пар.
 */
public class MassRange {
    public static void main(String[] args) {

        int countPozitiveNamb = 0;

        int[] myvMass = new int[]{1, -6, 3, 4, -7, 9, 1, -5, -3, 10, 45, -13, 8};

        for (int i = 1; i < myvMass.length; i++) {
            if ((myvMass[i - 1] > 0) && (myvMass[i] > 0)) {
                countPozitiveNamb++;
            }
        }

//        (int)(Math.random() * (max - min + 1) + min)
//        new Random().nextInt() * (max - min + 1) + min  // - 15 - 15
        int number = new Random().nextInt(31) - 15;


        System.out.println(countPozitiveNamb);

        int[] myvMass1 = new int[]{1, -6, 3, 4, -7, 9, 1, -5, -3, 10, 45, -13, 8, 7, 3, 12};

        for (int i = 1; i < myvMass.length; i++) {
            if ((myvMass[i - 1] > 0) && (myvMass[i] > 0)) {
                countPozitiveNamb++;
            }
        }
        System.out.println(countPozitiveNamb);
    }

}
