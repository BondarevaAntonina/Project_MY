package homeworks.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В строке содержутся слова и числа. Необходмо выделить числа и посчитать их сумму.
 */
public class AmountNumberDigitFour {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher("The line contains words and numbers1111; It is necessary to allocat777e numbers and count their sum");
        while (m.find()) {
            System.out.print(m.group());
        }

    }
}
