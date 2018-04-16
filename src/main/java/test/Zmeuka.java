package test;

/**
 * Created by antoni on 28.03.2018.
 */
public class Zmeuka {

    public static void main(String[] args) {


        int rowsCount = 10; //ряд
        int columnsCount = 20; //колонок
        int[][] matrix = new int[columnsCount][rowsCount];


        int currentX = 0;
        int currentY = 0;
        int direction = 1; //направление 1 -- право, 2 -- вниз, 3 -- влево, 4 -- вправо
        int currentNumber = 1; //переход

        matrix[currentX][currentY] = currentNumber;

        while (true) {

            boolean addedNumber = false;

            int siblingX = 0;
            int siblingY = 0;

            currentNumber = currentNumber + 1;

            for (int iDir = 1; iDir <= 4; iDir++) {

                if (direction == 1) {
                    siblingX = currentX + 1;
                    siblingY = currentY;
                } else if (direction == 2) {
                    siblingX = currentX;
                    siblingY = currentY + 1;
                } else if (direction == 3) {
                    siblingX = currentX - 1;
                    siblingY = currentY;
                } else if (direction == 4) {
                    siblingX = currentX;
                    siblingY = currentY - 1;
                }


                if (siblingX >= columnsCount || siblingY >= rowsCount || siblingX < 0 || siblingY < 0 || matrix[siblingX][siblingY] != 0) {
                    direction = direction + 1;
                    if (direction == 5) {
                        direction = 1;
                    }
                    continue;
                }

                addedNumber = true;
                matrix[siblingX][siblingY] = currentNumber;

                currentX = siblingX;
                currentY = siblingY;
                break;


            }


            if (!addedNumber) {
                break;
            }
        }


        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++)
            System.out.print(matrix[j][i] + "\t");
            System.out.println();
        }

    }
}


