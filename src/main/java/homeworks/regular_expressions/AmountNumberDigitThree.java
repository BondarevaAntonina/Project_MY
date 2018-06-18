package homeworks.regular_expressions;

import java.util.regex.Pattern;

/**
 * Пользователь вводит имя и фамилию. Буквы могут быть в разных регистрах.
 * Проверить, чтобы первые буквы были в верхнем регистре, а остальные буквы - в нижнем.
 */
public class AmountNumberDigitThree {
//    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        String regex = "^[А-Яа-яёЁA-Za-z]+$";

        String text = "Фамилия Имя";

        System.out.println(Pattern.matches(regex, text));
    }


//    private bool CheckNameAndPatr(string text)
//
//    {
//
//        Regex reg = new Regex(@"^[А-Яа-яёЁA-Za-z]+$");
//
//        if (reg.IsMatch(text) || text == "")
//
//            return true;
//
//        else return false;
//
//    }

}
