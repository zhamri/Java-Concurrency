package Week_03;

class CheckStateAlive {

    public static void main(String[] args) throws InterruptedException {

        MyRunnable runnableJob = new MyRunnable();
        Thread thread = new Thread(runnableJob);

        displayStateAndIsAlive(thread);
        thread.start();
        displayStateAndIsAlive(thread);
        Thread.sleep(1000);
        displayStateAndIsAlive(thread);
    }

    public static void displayStateAndIsAlive(Thread thread) {
        System.out.println("State:" + thread.getState());
        System.out.println("Is alive?:" + thread.isAlive());
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("MyRunnable is running");
    }

}
