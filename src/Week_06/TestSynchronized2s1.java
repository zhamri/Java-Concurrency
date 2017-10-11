
package Week_06;

public class TestSynchronized2s1 {

    private static int count;
    
    public static synchronized void count(){
        count++;
    }

    public static void MyThread() throws InterruptedException {
        
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    count();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    count();
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    
    public static void main(String[] args) throws InterruptedException {
        MyThread();
        System.out.println("count= " + count);
    }
}
