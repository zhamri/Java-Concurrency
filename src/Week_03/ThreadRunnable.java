package Week_03;

class ThreadRunnable {

    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
        System.out.println(t.getState());
    }
}
