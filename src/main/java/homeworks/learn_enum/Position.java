package homeworks.learn_enum;

/**
 * Created by antoni on 29.05.2018.
 * Для должности создать отдельный класс с полем название должности
 */
public class Position {

    private String name;

    public Position(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String
    toString() {
        return "Position{" +
                "name='" + name + '\'' +
                '}';
    }
}
