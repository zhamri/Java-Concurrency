package Week08_01;

import static java.lang.Thread.currentThread;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Aman
 */
public class StopThread {
    public static void main(String args[]) throws InterruptedException { 
        
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("Processors: "+processors);
        
        Server myServer = new Server(); Thread test = new Thread(myServer, "Test"); 
        test.start();
        System.out.println(currentThread().getName() + " is stopping Server thread"); 
        myServer.stop(); 
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println(currentThread().getName() + " is finished now"); 
    }
}
class Server implements Runnable{ 
    private volatile boolean exit = false; 
    @Override
    public void run() { 
        while(!exit){ 
        System.out.println("Server is running....."); 
        } 
    System.out.println("Server is stopped...."); 
    } 
    public void stop(){ exit = true; 
    } 
}