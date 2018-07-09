package lessons.inheritance;

import java.nio.file.Files;

public class TaskEpam {
    public static void main(String[] args) {
        Melon melon = new Melon();//123456
    }
}

class Vegetable {

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    public Vegetable() {
        System.out.println("3");
    }
}

class Melon extends Vegetable {

    static {
        System.out.println("4");
    }

    {
        System.out.println("5");
    }

    public Melon() {
        super();
        System.out.println("6");
    }
}

final class UnMutableClass {
    private int age;

    private UnMutableClass(int age) {
        this.age = age;
    }

    public static UnMutableClass getIntance(int age) {
        return new UnMutableClass(age);
    }

    public int getAge() {
        return age;
    }
}

class TestUnMutable {
    public static void main(String[] args) {
//            UnMutableClass unMutableClass = new UnMutableClass();
        UnMutableClass unMutableClass = UnMutableClass.getIntance(12);

    }
}


