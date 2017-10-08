package Week_04;

class TestPriority1 extends Thread {

    @Override
    public void run() {
        System.out.println("thread name is: " + Thread.currentThread().getName());
        System.out.println("thread priority is :" + Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {

        TestPriority1 t1 = new TestPriority1();
        TestPriority1 t2 = new TestPriority1();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setName("satu");
        t2.setName("sepuluh");
        t1.start();
        t2.start();
    }
}
