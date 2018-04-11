package Valevskiy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by antoni on 11.04.2018.
 */
public class Entry {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n=a.nextInt();
        int b[]=new int[n];
        System.out.println("Теперь нужно его заполнить:");
        int i=0;
        while ( i<b.length){
            b[i]=a.nextInt();
            i++;}
        System.out.println("Массив состоит из");
        System.out.println(Arrays.toString(b));

    }

}
