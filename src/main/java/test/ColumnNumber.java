package test;

/**
 * Created by antoni on 28.03.2018.
 */
public class ColumnNumber {
    public static void main(String[] args) {
        {
            int rowsCount = 10;

            for (int i1 = 1; i1 <= rowsCount; i1++) {
                String resultRow = "";
                for (int i2 = 1; i2 <= i1; i2++) {
                    resultRow = resultRow + i2;

                }
                System.out.println(resultRow);
            }
        }
    }
}


