package lessons.learn_class;

public class LearnClass {
    private int age;

    private String name;

    public static int count = 0;

    public static final String LAST_NAME;

    public final String FIRST_NAME;

    {
//        System.out.println("Non-static block initialization");
    }

    static {
        LAST_NAME = "12";
//        System.out.println("Static block initialization");
//        System.out.println("Hello world");
    }

    public LearnClass(int age, String name) {
        FIRST_NAME = "45";

//        System.out.println("Constructor");
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {//(this, age)
        if (age < 0) {
            System.out.println();
            return;
        }
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    /*public static void main(String[] args) {

    }*/
}

class TestClass {
    public static void main(String[] args) {
        LearnClass class1 = new LearnClass(10, "John");

//        LearnClass.count = 15;

        class1.setAge(40);//(this, 40)

        LearnClass class2 = new LearnClass(10, "John");

        System.out.println(LearnClass.count);
    }
}
