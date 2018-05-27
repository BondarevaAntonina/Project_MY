package my_lesson;

/**
 * Created by antoni on 15.03.2018.
 */
//public class Multidimensional_arrays {
//    public static void main(String[] args) {
//        int[] number = {1, 2, 3};
//        System.out.println(number[1]);
//        int[][] matrice = {{1, 2, 3, 4, 5},
//                             {4, 5, 6},
//                             {7, 8, 9}};
//        System.out.println(matrice[2][2]);
//        System.out.println(matrice[1][0]);
//        System.out.println(matrice[0][4]);
//
//        int[] nambers1 = new int[5];
//        String[][] strings = new String[2][3];
//        strings[0][1] = "Привет";
//        System.out.println(strings[0][1]);
//    }
//}


public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int[][] matrice = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                System.out.print(matrice[i][j] + "");
            }
            System.out.println();
        }
    }
}