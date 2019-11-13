package lessons.threads.synchronization;

import java.util.concurrent.TimeUnit;

/*
http://www.javaworld.com/article/2074318/java-concurrency/java-101--understanding-java-threads--part-2--thread-synchronization.html
*  Unlike class and instance field variables, threads cannot share local variables and parameters.
*  The reason: Local variables and parameters allocate on a thread's method-call stack.
*  As a result, each thread receives its own copy of those variables. In contrast, threads can share class
*  fields and instance fields because those variables do not allocate on a thread's method-call stack.
*  Instead, they allocate in shared heap memory—as part of classes (class fields) or objects (instance fields).
*  Explain:
*  On a single-processor machine, threads share the processor. As a result, one thread can only execute for a certain time period.
*  At that time, the JVM/operating system pauses that thread's execution and allows another thread to execute—a manifestation of
*  thread scheduling, a topic I discuss in Part 3. On a multiprocessor machine, depending on the number of threads and processors,
*  each thread can have its own processor.
On a single-processor machine, a thread's execution period might not last long enough for that thread to finish executing
its critical code section before another thread begins executing its own critical code section. On a multiprocessor machine,
threads can simultaneously execute code in their critical code sections. However, they might enter their critical
code sections at different times.
On either single-processor or multiprocessor machines, the following scenario can occur:
Thread A assigns a value to shared variable X in its critical code section and decides to perform an
input/output operation that requires 100 milliseconds. Thread B then enters its critical code section,
assigns a different value to X, performs a 50-millisecond input/output operation, and assigns values to shared
variables Y and Z. Thread A's input/output operation completes, and that thread assigns its own values to Y and Z.
Because X contains a B-assigned value, whereas Y and Z contain A-assigned values, an inconsistency results.
* */
public class Bank {
    public static void main(String[] args) {
        FinTrans ft = new FinTrans();
        TransThread tt1 = new TransThread(ft, "Deposit Thread");
        TransThread tt2 = new TransThread(ft, "Withdrawal Thread");
        tt1.start();
        tt2.start();
    }
}

class FinTrans {
    public static String transName;
    public static double amount;
}

class TransThread extends Thread {
    private FinTrans ft;

    TransThread(FinTrans ft, String name) {
        super(name); // Save thread's name
        this.ft = ft; // Save reference to financial transaction object
    }

    public void run() {
        for (int i = 0; i < 5; i++) {

            if (getName().equals("Deposit Thread")) {
                synchronized (ft) {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + " " + Thread.holdsLock(ft));
                    // Start of deposit thread's critical code section
                    ft.transName = "Deposit";
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    ft.amount = 2000.0;
                    System.out.println(ft.transName + " " + ft.amount);
                    // End of deposit thread's critical code section
                    System.out.println("End -> " + name + " " + Thread.holdsLock(ft));
                }

            } else {
                synchronized (ft) {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + " " + Thread.holdsLock(ft));
                    // Start of withdrawal thread's critical code section
                    ft.transName = "Withdrawal";
                    try {
                        Thread.sleep((int) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                    }
                    ft.amount = 250.0;
                    System.out.println(ft.transName + " " + ft.amount);
                    // End of withdrawal thread's critical code section
                    System.out.println("End -> " + name + " " + Thread.holdsLock(ft));
                }
            }
        }
    }
}
