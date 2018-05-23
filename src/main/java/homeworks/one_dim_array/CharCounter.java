package homeworks.one_dim_array;


import java.util.Scanner;

/**
 * Created by antoni on 18.05.2018.
 * Подсчитать количество символов в строке, с учетом их повторений
 */

public class CharCounter {
    public static void main(String[] args) {

        String str = "Строка из букв, цифр 492 и специальных символов %*;№?";

        int uniqueCharCount = 0;

        for(int i = 0; i< str.length(); i++){
            char currChar = str.charAt(i);
            if( !str.substring(0, i).contains( String.valueOf(currChar)))
                uniqueCharCount++;
        }
        System.out.println( "Length of the string = " + str.length());
        System.out.println( "Number of unique characters = " + uniqueCharCount);
    }
}
