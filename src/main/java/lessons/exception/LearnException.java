package lessons.exception;

import java.io.FileNotFoundException;

public class LearnException {
    public static void print() {
//        throw new NullPointerException("I'm NPE");
        try {
            System.out.println();
            throw new FileNotFoundException();
            //code here
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void print1() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}

class TestException {
    public static void main(String[] args) throws FileNotFoundException {
        LearnException.print1();
    }
}
