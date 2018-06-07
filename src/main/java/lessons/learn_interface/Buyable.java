package lessons.learn_interface;

public interface Buyable {
    void buy();

    default void print() {
        System.out.println();
    }

    static void staticMethod() {

    }
}
