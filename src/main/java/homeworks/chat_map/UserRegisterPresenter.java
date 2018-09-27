package homeworks.chat_map;


import homeworks.collection_online_store.entity.City;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRegisterPresenter {


    private Map<String, User> onlineUsers = new HashMap<String, User>();

    public void addUser(String login, LocalDate localDate, City city) {
        System.out.println(login + " connected");

        if (!this.onlineUsers.containsKey(login)) {
            this.onlineUsers.put(login, new User(login, LocalDate.now(), city));
        }
        else {
            int i = 1;
            while ((this.onlineUsers.containsKey(login)))
            this.onlineUsers.put(login, new User(login, LocalDate.now(), city));{
                login = login +i;
                i++;
            }
        }

    }

    public void deleteUser(String login) {
        this.onlineUsers.remove(login);
    }

    public List[] getUsers() {
        return this.onlineUsers.keySet().toArray(new List [0]);
    }

    public ArrayList<User> getClientsList() {
        ArrayList<User> clientsList = new ArrayList<User>(this.onlineUsers.entrySet().size());

        String s = "";
        for(Map.Entry<String, User> m : this.onlineUsers.entrySet()){
            clientsList.add(m.getValue());
            System.out.println(m.getKey());
            s = s + m.getKey();
        }
        return clientsList;
    }
}
