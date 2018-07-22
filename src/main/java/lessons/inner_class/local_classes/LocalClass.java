package lessons.inner_class.local_classes;

public class LocalClass {

    private static String name = "";

    private int age;

    void print(String str) {
        /*for (; ; ) {
            class Foo {

            }
        }*/

        class Foo {

          /*  interface Ballable {

            }*/

            final static int count = 0;

            void get() {
                System.out.println(name + age + str);
            }
        }

    }

}
