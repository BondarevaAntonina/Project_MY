package homeworks.chat_map;

import jdk.nashorn.internal.runtime.regexp.joni.Config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChatHistory implements Serializable {

    private List<Chat> history;

    public ChatHistory() {
        this.history = new ArrayList<Chat>(Integer.parseInt(DerictoryUser.FILE_PATH));
    }

    public void addMessage(Chat chat){
        if (this.history.size() > Integer.parseInt(DerictoryUser.FILE_PATH)){
            this.history.remove(0);
        }

        this.history.add(chat);
    }

    public List<Chat> getHistory(){
        return this.history;
    }

}
