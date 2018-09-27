package homeworks.chat_map;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *  * Создать приложение Чат на основе Map.
 *  Приложение должно позволять:
 *  - писать сообщение определенному зарегистрированному пользователю и если он имеет статус "В сети".
 *  - сохранять историю переписки.
 *  - выводить историю(за весь период и за определенный период).
 *  - выводить личную информацию о пользователе(имя, фамилия, возраст).
 *  - смена автора.
 *  - регистрироваться пользователю.
 *  - отправлять файлы.
 */

public class Chat {

    private String login;
    private Message message;
    private LocalDateTime dateTime;
    private NetworkStatus networkStatus;
    private DerictoryUser derictoryUser;
    private Map<User, Integer> chatUsers;

    public Chat(String login, Message message, LocalDateTime dateTime, NetworkStatus networkStatus, DerictoryUser derictoryUser, Map <User, Integer> chatUsers) {
        this.login = login;
        this.message = message;
        this.dateTime = dateTime;
        this.networkStatus = networkStatus;
        this.derictoryUser = derictoryUser;
        this.chatUsers = new HashMap<>();
    }

    public  void sendMessage(ArrayList<User> userArrayList, String message, LocalDateTime dateTime, DerictoryUser derictoryUser, NetworkStatus networkStatus) {

        for (User user : userArrayList) {

        }

    }



    public String getLogin() {
        return login;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Map<User, Integer> getChatUsers() {
        return chatUsers;
    }

    public void setChatUsers(Map<User, Integer> chatUsers) {
        this.chatUsers = chatUsers;
    }
}
