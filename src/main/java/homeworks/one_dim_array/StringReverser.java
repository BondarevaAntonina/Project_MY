package homeworks.one_dim_array;

/**
 * Created by antoni on 18.05.2018.
 * Перевернуть физически строку наоборот(отсортировать)
 */

public class StringReverser {
    public static void main(String[] args) {
        String s = "Перевернуть физически строку наоборот";
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        System.out.println(b);
    }

}
