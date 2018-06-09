package homeworks.meeting;

import homeworks.learn_enum.Sex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class PersonService {
    private Man[] men;

    public PersonService() {
        men = new Man[10];
    }

//Регистрироваться человеку старше 18 лет

    public void addMan(int age, String shortName, String name, String surname, int children, String city) {

        String log = LocalDateTime.now() + "\taddElement" + "\tincoming param -> " + age + shortName + name + surname + children + city;

        writeLog(log);

        if (age == 0) {

            return;
        }

        for (int i = 0; i < men.length; i++) {
            if (age >= 18) {
                break;
            }
        }
    }


    private void writeLog(String log) {

        Path path = Paths.get("./Logs", "Logs.txt");
        try {
            Files.write(path, ("\n" + log).getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
