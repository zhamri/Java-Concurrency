
package Week_08;

import java.util.Timer;
import java.util.TimerTask;

class CanStop extends Thread {
   private volatile boolean stop = false;
   private int counter = 0;
   
   public void run() {
      while (!stop && counter < 10000) {
         System.out.println(counter++);
      }
      if (stop)
      System.out.println("Detected stop"); 
   }
   public void requestStop() {
      stop = true;
   }
}
public class Stopping {
   public static void main(String[] args) {
      final CanStop stoppable = new CanStop();
      stoppable.start();
      
      new Timer(true).schedule(new TimerTask() {
         public void run() {
            System.out.println("Requesting stop");
            stoppable.requestStop();
         }
      }, 
      350);
   }
} 
