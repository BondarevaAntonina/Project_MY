package homeworks.chat_map;

import homeworks.collection_online_store.entity.City;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

public class TestOperationsChat {

    public static void main(String[] args) {

        Chat chat = new Chat();

        chat.addUser(new User("Kernosov", "Maksim", "KerMax",
                LocalDate.of(1985, 5, 17), 33, City.KHARKOV, NetworkStatus.ONLINE));

        chat.addUser(new User("Barvinov", "Roman", "Barrom",
                LocalDate.of(1986, 4, 28), 33, City.KIEV, NetworkStatus.ONLINE));

        chat.addUser(new User("Paleev", "Oleg", "Paloleg",
                LocalDate.of(1986, 11, 21), 33, City.KHARKOV, NetworkStatus.ONLINE));

        chat.addUser(new User("Petrov", "Ivan", "Petivan",
                LocalDate.of(1984, 11, 21), 35, City.ODESSA, NetworkStatus.OFFLINE));

        chat.addUser(new User("Sereda", "Aleksandr", "Seralek",
                LocalDate.of(1982, 11, 21), 37, City.KIEV, NetworkStatus.OFFLINE));


        chat.sendMessage("Barvinov","Paleev",
                new Message("Kernosov", "Paleev", "Send message", LocalDateTime.now()));
    }
}

