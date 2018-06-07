package homeworks.meeting;


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

    public int getChildren() {
        return children;
    }
}


