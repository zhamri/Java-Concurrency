package week08;

public class StopThread extends Object implements Runnable {

    private volatile boolean stopReq;

    private Thread runThread;

    @Override
    public void run() {
        runThread = Thread.currentThread();
        stopReq = false;

        int count = 0;

        while (!stopReq) {
            System.out.println("Running...count " + count);
            count++;

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stopReq() {
        stopReq = true;

        if (runThread != null) {
            runThread.interrupt();
        }
    }

    public static void main(String[] args) {
        StopThread st = new StopThread();
        Thread t = new Thread(st);
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        st.stopReq();
        System.out.println("Finished...");
    }
}
