package homeworks.Enum;

/**
 * Created by antoni on 29.05.2018.
 *Создать класс Man c полями имя, пол(использовать Enum) фамилия, возраст, должность.
 Для должности создать отдельный класс с полем название должности.

 Создать несколько людей с одинаковой и разными должностями.
 Создать методы позволяющие:
 - вывести данные о человеке.
 - проверять должности на одинаковость у двух людей.
 - проверять однофамильцев у двух людей.
 */
public class ManEnum {
    private String name;
    private Enum Sex;
    private String surname;
    private String age;

    public ManEnum(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}


enum Sex {
    MAN("Man"), WOMAN("Woman");

    private String shortName;

    Sex(String name) {
        shortName = name;
    }

    public String getShortName() {
        return shortName;
    }
}