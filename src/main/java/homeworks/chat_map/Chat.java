package homeworks.chat_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * * Создать приложение Чат на основе Map.
 *   Приложение должно позволять:
 * - писать сообщение определенному зарегистрированному пользователю и если он имеет статус "В сети".
 * - сохранять историю переписки.
 * - выводить историю(за весь период и за определенный период).
 * - выводить личную информацию о пользователе(имя, фамилия, возраст).
 * - регистрироваться пользователю.
 * - отправлять файлы. */

public class Chat {

    private Map<User, List<Message>> chatUsers;

    public Chat() {
        this.chatUsers = new HashMap<>();
    }

    public void sendMessage() {

    }

    public void addUser(User user) {
        if (chatUsers.containsKey(user)) {
            System.out.println("This user exists");
            return;
        }

        chatUsers.put(user, new ArrayList<>());
    }



}
