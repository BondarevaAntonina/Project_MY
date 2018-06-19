package homeworks.regular_expressions;

import java.util.regex.Pattern;

/**
 * Пользователь вводит имя и фамилию. Буквы могут быть в разных регистрах.
 * Проверить, чтобы первые буквы были в верхнем регистре, а остальные буквы - в нижнем.
 */
public class AmountNumberDigitThree {
//    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        String regex = "g([A-Z]{1}[a-z]{1,6})";

        String text = "Фамилия";

        System.out.println(Pattern.matches(regex, text));
    }

}
