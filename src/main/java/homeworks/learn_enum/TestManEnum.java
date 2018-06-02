package homeworks.learn_enum;

/**
 * Created by antoni on 29.05.2018.
 */
public class TestManEnum {

    public static void main(String[] args) {
        ManService service = new ManService();

        Position manager = new Position("Manager");

        Man man = new Man(Sex.MAN, "John", "Volter", 23, manager);

    }


}


