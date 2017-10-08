package Week_04;

class TestPriority3 extends Thread {

    @Override
    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {

        Thread.currentThread().setPriority(8);

        System.out.println("main thread priority : "
                + Thread.currentThread().getPriority());

        TestPriority3 t1 = new TestPriority3();

        // t1 thread is child of main thread
        // so t1 thread will also have priority 8.
        System.out.println("t1 thread priority : " + t1.getPriority());
    }
}
