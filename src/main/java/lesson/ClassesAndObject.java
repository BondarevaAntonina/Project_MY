package lesson;

/**
 * Created by antoni on 16.03.2018.
 */
public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Рома");
        person1.setAge(50);
        System.out.println("Меня зовут " + person1.getName() + "," + "мне " + person1.getAge() + " лет");

        Person person2 = new Person();
        person2.setName("Вова");
        person2.setAge(20);
        System.out.println("Меня зовут " + person2.getName() + "," + "мне " + person2.getAge() + " лет");
    }
}

class Person {
    //У класса могут быть
    //1. Данные (поля)
    //2. Действия, которые он может совершать (методы)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

}
