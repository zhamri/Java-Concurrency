package Week_03;

class GetStateRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Run by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Thread State of " + Thread.currentThread().getName() + ": " + Thread.currentThread().getState());
        System.out.println("Exit of Thread: " + Thread.currentThread().getName());
    }
}

class CheckState {

    public static void main(String[] args) throws Exception {
        GetStateRunnable gsr = new GetStateRunnable();
        Thread kedah = new Thread(gsr);
        kedah.setName("Kedah");
        Thread perlis = new Thread(gsr);
        perlis.setName("Perlis");
        Thread johor = new Thread(gsr);
        johor.setName("Johor");
        System.out.println("Thread State of Kedah before start(): " + kedah.getState());
        System.out.println("Thread State of Kedah before start(): " + perlis.getState());
        System.out.println("Thread State of Kedah before start(): " + johor.getState());
        kedah.start();
        perlis.start();
        johor.start();
        System.out.println("Thread State of Kedah in Main method before sleep(): " + kedah.getState());
        System.out.println("Thread State of Perlis in Main method before sleep(): " + perlis.getState());
        System.out.println("Thread State of Johor in Main method before sleep(): " + johor.getState());
        Thread.sleep(5000);
        System.out.println("Thread State of Kedah in Main method after sleep(): " + kedah.getState());
        System.out.println("Thread State of Perlis in Main method after sleep(): " + perlis.getState());
        System.out.println("Thread State of Johor in Main method after sleep(): " + johor.getState());
    }
}
