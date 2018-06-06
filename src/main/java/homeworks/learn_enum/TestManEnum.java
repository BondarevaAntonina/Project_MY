package homeworks.learn_enum;

import org.junit.Test;

/**
 * Created by antoni on 29.05.2018.
 * Создать несколько людей с одинаковой и разными должностями.
 */
public class TestManEnum {

    public static void main(String[] args) {
        //ManService service = new ManService();

        //Position manager = new Position("Manager");
        //Position managerTwo = new Position("Team Lead");
        //Position managerThree = new Position("Team Lead");

        /*
        Man man = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.DEVELOPER);
        Man manTwo = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.TEAM_LEAD);
        Man manThree = new Man(Sex.MAN, "Gektor", "Dokeri", 34,PositionNEW.MANAGER);
        Man manFour = new Man(Sex.MAN, "Alisi", "Brag", 37, PositionNEW.TEAM_LEAD);
        Man manFive = new Man(Sex.MAN, "Bobi", "Brag", 38, PositionNEW.DEVELOPER);

        ManService.isThePositionMan(man, manFive);*/

    }

    @Test
    public void testshowLastNames() throws Exception {

        Man man = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.DEVELOPER);
        Man manTwo = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.TEAM_LEAD);
        Man manThree = new Man(Sex.MAN, "Gektor", "Dokeri", 34,PositionNEW.MANAGER);
        Man manFour = new Man(Sex.MAN, "Alisi", "Brag", 37, PositionNEW.TEAM_LEAD);
        Man manFive = new Man(Sex.MAN, "Bobi", "Brag", 38, PositionNEW.MANAGER);

        ManService.isThePositionMan(man, manFive);

    }
}


