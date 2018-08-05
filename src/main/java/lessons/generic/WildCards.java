package lessons.generic;

import java.util.List;

public class WildCards {

    public static <T extends Parent> void compare(T obj1, T obj2) {

    }

    public static void main(String[] args) {
        compare(new Parent(), new Parent());

        compare(new ChildOne(), new Parent());
    }
}

class Parent {

}

class ChildOne extends Parent {

}

class ChildTwo extends Parent {

}