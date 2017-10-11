
package Week_06;

public class TestSynchronized2p {

    private static int count;

    public static void MyThread() {
        
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    count++;
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    count++;
                }
            }
        };
        t1.start();
        t2.start();
    }
    
    public static void main(String[] args) {
        MyThread();
        System.out.println("count= " + count);
    }
}
