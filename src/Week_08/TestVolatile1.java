package Week_08;

import java.util.Scanner;

class MyRunning extends Thread {

    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Running");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}

public class TestVolatile1 {

    public static void main(String[] args) {
        MyRunning pro = new MyRunning();
        pro.start();
        System.out.println("Enter something to stop the thread: ");
        new Scanner(System.in).nextLine();
        pro.shutdown();
    }
}
