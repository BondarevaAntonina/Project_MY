package lesson;

/**
 * Created by antoni on 16.03.2018.
 */
public class ClassesAndPerson {
    public static void main(String[] args) {
        PersonPeaple person1 = new PersonPeaple();
        person1.name = "Рома";
        person1.age = 50;
        person1.speak();
        PersonPeaple person2 = new PersonPeaple();
        person2.name = "Вова";
        person2.age = 20;
        person2.sayHello();

    }
}

class PersonPeaple {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ",мне" + age + " лет");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}
