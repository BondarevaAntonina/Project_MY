package homeworks.chat_map;

import homeworks.collection_online_store.entity.City;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Создать приложение Чат на основе Map.
 * Приложение должно позволять:
 * - писать сообщение определенному зарегистрированному пользователю и если он имеет статус "В сети".
 * - сохранять историю переписки.
 * - выводить историю(за весь период и за определенный период).
 * - выводить личную информацию о пользователе(имя, фамилия, возраст).
 * - смена автора.
 * - регистрироваться пользователю.
 * - отправлять файлы.
 */
public class OparetionUserChat {

    private static List <User> userList;

    public OparetionUserChat() {
        userList = new LinkedList <>();

        userList.addAll(Arrays.asList(new User("Kernosov", "Maksim", "KerMax",
                        LocalDate.of(1985, 5, 17), 33, City.KHARKOV, NetworkStatus.ONLINE),

                new User("Barvinov", "Roman", "Barrom",
                        LocalDate.of(1986, 4, 28), 33, City.KHARKOV, NetworkStatus.ONLINE),

                new User("Paleev", "Oleg", "Paloleg",
                        LocalDate.of(1986, 11, 21), 33, City.KHARKOV, NetworkStatus.ONLINE)));
    }

    public void showUsersList(String login) {

        User user = null;

        for (User users : userList) {
            if (Objects.equals(users.getLogin(), login)) {
                user = users;
                break;
            }
        }

        System.out.println(user);
    }



}