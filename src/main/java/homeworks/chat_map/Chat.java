package homeworks.chat_map;

import java.time.LocalDateTime;
import java.util.*;

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

    private Map<User, List<Message>> chatUsers;

    public Chat() {
        this.chatUsers = new HashMap<>();
    }

    public void sendMessage(String userSender, String userConsumer, Message message) throws Exception {
//        boolean b = chatUsers.keySet().stream().anyMatch(u -> u.getLogin().equals(userSender));

        User sender;
        User consumer;

        sender = findUsers(userSender);

        consumer = findUsers(userConsumer);

        List<Message> messages = chatUsers.get(sender);

        List<Message> messages1 = chatUsers.get(consumer);

        messages.add(new Message(userSender, userConsumer, "Send message", LocalDateTime.now(), null));

        messages1.add(new Message(userSender, userConsumer, "Send message1", LocalDateTime.now(), null));

        System.out.println(messages);
        System.out.println(messages1);

    }


    private User findUsers(String byName) throws Exception {
        User user = null;

        try {
            user = chatUsers.keySet().stream().filter(u -> u.getFirstName().equals(byName) &&
                    u.getNetworkStatus() != NetworkStatus.OFFLINE).findFirst().get();
        } catch (Exception e) {

        }
        if (user == null) throw new Exception("User " + byName + " not found");
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

    public void showInfoUser(String firstName) throws Exception {
        User user = new User();
        if (chatUsers.keySet().stream().anyMatch(u -> u.getLogin().equals(firstName))) {
            System.out.println(chatUsers.toString());
        }

   }
}
