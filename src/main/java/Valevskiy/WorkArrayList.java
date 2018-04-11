package Valevskiy;


/**
 * Created by antoni on 03.04.2018.
 */
public class WorkArrayList {

    public static void main(String[] args) {
        int[] myFirstArray; //int[] myArray = new int[27];
        myFirstArray = new int[27];


        for(int i = 0; i < 27; i++){
            myFirstArray[i] = i;
            System.out.println((i+1) + "-й элемент массива = " +  myFirstArray[i]);

        }

    }


}
