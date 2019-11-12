package homeworks.multithreading;

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


        user1.start();

        try {
            user1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        user2.start();
        user3.start();
        user4.start();

        try {
            user1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        user5.start();


        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все потоки отработали, завершаем программу");
    }

}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Поток начал работу :::" + Thread.currentThread().getName());
        try {
            OccurrencesOfWordsInText.countNumberOfWordsInFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток отработал:::" + Thread.currentThread().getName());
    }

}
