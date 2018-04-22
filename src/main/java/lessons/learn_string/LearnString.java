package lessons.learn_string;

public class LearnString {
    public static void main(String[] args) {
        String str1 = "Hello";//object-literal -> String pool

        String str2 = new String("Hello");//object

//        System.out.println(str1 == str2.intern());

//        System.out.println(str1.equals(str2));

        System.out.println("1" + 2 + 3);//123

        System.out.println(1 + 2 + "3");//123
    }
}
