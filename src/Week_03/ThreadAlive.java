package Week_03;

class ThreadAlive extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    public void printMsg() {
        Thread ct = Thread.currentThread();
        String name = ct.getName();
        System.out.println("name=" + name);
    }

    public static void main(String[] args) {
        ThreadAlive t = new ThreadAlive();
        System.out.println("before start(): " + t.getName() + " isAlive()= " + t.isAlive());
        t.start();
        System.out.println("after start(): " + t.getName() + " isAlive()= " + t.isAlive());

        for (int i = 0; i < 10; i++) {
            t.printMsg();
        }
        System.out.println("The end of main() method: " + t.getName() + " isAlive()= " + t.isAlive());
    }
}
