package homeworks.chat_map;


import java.time.LocalDateTime;
import java.util.List;

public class Message {

    private String login;
    private String message;
    private List[] users;
    private LocalDateTime dateTime;

    public Message(String login, String message, List[] users, LocalDateTime dateTime) {
        this.login = login;
        this.message = message;
        this.users = users;
        this.dateTime = dateTime;
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

    public List[] getUsers() {
        return users;
    }

    public void setUsers(List[] users) {
        this.users = users;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
