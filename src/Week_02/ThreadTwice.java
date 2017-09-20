package Week_02;

class Testing implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " is running ...");

    }

    public static void main(String args[]) {
        Thread t1 = new Thread(new Testing(), "t1");
        t1.start();
        t1.start();
    }
}
