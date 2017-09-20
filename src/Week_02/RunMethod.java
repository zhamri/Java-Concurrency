package Week_02;

class RunMethod implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Thread t1 = new Thread(new RunMethod(), "RT susah");
        Thread t2 = new Thread(new RunMethod(), "RT senang");
        t1.run();
        t2.run();
    }
}
