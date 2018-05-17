package lessons.wrappers;

public class Wrappers {
    public static void main(String[] args) {
        Integer a = 10;

        int b = 5;

        a = b;//new Integer(b) - autoboxing

        b = a;//unboxing

        Integer i1 = 10;//-128 - 127

        Integer i2 = new Integer(10);

//        i2 = Integer.valueOf(10);

        System.out.println(i1 == i2);
    }
}
