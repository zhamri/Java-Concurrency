package Week_02;

class MyDaemonThread extends Thread {

    @Override
    public void run() {

        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread executing ...");
        } else {
            System.out.println("user thread executing ...");
        }
    }

    public static void main(String[] args) {

        MyDaemonThread t1 = new MyDaemonThread();
        MyDaemonThread t2 = new MyDaemonThread();

        t1.setDaemon(true);

        t1.start();
        t2.start();
    }
}
