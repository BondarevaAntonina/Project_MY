package homeworks.learn_enum;

public class ManService {

    //проверять однофамильцев у двух людей

    public static void isTheSameLastNames(Man man, Man manTwo) {

        String message = "These men haven't the same lastnames";

        if (man.getSurname().equals(manTwo.getSurname())) {
            message = "These men have the same lastnames";
        }

        System.out.println(message);
    }

    //проверять должности на одинаковость у двух людей
    public static void isThePositionMan(Man man, Man manTwo) {

        String message = "These people do not have the same positions";

        if (man.getPosition().equals(manTwo.getPosition())) {
            message = "These men have the same positions";
        }

        System.out.println(message);

    }
    // вывести данные о человеке.
    public static void isDataPerson(Man man) {
       man.showDataMan();

    }

}
