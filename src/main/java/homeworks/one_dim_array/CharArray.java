package homeworks.one_dim_array;

/**
 * Created by antoni on 17.05.2018.
 * Перевернуть физически строку наоборот(отсортировать)
 */

public class CharArray {
    public static void main(String[] args) {
        String str = "Перевернуть физически строку наоборот(отсортировать)";
        char[] reverseArray = str.toCharArray();
        System.out.print("The array in reverse order: ");
        System.out.println();
        for (int i = reverseArray.length - 1; i >= 0; i--) System.out.print(reverseArray[i]);

    }

}

