package lessons.inner_class.anonymouse_class;

public class LearnAnonymousClass {
    static String hello = "";
    int age;

    interface Ballable {
        void jump();
    }


    public static void main(String[] args) {
        Ballable ballable = new Ballable() {

            final static String name = "";


            @Override
            public void jump() {
                System.out.println("Jumping..." + hello);
            }
        };

        ballable.jump();
    }
}
