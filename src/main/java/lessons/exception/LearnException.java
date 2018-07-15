package lessons.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;

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

    public static void print3() {
        try {
            if (1 == 1) {
                throw new FileNotFoundException();
            } else {
                throw new IOException();
            }
            //code here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print5() {
        try {
            //code here
            throw new IOException();
            //code here
//            dbconnection.close()
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally");
        }
    }

    public static void print7() {
        try {
//           throw new IOException();
//            Runtime.getRuntime().exit(9);
            System.exit(9);
        } finally {
//            System.out.println("Inside finally");
            throw new NullPointerException();
        }
    }

    public static void print8() throws IOException {
        try {
            throw new IOException();
        } catch (IOException e) {
            e = new FileNotFoundException();
            throw e;
        }
    }

    public static void print9() {
        try {
            if (1 == 1) {
                throw new FileNotFoundException();
            } else {
                throw new SQLDataException();
            }
        } catch (FileNotFoundException | SQLDataException e) {

        }
    }

    public static int print6() {
        try {
            return 5;
        } finally {
//            System.out.println("Inside finally");
            return 7;
        }
    }

    public static void print1() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}

class TestException {
    public static void main(String[] args) throws FileNotFoundException {
        LearnException.print7();
//        System.out.println(LearnException.print6());
    }
}
