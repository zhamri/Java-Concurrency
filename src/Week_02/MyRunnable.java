package Week_02;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        MyRunnable m1 = new MyRunnable();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}