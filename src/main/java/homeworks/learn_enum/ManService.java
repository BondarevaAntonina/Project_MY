package homeworks.learn_enum;

public class ManService {
    public void isTheSameLastNames(Man man1, Man man2) {

        String message = "These men haven't the same lastnames";

        if (man1.getSurname().equals(man2.getSurname())) {
            message = "These men have the same lastnames";
        }

        System.out.println(message);
    }
}
