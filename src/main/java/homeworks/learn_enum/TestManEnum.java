package homeworks.learn_enum;

/**
 * Created by antoni on 29.05.2018.
 * Создать несколько людей с одинаковой и разными должностями.
 */
public class TestManEnum {

    public static void main(String[] args) {
        ManService service = new ManService();

        Position manager = new Position("Manager");
        Position managerTwo = new Position("Team Lead");
        Position managerThree = new Position("Team Lead");

        Man man = new Man(Sex.MAN, "John", "Volter", 23, manager);
        Man manTwo = new Man(Sex.MAN, "John", "Volter", 23, managerTwo);
        Man manThree = new Man(Sex.MAN, "Gektor", "Dokeri", 34, managerThree);
        Man manFour = new Man(Sex.MAN, "Alisi", "Brag", 37, managerThree);
        Man manFive = new Man(Sex.MAN, "Bobi", "Brag", 38, manager);


    }

}


