package homeworks.learn_enum;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;

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

    }

    @Title("Check for the same position for two people. Negative test")
    @Test
    public void testshowPositionNeg() throws Exception {

        Man man = new Man(Sex.MAN, "Johns", "Volter", 23, PositionNEW.DEVELOPER);
//        Man manTwo = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.TEAM_LEAD);
//        Man manThree = new Man(Sex.MAN, "Gektor", "Dokeri", 34, PositionNEW.MANAGER);
//        Man manFour = new Man(Sex.MAN, "Alisi", "Brag", 37, PositionNEW.TEAM_LEAD);
        Man manFive = new Man(Sex.MAN, "Bobi", "Brag", 38, PositionNEW.TEAM_LEAD);
        ManService.isThePositionMan(man, manFive);
    }

    @Title("Check for the same position for two people. Positive test")
    @Test
    public void testshowPositionPos() throws Exception {

//        Man man = new Man(Sex.MAN, "Johns", "Volter", 23, PositionNEW.DEVELOPER);
        Man manTwo = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.TEAM_LEAD);
//        Man manThree = new Man(Sex.MAN, "Gektor", "Dokeri", 34, PositionNEW.MANAGER);
        Man manFour = new Man(Sex.MAN, "Alisi", "Brag", 37, PositionNEW.TEAM_LEAD);
//        Man manFive = new Man(Sex.MAN, "Bobi", "Brag", 38, PositionNEW.DEVELOPER);
        ManService.isThePositionMan(manTwo, manFour);
    }

    @Title("Checking the namesakes of two people. Negative test")
    @Test
    public void testshowTheSameLastNamesNeg() throws Exception {

        Man man = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.DEVELOPER);
//        Man manTwo = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.TEAM_LEAD);
//        Man manThree = new Man(Sex.MAN, "Gektor", "Dokeri", 34, PositionNEW.MANAGER);
//        Man manFour = new Man(Sex.MAN, "Alisi", "Brag", 37, PositionNEW.TEAM_LEAD);
        Man manFive = new Man(Sex.MAN, "Bobi", "Brag", 38, PositionNEW.DEVELOPER);
        ManService.isTheSameLastNames(man, manFive);
    }

    @Title("Checking the namesakes of two people. Positive test")
    @Test
    public void testshowTheSameLastNamesPos() throws Exception {

        Man man = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.DEVELOPER);
        Man manTwo = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.TEAM_LEAD);
//        Man manThree = new Man(Sex.MAN, "Gektor", "Dokeri", 34, PositionNEW.MANAGER);
//        Man manFour = new Man(Sex.MAN, "Alisi", "Brag", 37, PositionNEW.TEAM_LEAD);
//        Man manFive = new Man(Sex.MAN, "Bobi", "Brag", 38, PositionNEW.DEVELOPER);
        ManService.isTheSameLastNames(man, manTwo);
    }

    @Title("Output of data about a person")
    @Test
    public void testshowDataPerson() throws Exception {
        Man man = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.DEVELOPER);
        Man manTwo = new Man(Sex.MAN, "John", "Volter", 23, PositionNEW.TEAM_LEAD);
        ManService.isDataPerson(manTwo);
    }
}



