class MyThread extends Thread
{    
    @Override
    public void run()
    {
        while (!Thread.interrupted())
        {
            System.out.println("Running....");
        }
         
        System.out.println("Stopped Running.....");
    }
}
 
public class StopRunThread
{   
    public static void main(String[] args) 
    {
        MyThread thread = new MyThread();
         
        thread.start();
         
        try
        {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
         
        //interrupting the thread
         
        thread.interrupt();
    }    
}
