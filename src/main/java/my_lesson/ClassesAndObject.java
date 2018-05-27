package my_lesson;

/**
 * Created by antoni on 16.03.2018.
 */
public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Каое-то имя");
        person1.setAge(12);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());

        //person1.speak();
        //person1.setName("Рома");
        //person1.setAge(50);
        //System.out.println("Меня зовут " + person1.getName() + "," + "мне " + person1.getAge() + " лет");

        // Person person2 = new Person();
        // person2.setName("Вова");
        //person2.setAge(20);
        //System.out.println("Меня зовут " + person2.getName() + "," + "мне " + person2.getAge() + " лет");
    }
}

class Person {
    //У класса могут быть
    //1. Данные (поля)
    //2. Действия, которые он может совершать (методы)
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустую строку");
        } else {
            this.name = userName;
        }
    }

    public String getName() {

        return name;
    }

    public void setAge(int userage) {
        if (userage < 0) {
            System.out.println("Возраст должен быть положительным");
        }
        this.age = userage;
    }

    public int getAge() {

        return age;
    }

    void speak() {
        String hello;

        hello = "sss";

        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ",мне " + age + " лет");
        }
    }
}
