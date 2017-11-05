package stopthread;

public class StopThread extends Object implements Runnable {
  private volatile boolean stopRequested;

  private Thread runThread;

  public void run() {
    runThread = Thread.currentThread();
    stopRequested = false;

    int count = 0;

    while (!stopRequested) {
      System.out.println("Running ... count=" + count);
      count++;

      try {
        Thread.sleep(300);
      } catch (InterruptedException x) {
         // re-assert interrupt
        Thread.currentThread().interrupt();
      }
    }
  }

  public void stopRequest() {
    stopRequested = true;

    if (runThread != null) {
      runThread.interrupt();
    }
  }

  public static void main(String[] args) {
    StopThread as = new StopThread();
    Thread t = new Thread(as);
    t.start();

    try {
      Thread.sleep(2000);
    } catch (InterruptedException x) {
    }
    as.stopRequest();
  }
} 
