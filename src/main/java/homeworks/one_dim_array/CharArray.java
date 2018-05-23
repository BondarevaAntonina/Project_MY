package homeworks.one_dim_array;

import java.util.Arrays;

/**
 * Created by antoni on 17.05.2018.
 * Перевернуть физически строку наоборот(отсортировать)
 */

public class CharArray {

    public static void main(String[] args) {

        String str = "Перевернуть физически строку наоборот(отсортировать)";

        /*char[] reverseArray = str.toCharArray();

        System.out.print("The array in reverse order: ");

        System.out.println();

        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.print(reverseArray[i]);
        }*/

        char[] chars = str.toCharArray();

        int length = chars.length;

        for (int i = 0; i < length /2; i++) {
            char temp = chars[i];

            chars[i] = chars[length - 1 - i];

            chars[length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(chars));
    }

}

