package Week_03;

class ThreadTerminated {

    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                }
            }
        };

        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getState());
    }
}
