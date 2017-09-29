package Test_files.Assignment1;

public class TestWaitNotify {

    public static void main(String args[]) throws Exception {
        MyThread thrd = new MyThread();
        thrd.setName("MyThread #1");
        showThreadStatus(thrd);

        thrd.start();
        Thread.sleep(50);
        showThreadStatus(thrd);

        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thrd);

        thrd.notice();
        Thread.sleep(50);
        showThreadStatus(thrd);

        while (thrd.isAlive()) {
            System.out.println("alive");
        }
        showThreadStatus(thrd);
    }

    static void showThreadStatus(Thread thrd) {
        System.out.println(thrd.getName() + " Alive:" + thrd.isAlive() + " State:" + thrd.getState());
    }
}
