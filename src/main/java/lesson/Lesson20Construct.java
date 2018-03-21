package lesson;

/**
 * Created by antoni on 21.03.2018.
 */
public class Lesson20Construct {
    public static void main(String[] args) {
        Human human1= new Human();

    }
}

class HumanCons {
    private String name;
    private int age;

    public HumanCons(){
        this.name="Имя по умолчанию";
        this.age = 0;
    }

//    public HumanCons() {
//        System.out.println("Привет из первого конструктора");
//    }

    public HumanCons(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public HumanCons(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}