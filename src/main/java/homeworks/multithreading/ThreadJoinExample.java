package homeworks.multithreading;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by antoni on 12.11.2019.
 */
public class ThreadJoinExample {
    public static void main(String[] args) {
        Thread user1 = new Thread(new MyRunnable(), "User1");
        Thread user2 = new Thread(new MyRunnable(), "User2");
        Thread user3 = new Thread(new MyRunnable(), "User3");
        Thread user4 = new Thread(new MyRunnable(), "User4");
        Thread user5 = new Thread(new MyRunnable(), "User5");



        try {
            user1.start();
            user1.join();

            user2.start();
            user2.join();

            user3.start();
            user3.join();

            user4.start();
            user4.join();

            user5.start();
            user5.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads worked, we complete the program");
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread started work :::" + Thread.currentThread().getName());
        try {
            OccurrencesOfWordsInText.countNumberOfWordsInFile();
        } catch (InterruptedException | FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Flow worked:::" + Thread.currentThread().getName());
    }

}
