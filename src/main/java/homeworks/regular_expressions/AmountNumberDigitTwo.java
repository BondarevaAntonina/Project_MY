package homeworks.regular_expressions;

import java.util.regex.Pattern;

/**
 *  2-4 цифры, а потом 2-4 буквы и наоборот
 */
public class AmountNumberDigitTwo {

    public static void main(String[] args) {
//
//        String regex = "(\\d{2,4}\\w{2,4})";
//
//        String text = "1254jkfh";

        String regex = "(\\w{2,4}\\d{2,4})";

        String text = "jkfh5846";

        System.out.println(Pattern.matches(regex, text));
    }

}
