package Week_13;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class SimpleRecursiveAction extends RecursiveAction {

    private int simulateWork;

    public SimpleRecursiveAction(int simulateWork) {
        this.simulateWork = simulateWork;
    }

    @Override
    protected void compute() {
        if (simulateWork > 100) {
            System.out.println("Parallel execution ... " + simulateWork);
            SimpleRecursiveAction action1 = new SimpleRecursiveAction(simulateWork / 2);
            SimpleRecursiveAction action2 = new SimpleRecursiveAction(simulateWork / 2);
            action1.fork();
            action2.fork();
        } else {
            System.out.println("Sequential execution ..." + simulateWork);
        }
    }
}

public class TestRecursiveAction1 {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        SimpleRecursiveAction action = new SimpleRecursiveAction(120);
        pool.invoke(action);
    }
}
