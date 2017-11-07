//http://javaconceptoftheday.com/how-to-stop-a-thread-in-java/
package Week_08;

class MyThread extends Thread {

    @Override
    public void run() {
        int count = 0;
        while (!Thread.interrupted()) {
            System.out.println("I am running ..." + count++);
        }
        System.out.println("Stopped Running ....");
    }
}

public class TestStopThread1 {

    public static void main(String[] args) {
        
        MyThread thread = new MyThread();
        thread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //interrupting the thread
        thread.interrupt();
    }
}
