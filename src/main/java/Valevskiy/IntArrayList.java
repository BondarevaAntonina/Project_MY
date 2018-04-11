package Valevskiy;

/**
 * Created by antoni on 10.04.2018.
 */
public class IntArrayList {
    public static void main(String[] args) {
        int[] myArray = new int[27];
        for (int i = 0; i < 27; i++) {
            myArray[i] = i;
            System.out.println("Последний  элемент массива " + myArray[i]);
        }
        int razmer = myArray.length;
        System.out.println(razmer);
    }
}

