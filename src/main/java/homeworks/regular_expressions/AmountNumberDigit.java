package homeworks.regular_expressions;

import java.util.regex.Pattern;

/**
 * Любое количество букв, а потом две цифры и наоборот
 */

public class AmountNumberDigit {

//    public static void main(String[] args) {
//
//        String regex = "Any number of letters (\\d{2}) and then two digits";
//
//        String text = "Any number of letters 36 and then two digits";
//
//        System.out.println(Pattern.matches(regex, text));
//    }


    public static void main(String[] args) {

        String regex = "\\w*\\d{2}";
//        String regex = "[0-9\\s]*is[0-9\\s]*";

//        String text = "232 234234 234 234234 is 345 45345 345 25445";
        String text = "drtry85";

        System.out.println(Pattern.matches(regex, text));
    }
}
