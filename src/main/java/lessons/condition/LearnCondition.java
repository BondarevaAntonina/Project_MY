package lessons.condition;

public class LearnCondition {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        /*if (a > 5) {
            System.out.printf("a > 5");
        } else if (a > 2) {
            System.out.println("a > 2");
        } else {
            System.out.println("a <= 5");
        }*/

        if (a > 5) {
            b = 2;
        } else {
            b = 4;
        }

//        condition ? statement if condition is true : statement if condition is false

//        b = a > 15 ? 2 : 4;

        b = a > 5 ? (a < 7 ? 8 : 12) : 4;

        System.out.println(b);


    }
}
