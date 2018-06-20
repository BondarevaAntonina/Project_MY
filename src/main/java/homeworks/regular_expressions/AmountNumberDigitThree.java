package homeworks.regular_expressions;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Пользователь вводит имя и фамилию. Буквы могут быть в разных регистрах.
 * Проверить, чтобы первые буквы были в верхнем регистре, а остальные буквы - в нижнем.
 */
public class AmountNumberDigitThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String regex = "(((\\w[A-Z]{0})[a-z]*)(\\s))((\\w[A-Z]{0})[a-z]*)";

        System.out.println("Enter the Surname and First Name");

        String text = sc.nextLine();

        System.out.println(Pattern.matches(regex, text));
    }

}
