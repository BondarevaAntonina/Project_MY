package Valevskiy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antoni on 10.04.2018.
 */
public class IntArrayList {
    public static void main(String[] args) {
        int[] myArray = new int[27];
        for (int i = 0; i < 27; i++) {
            myArray[i] = i;
//            List<Integer> list = new ArrayList<Integer>();
//            list.add(27);
            System.out.println("Последний  элемент массива " + myArray[i]);
        }
        int razmer = myArray.length;
        System.out.println(razmer);
    }
}

