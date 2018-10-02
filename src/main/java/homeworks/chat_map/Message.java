package homeworks.chat_map;


import java.nio.file.Path;
import java.time.LocalDateTime;

public class Message {
    private String from;
    private String to;
    private String message;
    private LocalDateTime dateTime;
    private Path path;

    public Message(String from, String to, String message, LocalDateTime dateTime) {
        this.from = from;
        this.to = to;
        this.message = message;
        this.dateTime = dateTime;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setPath(Path path) {
        this.path = path;
    }
}
