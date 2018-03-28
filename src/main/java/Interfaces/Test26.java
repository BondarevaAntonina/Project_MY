package Interfaces;

/**
 * Created by antoni on 26.03.2018.
 */
public class Test26 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.sayHello();
    }
}
