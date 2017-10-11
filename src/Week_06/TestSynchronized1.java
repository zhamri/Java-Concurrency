package Week_06;

class TestSynchronized1 extends Thread {

    public static void main(String[] args) {

        TestSynchronized1 ts = new TestSynchronized1();
        Thread boy = new Thread(ts);
        Thread girl = new Thread(ts);
        boy.setName("boy");
        girl.setName("girl");
        boy.start();
        girl.start();
    }

    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "..." + i);
            }
        }
    }
}
