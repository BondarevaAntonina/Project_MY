package homeworks.chat_map;

import org.apache.http.HttpRequest;
import org.apache.http.message.BasicHttpRequest;

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

    public void sendMessage(String userSender, String userConsumer, Message message) {

//        List<Message> messages1 = chatUsers.get(userConsumer);


//        boolean b = chatUsers.keySet().stream().anyMatch(u -> u.getLogin().equals(userSender));

        User sender = chatUsers.keySet().stream().filter(u -> u.getLogin().equals(userSender) &&
                    u.getNetworkStatus() != NetworkStatus.OFFLINE).findFirst().get();
        User consumer = chatUsers.keySet().stream().filter(u -> u.getLogin().equals(userConsumer) &&
                    u.getNetworkStatus() != NetworkStatus.OFFLINE).findFirst().get();

        if (Objects.isNull(consumer) && Objects.isNull(sender)) {
            System.out.println("Such a user does not exist");
        }

        List<Message> messages = chatUsers.get(sender);

        List<Message> messages1 = chatUsers.get(consumer);

        messages.add(new Message(userSender, userConsumer, "Отправка сообщения", LocalDateTime.now()));
        messages1.add(new Message(userSender, userConsumer, "Отправка сообщения", LocalDateTime.now()));


        //        chatUsers.put(user, new ArrayList <Message>());
        }

    public void addUser(User user) {
        if (chatUsers.containsKey(user)) {
            System.out.println("This user exists");
            return;
        }

        chatUsers.put(user, new ArrayList<>());

        System.out.println(user);
    }


}
