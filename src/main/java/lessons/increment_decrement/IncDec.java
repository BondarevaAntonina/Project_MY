package lessons.increment_decrement;

public class IncDec {
    public static void main(String[] args) {
        int count = 1;

       /* count = count + 1;

        count += 1;*/

//        System.out.println(++count);//post increment

//        System.out.println(count);//post increment

//        ++count;//pre increment

        int y = ++count + count++ - count-- + --count;//2 + 2 - 3 + 1

        System.out.println(y);

        System.out.println(count);
    }
}
