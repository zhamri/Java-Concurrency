package Test_files.Assignment1;

class MyThread extends Thread {

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

