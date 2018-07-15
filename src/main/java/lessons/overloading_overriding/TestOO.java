package lessons.overloading_overriding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestOO {
    public static void main(String[] args) {
        /*Lion lion = new Lion();

        lion.print();*/

//        int a = "";

        Animal[] animals = new Animal[3];

        Animal animal = new Animal();

        Lion lion = new Lion();//new Animal

        Animal mouse = new Mouse();//new Mouse

//        lion.print();

//        System.out.println(animal instanceof Animal);
        System.out.println(lion instanceof Animal);

        List list = new ArrayList();

        list.add("Hello.txt");
        list.add(5);

        for (Object o : list) {
            if (o instanceof Integer) {
//                System.out.println("Integr");
            }

        }
    }
}
