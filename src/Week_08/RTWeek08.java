package rtweek08;

public class RTWeek08 implements Runnable {

    private volatile boolean isRunning = true;
    int count = 0;

    public void run() {

        while (isRunning) {
            System.out.println("Count" + count);
            count++;

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void kill() {
        isRunning = false;
    }

    public static void main(String[] args) {
        RTWeek08 r = new RTWeek08();
        Thread t1 = new Thread(r);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        r.kill();
    }

}
