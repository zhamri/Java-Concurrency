package Week_03;

class CheckAlive implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running ...");
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new CheckAlive(), "FirstThread");
        Thread t2 = new Thread(new CheckAlive(), "SecondThread");

        System.out.println("State FirstThread: " + t1.getState());
        System.out.println("State SecondThread: " + t2.getState());
        t1.start();
        System.out.println("State FirstThread: " + t1.getState());
        System.out.println("State SecondThread: " + t2.getState());

        if (t1.isAlive()) {
            System.out.format("%s is alive.%n", t1.getName());
        } else {
            System.out.format("%s is not alive.%n", t1.getName());
        }
        System.out.println("State FirstThread: " + t1.getState());
        System.out.println("State SecondThread: " + t2.getState());

        if (t2.isAlive()) {
            System.out.format("%s is alive.%n", t2.getName());
        } else {
            System.out.format("%s is not alive.%n", t2.getName());
        }
        System.out.println("State FirstThread: " + t1.getState());
        System.out.println("State SecondThread: " + t2.getState());
    }
}
