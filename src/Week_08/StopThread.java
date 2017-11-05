
package Week_8;

public class StopThread
{   
    public static void main(String[] args) 
    {
        MyThread thread = new MyThread();
         
        thread.start();
         
        try
        {
            Thread.sleep(500);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
         
        thread.stopRunning();
    }    
}


class MyThread extends Thread
{

    
    private volatile boolean flag = true;
    public void stopRunning()
    {
        flag = false;
    }
     
    @Override
    public void run()
    {
        
         
        while (flag)
        {
            System.out.println("Running....");
        }
         
        System.out.println("Thread Stopped Running....");
    }
}
 
