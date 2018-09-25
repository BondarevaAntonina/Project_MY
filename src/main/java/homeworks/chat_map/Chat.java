package homeworks.chat_map;

import java.time.LocalDate;
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
    private String message;
    private LocalDateTime dateTime;
    private Map<User, Integer> chatUsers;

    public Chat(String login, String message, LocalDateTime dateTime, Map<User, Integer> chatUsers) {
        this.login = login;
        this.message = message;
        this.dateTime = dateTime;
        chatUsers = new HashMap<>();
    }

    public  void sendingMessage(ArrayList<User> userArrayList, String message, LocalDateTime dateTime, DerictoryUser derictoryUser) {


    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
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
