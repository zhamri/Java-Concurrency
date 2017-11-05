package com.issue.rt_issue_08_01.stopThread;

public class StopThread extends Thread implements Runnable {

    private volatile boolean flag = true;

    public void stopRunning() {
        flag = false;
    }

    @Override
    public void run() {
        int count = 0;
        while (flag) {
            System.out.println("Hello from worker class... " + count++);
            
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Finished...");
    }

    public static void main(String[] args) {
        StopThread thread = new StopThread();
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.stopRunning();
    }
}
