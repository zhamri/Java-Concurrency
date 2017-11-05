package week8;


class MyThread extends Thread {

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("Server Running....");
        }

        System.out.println("Server Stopped.....");
    }
}

public class Week8 {

    public static void main(String[] args) {
        MyThread thread = new MyThread();

        thread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
