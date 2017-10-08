package Week_05;

class TestAtomicInteger1p {

    public static void main(String[] args) throws InterruptedException {

        CountProblem pt = new CountProblem();
        Thread t1 = new Thread(pt, "t1");
        Thread t2 = new Thread(pt, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count=" + pt.getCount());
    }
}

class CountProblem implements Runnable {

    private int count;

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            processSomething(i);
            count++;
        }
    }

    public int getCount() {
        return this.count;
    }

    private void processSomething(int i) {
        try {
            Thread.sleep(i * 200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
