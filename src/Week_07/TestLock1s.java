package Week_07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock1s {

    private static int counter = 0;
    private static Lock lock = new ReentrantLock();

    public static void increment() {
        lock.lock();
        counter++;
        lock.unlock();
    }

    public static void firstThread() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }

    public static void secondThread() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                firstThread();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                firstThread();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
