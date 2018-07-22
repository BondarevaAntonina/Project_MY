package lessons.inner_class;

public class OuterClass {

    private static String name;

    private int age;

    interface Ballable {

    }

    class InnerClass implements Ballable {

        final static String firstName = "";

        public InnerClass() {
        }

        void print() {
            System.out.println(age + name);
        }
    }

    static class StaticInnerClass {

        static String firstName = "";

        void print() {
            System.out.println(name);
        }

    }

}

class TestInnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
    }
}
