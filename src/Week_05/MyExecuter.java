
package Week_05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecuterRunnable implements Runnable {

    private final long countUntil;

    ExecuterRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i < countUntil; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

public class MyExecuter {

    private static final int MYPOOL = 10;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(MYPOOL);
        for (int i = 0; i < 20; i++) {
            Runnable worker = new ExecuterRunnable(10000000L + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
