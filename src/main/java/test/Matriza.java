package test;

/**
 * Created by antoni on 28.03.2018.
 */
public class Matriza {
    public static void main(String[] args) {
        int[][] matrice = new int[10][7];
        int k = 1;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = k;
                k++;
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

