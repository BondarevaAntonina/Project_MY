package homeworks.chat_map;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * * Создать приложение Чат на основе Map.
 * Приложение должно позволять:
 * - писать сообщение определенному зарегистрированному пользователю и если он имеет статус "В сети".
 * - сохранять историю переписки.
 * - выводить историю(за весь период и за определенный период).
 * - выводить личную информацию о пользователе(имя, фамилия, возраст).
 * - регистрироваться пользователю.
 * - отправлять файлы.
 */

public class Chat {
    public static final String name = "John";

    private Map<User, List<Message>> chatUsers;

    public static final String FILE_PATH = "./DirectoryUser/";

    public Chat() {
        this.chatUsers = new HashMap<>();
    }

    public void sendMessage(String userSender, String userConsumer, Message message) throws Exception {
//        boolean b = chatUsers.keySet().stream().anyMatch(u -> u.getLogin().equals(userSender));

        User sender = findUsers(userSender);

        User consumer = findUsers(userConsumer);

        List<Message> messages = chatUsers.get(sender);

        List<Message> messages1 = chatUsers.get(consumer);

        String from = message.getFrom();

        message.setFrom(null);

        messages.add(message);

        message.setFrom(from);

        message.setTo(null);

        messages1.add(message);

    }


    private User findUsers(String byName) throws Exception {
        User user = chatUsers.keySet().stream().filter(u -> u.getFirstName().equals(byName) &&
                    u.getNetworkStatus() != NetworkStatus.OFFLINE).findFirst().get();

            if (user == null) {
                throw new Exception("User " + byName + " not found");
            }

        return user;

    }


    public void addUser(User user) {
        if (chatUsers.containsKey(user)) {
            System.out.println("This user exists");
            return;
        }

        chatUsers.put(user, new ArrayList<>());

        System.out.println(user);
    }

    public void showHistoryMessageByUser(String firstName) throws Exception {
        chatUsers.entrySet().stream().filter(e -> e.getKey().getFirstName().contains(firstName)).forEach(e -> {
            System.out.println(e.toString());
        });
    }

    /*public void showHistoryMessageThePeriod(LocalDateTime from, LocalDateTime to) throws Exception {
        chatUsers.values().stream().forEach(list -> {
            list.stream().filter(m -> {
                LocalDateTime dateTime = m.getDateTime();

                return dateTime.isAfter(from) && dateTime.isBefore(to);
            }).forEach(System.out::println);
        });
    }*/

    public void showHistoryMessageThePeriod(LocalDateTime from, LocalDateTime to) throws Exception {
        chatUsers.values().stream().forEach(list ->
            list.stream().filter(m -> m.isInPeriod(from, to)).forEach(System.out::println));
    }


    public void showInfoUser(String firstName) throws Exception {
         System.out.println(findUsers(firstName));
    }

}
