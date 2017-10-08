package Week_04;

class YThread extends Thread {

    private String name;

    public YThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; ++i) {
            System.out.println(name + ": " + i);
            yield();
        }
    }
}

class TestYield2 {

    public static void main(String[] args) {
        Thread[] threads = {
            new YThread("One"),
            new YThread("TWO"),
            new YThread("Three")
        };
        for (Thread t : threads) {
            t.start();
        }
    }
}
