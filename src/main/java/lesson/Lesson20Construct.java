package lesson;

/**
 * Created by antoni on 21.03.2018.
 */
public class Lesson20Construct {
    public static void main(String[] args) {
        HumanCons h1 = new HumanCons("Bob", 40);
        h1.toString();
        System.out.println(h1);

    }
}

class HumanCons {
    private String name;
    private int age;

    public static String description;

    public HumanCons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+","+age;
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