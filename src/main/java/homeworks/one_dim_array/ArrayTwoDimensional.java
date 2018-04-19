package homeworks.one_dim_array;

/**
 * Created by antoni on 19.04.2018.
 * В двумерном массиве Вывести максимальный элемент каждой строки
 */
public class ArrayTwoDimensional {
    public static void main(String[] args){
        int arrayCount = 8;
        int[][] massive = new int[arrayCount][arrayCount];
        for(int i=0;i<arrayCount;i++){
            for(int j=0;j<arrayCount;j++){
                massive[i][j] = ((int)Math.round(Math.random()*100));
                System.out.println(massive[i][j]+ " ");
            }
        }
        int max = massive[0][0];
        for(int i=0; i<arrayCount-1; i++){
            for(int j=0; j<arrayCount; j++){
                if(massive[i][j]<max){
                    max = massive[i][j];
                }
            }
        }

        System.out.print(max);
    }
}