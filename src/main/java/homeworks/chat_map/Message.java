package homeworks.chat_map;


import java.nio.file.Path;
import java.time.LocalDateTime;

public class Message {
    private String from;
    private String to;
    private String message;
    private LocalDateTime dateTime;
    private Path path;

    public Message(String from, String to, String message, LocalDateTime dateTime, Path path) {
        this.from = from;
        this.to = to;
        this.message = message;
        this.dateTime = dateTime;
        this.path = path;
    }

    public Message(String message, LocalDateTime dateTime, Path path) {
        this.message = message;
        this.dateTime = dateTime;
        this.path = path;
    }

    @Override
    public String toString() {
        return "Message{" + "from='" + from + '\'' + ", " +
                "to='" + to + '\'' + ", " +
                "message='" + message + '\'' + ", " +
                "dateTime=" + dateTime + ", " +
                "path=" + path + '}';
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
