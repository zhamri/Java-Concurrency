// Lim Siang Yee 240448

package Week_08;

class Worker implements Runnable {

    private boolean isTerminated = false;

    @Override
    public void run() {
        int count = 0;
        while (!Thread.interrupted()) {

            System.out.println("Hello from worker class... " + count++ );

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Here!
            }
        }
    }
}

public class StopWithInterrupt {

    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();
        Thread t1 = new Thread(worker);
        t1.start();
        Thread.sleep(3000);
        t1.interrupt();

        System.out.println("Finished...");
    }
}
