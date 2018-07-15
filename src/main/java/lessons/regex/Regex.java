package lessons.regex;

import java.util.regex.Matcher;
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

        String text = "Hello.txt";*/

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

class UsePatternClass {
    public static void main(String[] args) {
        String regex = "\\d{3}";

        String text1 = "123";

        String text2 = "456";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text1);

//        System.out.println(matcher.matches());
//        String text3 = "This is text for testing is bad";
        String phone = "(095)779-65-46";

        String[] split = phone.split("-\\d{3}-\\d{2}-\\d{2}");

        System.out.println();
//        String[] r = text3.split("is");

        System.out.println();

    }
}


class UseMatcherClass {
    public static void main(String[] args) {
        String text =  "This is text for testing is bad";

        Pattern pattern = Pattern.compile("is");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Start = " + matcher.start() + "\tFinish = " +
                    matcher.end() + "\t Value = " + matcher.group());
        }
    }
}
