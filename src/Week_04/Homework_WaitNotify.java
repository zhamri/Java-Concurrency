package Week_04;

class WaitNotifyThread extends Thread {

    boolean waiting = true;
    boolean ready = false;

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + " starting.");

        while (waiting) {
            System.out.println("waiting:" + waiting);
        }
        System.out.println("waiting...");
        startWait();
        try {
            Thread.sleep(1000);
        } catch (Exception exc) {
            System.out.println(tName + " interrupted.");
        }
        System.out.println(tName + " terminating.");
    }

    synchronized void startWait() {
        try {
            while (!ready) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("wait() interrupted");
        }
    }

    synchronized void notice() {
        ready = true;
        notify();
    }
}

public class Homework_WaitNotify {

    public static void main(String args[]) throws Exception {
        WaitNotifyThread t1 = new WaitNotifyThread();
        t1.setName("MyThread #1");
        showThreadStatus(t1);

        t1.start();
        Thread.sleep(50);
        showThreadStatus(t1);

        t1.waiting = false;
        Thread.sleep(50);
        showThreadStatus(t1);

        t1.notice();
        Thread.sleep(50);
        showThreadStatus(t1);

        while (t1.isAlive()) {
            System.out.println("alive");
        }
        showThreadStatus(t1);
    }

    static void showThreadStatus(Thread thrd) {
        System.out.println(thrd.getName() + " Alive:" + thrd.isAlive() + " State:" + thrd.getState());
    }
}
