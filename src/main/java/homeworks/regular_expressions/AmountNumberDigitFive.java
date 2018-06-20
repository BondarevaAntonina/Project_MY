package homeworks.regular_expressions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Пользователь вводит телефон в формате (ххх)ххх-хх-хх.
 (ххх) может быть таким: (095), (097), (073), (067), (099), (063).
 Проверить, чтобы 7 - ый номер был в формате "(ххх)ххх-хх-хх".
 Если пользователь вводит номер начинающийся на(095) или (099) ххх-хх-хх, выводить в консоль "Пользователь имеет МТС номер",
 на(097) или (067) ххх-хх-хх, выводить в консоль "Пользователь имеет Киевстар номер",
 на(073) или (063) ххх-хх-хх, выводить в консоль "Пользователь имеет Лайф номер"
 */
public class AmountNumberDigitFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the phone in the format (ххх)ххх-хх-хх");

        String phone = sc.nextLine();

        String[] splitq = phone.split("-\\d{3}-\\d{2}-\\d{2}");

//        if(phone.equals())

        System.out.println(Arrays.toString(splitq));
    }
}
