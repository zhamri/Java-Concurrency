package Week_05;;

import java.util.concurrent.atomic.AtomicInteger;

class TestAtomicInteger1s {

    public static void main(String[] args) throws InterruptedException {

        CountSolution pt = new CountSolution();
        Thread t1 = new Thread(pt, "t1");
        Thread t2 = new Thread(pt, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count=" + pt.getCount());
    }

}

class CountSolution implements Runnable {

//    private int count;
    private AtomicInteger count = new AtomicInteger();  //New

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            processSomething(i);
//            count++;
            count.incrementAndGet();  //New
        }
    }

    public int getCount() {
//        return this.count;
        return this.count.get();  //New
    }

    private void processSomething(int i) {
        try {
            Thread.sleep(i * 200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
