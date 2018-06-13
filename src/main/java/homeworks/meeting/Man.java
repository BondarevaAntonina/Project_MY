package homeworks.meeting;
/**
Создать приложение, позволяющие людям знакомиться.
   Приложение должно позволять:
   1) Регистрироваться человеку старше 18 лет.
   2) После регистрации выводить список подходящих мужчин/ женщин для этого человека по возрасту.
   3) Просматривать зарегистрировавшихся людей. Для мужчин выводить только женщин и наоборот.
   4) Просматривать анкету отдельного человека(поиск по имени и фамилии)
   5) Организовать "умный поиск". Пользователь вводит требования(город, пол, возраст, количество детей)
   и  выводить людей, которые соответствуют требованиям.
 */

import homeworks.learn_enum.Sex;

public class Man {
    private Sex sex;
    private String name;
    private String surname;
    private int age;
    private int children;
    private String city;

    public Man(Sex sex, String name, String surname, int age, int children, String city) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.children = children;
        this.city = city;

    }


    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public int getChildren() {
        return children;
    }


    public void showDataPerson() {
        System.out.println(name + " " + surname + " " + sex + " " + age + " " + children + " " + city + " ");

    }
}


