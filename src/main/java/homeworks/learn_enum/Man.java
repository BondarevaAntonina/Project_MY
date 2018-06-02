package homeworks.learn_enum;

/**
 * Created by antoni on 29.05.2018.
 * Создать класс Man c полями имя, пол(использовать learn_enum) фамилия, возраст, должность.
 * Для должности создать отдельный класс с полем название должности.
 * <p>
 * Создать несколько людей с одинаковой и разными должностями.
 * Создать методы позволяющие:
 * - вывести данные о человеке.
 * - проверять должности на одинаковость у двух людей.
 * - проверять однофамильцев у двух людей.
 */
public class Man {
    private Sex sex;
    private String name;
    private String surname;
    private int age;
    private Position position;

    public Man(Sex sex, String name, String surname, int age, Position position) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String toString () {
        return name + " " + sex + " " + surname + " " + age + " " + position + " ";
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