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

        /*String regex = "H[a-rA-R &&[^dD]]llo";

        String text = "HAllo";*/


//        String regex = "H[0-9]llo";//from 0 to 9

//        String regex = "H\\dllo";//any digit

        /*String regex = "H\\wllo";//[a-zA-Z0-9_]

        String text = "H2fllo";*/

        /*String regex = "H\\Wllo";//any symbols

        String text = "H@llo";*/

//        Matchers

        /*String regex = "He*llo";//repeat multiply times

        String text = "Hello";*/

        /*String regex = "He+llo";//repeat from 1 to  multiply times

        String text = "Heeeello";*/

       /* String regex = "He{2,5}llo";//repeat only 2 times

        String text = "Heeeello";*/

       /* String regex = "He?llo";//repeat only 2 times

        String text = "Hllo";*/

//        String regex = "([a-zA-z0-9]){1,10}([\\s]){0,10}";
        String regex = "\\w{1,10}([\\s]){0,10}";
        String text = "AAAfer44   ";

        System.out.println(Pattern.matches(regex, text));
    }
}
