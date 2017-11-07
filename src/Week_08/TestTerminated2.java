//Refer to http://www.java67.com/2015/07/how-to-stop-thread-in-java-example.html

import static java.lang.Thread.currentThread;
import java.util.concurrent.TimeUnit;

public class TestTerminated2 {
    public static void main(String args[]) throws InterruptedException { 
        Server myServer = new Server();
        
        Thread t1 = new Thread(myServer, "T1");
        t1.start();
        
        System.out.println(currentThread().getName() + " is stopping Server thread"); 
        myServer.stop();
        
        TimeUnit.MILLISECONDS.sleep(5000);
        System.out.println(currentThread().getName() + " is finished now");
    }
}

class Server implements Runnable{ 
    private volatile boolean exit = false;
    
    public void run() { 
        while(!exit){ 
            System.out.println("Server is running.....");
        }
        
        System.out.println("Server is stopped....");
    } 
    public void stop(){
        exit = true;
    }
}


