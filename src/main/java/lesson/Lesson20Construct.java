package lesson;

import PageObject.HomePage;

/**
 * Created by antoni on 21.03.2018.
 */
public class Lesson20Construct {
    public static void main(String[] args) {
        /*
        HumanCons.description = "Nice";
        HumanCons h1 = new HumanCons("Bob", 40);
        HumanCons h2 = new HumanCons("Tom", 30);
        HumanCons.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        HumanCons.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();
        */
        System.out.println(Math.pow(5, 3));
    }
}

class HumanCons {
    private String name;
    private int age;

    public static String description;

//    public HumanCons(){
//        this.name="Имя по умолчанию";
//        this.age = 0;
//    }

//    public HumanCons() {
//        System.out.println("Привет из первого конструктора");
//    }

//    public HumanCons(String name) {
//        System.out.println("Привет из второго конструктора");
//        this.name = name;
//    }

    public HumanCons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAllFields() {
        System.out.println(name + "," + age + "," + description);
    }

}