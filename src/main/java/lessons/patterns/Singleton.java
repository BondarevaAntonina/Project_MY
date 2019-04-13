package lessons.patterns;

import java.util.Objects;
/*
* Creational pattern
* */
public class Singleton {
    private static Singleton singleton;
    private String name;
    private int age;

    private Singleton(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Singleton getInstance(String name, int age) {
        if (Objects.isNull(singleton)) {
            singleton = new Singleton(name, age);
        }

        return singleton;
    }

    public String getName() {
        return name;
    }
}

class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("John", 12);

        Singleton singleton1 = Singleton.getInstance("Jack", 12);

        System.out.println(singleton1.getName());
    }
}
