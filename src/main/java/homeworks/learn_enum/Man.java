package homeworks.learn_enum;

import homeworks.test_zadanie.PutLogStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by antoni on 29.05.2018.
 * Создать класс Man c полями имя, пол(использовать learn_enum) фамилия, возраст, должность. +
 * Для должности создать отдельный класс с полем название должности. +
 * Создать несколько людей с одинаковой и разными должностями. +
 * Создать методы позволяющие:
 * - вывести данные о человеке. +
 * - проверять должности на одинаковость у двух людей. +
 * - проверять однофамильцев у двух людей. +
 */
public class Man {
    private Sex sex;
    private String name;
    private String surname;
    private int age;
    //private Position position;
    private PositionNEW positionNEW;

/*
    public Man(Sex sex, String name, String surname, int age, Position position) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;

    }*/

    public Man(Sex sex, String name, String surname, int age, PositionNEW position) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.positionNEW = position;
        System.setOut(new PutLogStream());
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public PositionNEW getPosition() {
        return positionNEW;
    }

    public String toString() {
        return name + " " + sex + " " + surname + " " + age + " " + positionNEW + " ";
    }
}

enum PositionNEW{
        MANAGER("Manager"),
        TEAM_LEAD("Team lead"),
        DEVELOPER("Developer");
    private String mShortName;

    PositionNEW(String shortName) {
        mShortName = shortName;
    }

    @Override
    public String toString() {
        return mShortName;
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