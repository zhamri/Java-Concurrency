
import static com.sun.org.apache.xml.internal.utils.ThreadControllerWrapper.runThread;
import static java.lang.Thread.currentThread;

import java.util.concurrent.TimeUnit;

public class stopThread1 extends Thread {
      

    public static void main(String args[]) throws InterruptedException {
        Threads stopT = new Threads();
        Thread t1 = new Thread(stopT, "T1");
        t1.start();
      
         System.out.println(currentThread().getName() + " is stopping thread");
        stopT.stop();

        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println(currentThread().getName() + " is finished now");
    }
}

class Threads implements Runnable {
        
    private volatile boolean exit = false;
    
    public void run() {
         
        while (!exit) {
            System.out.println("Thread is running.....");
           
        }
        System.out.println("Thread is stopped....");
    }

    public void stop() {
        exit = true;
    }
}
