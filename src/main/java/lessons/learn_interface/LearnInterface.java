package lessons.learn_interface;

public class LearnInterface implements Buyable {
    @Override
    public void buy() {
        System.out.println("Buy something");
    }

    @Override
    public void print() {

    }
}

class TestInterface {
    public static void main(String[] args) {
        Buyable buyable = new LearnInterface();

        buyable.print();

        Buyable.staticMethod();
    }
}
