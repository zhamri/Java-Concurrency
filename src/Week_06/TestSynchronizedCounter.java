
package Week_06;

class SynchronizedCounter {

    private static int count = 0;

    public synchronized static void increment() {
        ++count;
        System.out.println("Count is " + count + " @ " + System.nanoTime());
    }

    public synchronized static void decrement() {
        --count;
        System.out.println("Count is " + count + " @ " + System.nanoTime());
    }
}

class TestSynchronizedCounter {

    public static void main(String[] args) {
        Thread threadIncrement = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; ++i) {
                    SynchronizedCounter.increment();
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        Thread threadDecrement = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; ++i) {
                    SynchronizedCounter.decrement();
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        threadIncrement.start();
        threadDecrement.start();
    }
}
