package Week_04;

public class TestInterrupt3 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(TestInterrupt3::run);
        t.start();
        Thread.sleep(5000);
        t.interrupt();
    }

    public static void run() {
        int counter = 1;
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Counter:" + counter++);
            } catch (InterruptedException e) {
                System.out.println("I got  interrupted!");
            }
        }
    }
}
