
import static java.lang.Thread.currentThread;
import java.util.concurrent.TimeUnit;

public class TryStop {

    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();
        Thread t1 = new Thread(worker);
        t1.start();

       System.out.println(currentThread().getName() + " is stopping Server thread");//Let's wait to see server thread stopped
       TimeUnit.MILLISECONDS.sleep(5000); System.out.println(currentThread().getName() + " is finished now");
       t1.stop();

    }
}