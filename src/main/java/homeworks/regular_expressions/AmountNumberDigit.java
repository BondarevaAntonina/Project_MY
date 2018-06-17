package homeworks.regular_expressions;

/**
 * Любое количество букв, а потом две цифры и наоборот
 */

import java.util.regex.Pattern;

public class AmountNumberDigit {
    public static void main(String[] args) {
        String regex = "Any number of letters (\\d{2}) and then two digits";
        String text = "Any number of letters 36 and then two digits";

        System.out.println(Pattern.matches(regex, text));
    }
}
