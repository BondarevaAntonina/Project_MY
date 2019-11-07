package lessons.threads;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class OurThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());

        long start = System.currentTimeMillis();//200

        new Thread("Worker");

        thread1.start();
        thread1.join();
//        thread1.yield();
//        new MyThread("Tonya").start();
        System.out.println("Main thread");
//        throw new NullPointerException();

        Runnable runnable = () -> {

            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }

//            while (true) {}

//            System.out.println("I'm new thread with name " + Thread.currentThread().getName());
        };


        Thread thread = new Thread(runnable);
//        thread.setDaemon(true);
//        thread.start();


//        thread.start();

        long finish = System.currentTimeMillis() - start;//235=35
    }
}

class MyThread extends Thread {

    public MyThread(@NotNull String name) {
        super(name);
    }

    public void print() throws IOException {
        throw new IOException();
    }

    @Override
    public void run() {
        try {
            print();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("I'm new thread with name " + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread sleep");
            Thread.sleep(5000);
            System.out.println("Thread wake up");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


