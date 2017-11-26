package Week_13;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SimpleRecursiveTask extends RecursiveTask<Integer> {

    private int simulateWork;

    public SimpleRecursiveTask(int simulateWork) {
        this.simulateWork = simulateWork;
    }

    @Override
    protected Integer compute() {
        if (simulateWork > 100) {
            System.out.println("Parallel execution ... " + simulateWork);
            SimpleRecursiveTask task1 = new SimpleRecursiveTask(simulateWork / 2);
            SimpleRecursiveTask task2 = new SimpleRecursiveTask(simulateWork / 2);
            task1.fork();
            task2.fork();

            int solution = 0;
            solution += task1.join();
            solution += task1.join();

            return solution;

        } else {
            System.out.println("Sequential execution ..." + simulateWork);
            return 2 * simulateWork;
        }
    }
}

public class TestRecursiveTask1 {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        SimpleRecursiveTask task = new SimpleRecursiveTask(120);
        System.out.println(pool.invoke(task));
    }
}
