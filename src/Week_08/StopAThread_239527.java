package Week_08;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.currentThread;

public class StopAThread_239527 {
    public static void main(String[] args) throws InterruptedException {
       Task myTask = new Task(); 
       Thread t1 = new Thread(myTask,"t1");
       t1.start();
       
        System.out.println(currentThread().getName()+ " is running...");
        myTask.stop();
        
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println(currentThread().getName()+" finish...");
    }
}
    class Task implements Runnable{
    private volatile boolean exit = false;
    
    public void run(){
        while(!exit){
            System.out.println("Thread Still Running...");
    }System.out.println("Thread is going to stop...");
}
    public void stop(){
        exit= true;
    }
}
