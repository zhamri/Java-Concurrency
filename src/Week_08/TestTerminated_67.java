package Issue10;

class Workr implements Runnable {
    public boolean jalan = true;
    @Override
    public void run() {
        int count = 0;
        while (jalan) {

            System.out.println("Hello from worker class... " + count++);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

}

public class TestTerminated_67 {

    public static void main(String[] args) {
        Workr worker = new Workr();
        Thread t1 = new Thread(worker);
        t1.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        worker.jalan = false;
        System.out.println("Finished...");
    }

}
