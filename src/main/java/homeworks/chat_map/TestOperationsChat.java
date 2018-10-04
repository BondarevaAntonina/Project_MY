package homeworks.chat_map;

import homeworks.collection_online_store.entity.City;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Создать приложение Чат на основе Map.
 * Приложение должно позволять:
 * - писать сообщение определенному зарегистрированному пользователю и если он имеет статус "В сети".
 * - сохранять историю переписки.
 * - выводить историю(за весь период и за определенный период).
 * - выводить личную информацию о пользователе(имя, фамилия, возраст).
 * - отправлять файлы.
 */

public class TestOperationsChat {


    private Chat chat;

    public static void main(String[] args) throws Exception {

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

        chat.addUser(new User("Vasilcova", "Nataliya", "Vasilnat",
                LocalDate.of(1972, 4, 4), 47, City.KIEV, NetworkStatus.ONLINE));

        System.out.println("Send messages users");

        Path testFilePath = Paths.get("./DirectoryUser/");

        chat.sendMessage("Barvinov", "Paleev",
                new Message("Barvinov", "Paleev", "Send message",
                        LocalDateTime.of(2018, 10, 1, 13, 45), null));

        chat.sendMessage("Vasilcova", "Paleev",
                new Message("Vasilcova", "Paleev", "Send message",
                        LocalDateTime.of(2018, 10, 1, 13, 45), null));

        chat.sendMessage("Barvinov", "Vasilcova",
                new Message("Barvinov", "Vasilcova", "Send message",
                        LocalDateTime.of(2018, 10, 1, 13, 45), testFilePath));

        chat.sendMessage("Barvinov", "Vasilcova",
                new Message("Barvinov", "Vasilcova", "Send message",
                        LocalDateTime.of(2018, 10, 4, 11, 25), testFilePath));


        System.out.println();

        System.out.println("Information about the requested user");

        chat.showInfoUser("Vasilcova");


        System.out.println();

        System.out.println("Show history (for the entire period and for a certain period)");

        chat.showHistoryMessageByUser("Paleev");


        System.out.println();

        System.out.println("Show history for a certain period");

        chat.showHistoryMessageThePeriod(LocalDateTime.of(2018, 10, 1, 13, 45));


        System.out.println("Create file");

        Path path1 = Paths.get("./DirectoryUser/");
        chat.createNewFileForUser(path1);


    }
}

