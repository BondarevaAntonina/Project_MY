package homeworks.regular_expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Пользователь вводит телефон в формате (ххх)ххх-хх-хх.
 * (ххх) может быть таким: (095), (097), (073), (067), (099), (063).
 * Проверить, чтобы 7 - ый номер был в формате "(ххх)ххх-хх-хх".
 * Если пользователь вводит номер начинающийся на(095) или (099) ххх-хх-хх, выводить в консоль "Пользователь имеет МТС номер",
 * на(097) или (067) ххх-хх-хх, выводить в консоль "Пользователь имеет Киевстар номер",
 * на(073) или (063) ххх-хх-хх, выводить в консоль "Пользователь имеет Лайф номер"
 */
public class AmountNumberDigitFive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the phone in the format (ххх)ххх-хх-хх");

        String phone = sc.nextLine();

//      String phone = "(068)234-56-78";

        Pattern p = Pattern.compile("\\(\\d{3}\\)");

        Matcher m = p.matcher(phone);

        if (m.find()) {
            if (m.group().equals("(095)") || m.group().equals("(099)")) {

                System.out.println("User has MTS number");

            } else if (m.group().equals("(068)") || m.group().equals("(067)")) {

                System.out.println("The user has a Kyivstar number");

            } else if (m.group().equals("(073)") || m.group().equals("(063)")) {

                System.out.println("User has Life number");
            }
        }
    }
}
