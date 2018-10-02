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

    private Map <User, List <Message>> chatUsers;

    public Chat() {
        this.chatUsers = new HashMap <>();
    }

    public void sendMessage(String userSender, String userConsumer, Message message) {

        List <Message> messages = chatUsers.get(userSender);
        List <Message> messages1 = chatUsers.get(userConsumer);

        User user = new User();
        if (chatUsers.containsKey(userConsumer) && chatUsers.containsKey(userSender) &&
                !user.getNetworkStatus().equals(NetworkStatus.OFFLINE)) {
            messages.add(new Message("Barvinov", "Petrov", "Отправка сообщения", LocalDateTime.now()));
            messages1.add(new Message("Barvinov", "Petrov", "Отправка сообщения", LocalDateTime.now()));
        }
        System.out.println("hh");
//        chatUsers.put(user, new ArrayList <Message>());
        System.out.println(messages);
    }

    /*
        public void sendMessage(String userSender, String userConsumer, Message message) {

        List <Message> messages = chatUsers.get(userSender);
        List <Message> messages1 = chatUsers.get(userConsumer);
        User user = new User();

        if (chatUsers.containsKey(userConsumer) && chatUsers.containsKey(userSender)&&
                !user.getNetworkStatus().equals(NetworkStatus.OFFLINE)) {
            System.out.println("Такой пользователь находится OFFLINE");
        }
        messages.add(new Message("Barvinov", "Petrov", "Отправка сообщения", LocalDateTime.now()));
        messages1.add(new Message("Barvinov", "Petrov", "Отправка сообщения", LocalDateTime.now()));
//        chatUsers.put(user, new ArrayList <Message>());
        System.out.println(messages);
    }
     */

    public void addUser(User user) {
        if (chatUsers.containsKey(user)) {
            System.out.println("This user exists");
            return;
        }
        chatUsers.put(user, new ArrayList <>());
        System.out.println(user);
    }


}
