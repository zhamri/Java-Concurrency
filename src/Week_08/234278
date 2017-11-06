package Week8;

/**
 *
 * @syammila
 */
public class StopThread {

    public static void main(String[] args) throws InterruptedException {

        ThreadStop stop = new ThreadStop();
        Thread t1 = new Thread(stop);
        t1.start();
        Thread.sleep(3000);
        t1.interrupt();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Finished...");
    }
}

class ThreadStop implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (!Thread.interrupted()) {

            System.out.println("Hello from worker class... " + count++ );

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
