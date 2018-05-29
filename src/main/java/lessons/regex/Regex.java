package lessons.regex;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        /*String regex = "http://";

        String text = "http://";*/

        /*String regex = "H.llo";//"." - any character

        String text = "Hqllo";*/

        /*String regex = "H[wr]llo";//"[wr]" -w or r symbol

        String text = "Hwllo";*/

        /*String regex = "H[a-rA-R]llo";

        String text = "Hzllo";*/


//        String regex = "H[0-9]llo";//from 0 to 9

//        String regex = "H\\dllo";//any digit

        String regex = "H\\wllo";//any symbols

        String text = "H2fllo";

        System.out.println(Pattern.matches(regex, text));
    }
}
