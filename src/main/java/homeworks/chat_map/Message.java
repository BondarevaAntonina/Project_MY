package homeworks.chat_map;


import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Objects;

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

    public boolean isInPeriod(LocalDateTime from, LocalDateTime to) {
        return dateTime.isAfter(from) && dateTime.isBefore(to);
    }

    @Override
    public String toString() {
        return "\nMessage{" + "from='" + from + '\'' + ", " +
                "to='" + to + '\'' + ", " +
                "message='" + message + '\'' + ", " +
                "dateTime=" + dateTime + ", " +
                (Objects.nonNull(path) ? "path=" + path : "") + '}';
    }

    public String getFrom() {
        return from;
    }

    public Path getPath() {
        return path;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setPath(Path path) {
        this.path = path;
    }
}
