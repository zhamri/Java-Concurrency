package Week_04;

class TestPriority2 extends Thread {

    @Override
    public void run() {
        System.out.println("thread name is: " + Thread.currentThread().getName()
                + " --> Priority= " + Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {

        TestPriority2 t1 = new TestPriority2();
        TestPriority2 t2 = new TestPriority2();
        System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getPriority());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setName("satu");
        t2.setName("sepuluh");
        t1.start();
        t2.start();
    }
}
