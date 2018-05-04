package homeworks.two_dim_array;

public class SumColumn {
    public static void main(String[] args) {
        int row = 4;
        int column = 5;

        int max = 0;

        int min = 0;

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                array[i][j] = ((int) Math.round(Math.random() * 9));

                System.out.print(array[i][j] +  "\t");

            }

            System.out.println(" ");

        }

        for (int i = 0; i < column; i++) {

            max = array[0][i];

            min = array[0][i];

            for (int j = 0; j < row; j++) {
                int element = array[j][i];

                if (max < element) {
                    max = element;
                }

                if (min > element) {
                    min = element;
                }
            }

            System.out.println("\nMax element = " + max + "\tMin element = " + min + " column " + i);
        }
    }
}

/*
7	6	3	1	3 -> i = 0; j = 0, 1, 2, 3, 4
3	4	7	7	0
5	1	4	3	3
5	5	8	8	8

*/
