package homeworks.one_dim_array;

/**
 * Created by antoni on 17.05.2018.
 * В определенном предложении найти самое длинное и короткое слово.
 */
public class Sentence {
    public static void main(String[] args) {
        String text = "The biggest and the smallest word must be somewhere here!";

        String[] strings = text.split(" ");

        String tmp = "";
        String maxWord = "";
        String minWord = text;

        for (int i = 0; i < text.length(); i++) {

            /*if (text.charAt(i) == ' ') {
                maxWord = maxWord.length() < tmp.length() ? tmp : maxWord;
                minWord = minWord.length() > tmp.length() ? tmp : minWord;
                tmp = "";

            } else {
                tmp += text.charAt(i);
            }*/

            if (text.charAt(i) != ' ') {
                tmp += text.charAt(i);
                continue;
            }

            maxWord = maxWord.length() < tmp.length() ? tmp : maxWord;
            minWord = minWord.length() > tmp.length() ? tmp : minWord;
            tmp = "";

        }

        System.out.print("The biggest word is \"" + maxWord + "\" and the smallest one is \"" + minWord + "\"");
    }
}
