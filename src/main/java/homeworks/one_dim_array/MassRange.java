package homeworks.one_dim_array;

/**
 * Дан массив чисел: а[0], a[1], a[2], ..., а[n-1]. В массиве числа в диапазоне от -15 до 15.
 * Выяснить, имеются ли в данном массиве два идущих подряд  положительных элемента. Подсчитать количество таких пар.
 */
public class MassRange {
    public static void main(String[] args) {
        int two=0;
        int countPozitiveNamb = 0;
        int[] myvMass = new int[]{1, -6, 3, 4, -7, 9, 1, -5, -3, 10, 45, -13, 8, 4,8};
        for (int i = 1; i < myvMass.length; i++) {
            if ((myvMass[i - 1] > 0) && (myvMass[i] > 0)) {
                countPozitiveNamb++;
            }
        }
        System.out.println(countPozitiveNamb);

//        int[] myvMass1 = new int[]{1, -6, 3, 4, -7, 9, 1, -5, -3, 10, 45, -13, 8, 7, 3, 12};
//        for (int i = 1; i < myvMass.length; i++) {
//            if ((myvMass[i - 1] > 0) && (myvMass[i] > 0))
//            if (countPozitiveNamb){
//
//            }
//            {
//                countPozitiveNamb++;
//            }
//        }
//        System.out.println(two);
    }

}
