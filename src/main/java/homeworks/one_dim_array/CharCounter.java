package homeworks.one_dim_array;


import java.util.Scanner;

/**
 * Created by antoni on 18.05.2018.
 * Подсчитать количество символов в строке, с учетом их повторений
 */

public class CharCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String in;

        int counter = 0;

        while ((in = scan.nextLine()) != null) {
            if (in.equals(""))
                break;
            char[] tmp = in.toCharArray();
            for (int i = 0; i < tmp.length; i++) {
                if (Character.isAlphabetic(tmp[i]) && !Character.isDigit(tmp[i])) {
                    counter++;
                }
            }
        }
        scan.close();
        System.out.println("всего букв - " + counter);

    }
}
