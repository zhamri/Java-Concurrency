package Week_04;

class TestSleep2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                // thread to sleep for 5000 milliseconds
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(new TestSleep2(), "One");
        Thread t2 = new Thread(new TestSleep2(), "TWO");
        Thread t3 = new Thread(new TestSleep2(), "Three");
        t1.start();
        t2.start();
        t3.start();
    }
}
