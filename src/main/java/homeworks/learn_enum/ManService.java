package homeworks.learn_enum;

public class ManService {

    //проверять однофамильцев у двух людей
    public void isTheSameLastNames(Man man1, Man man2) {

        String message = "These men haven't the same lastnames";

        if (man1.getSurname().equals(man2.getSurname())) {
            message = "These men have the same lastnames";
        }

        System.out.println(message);
    }

    //проверять должности на одинаковость у двух людей
    public void isThePositionMan(Man man1, Man man2){

        String message = "These people do not have the same positions";

        if (man1.getSurname().equals(man2.getSurname())) {
            message = "These men have the same positions";
        }

        System.out.println(message);

    }
}
