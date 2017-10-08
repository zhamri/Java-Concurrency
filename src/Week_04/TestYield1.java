package Week_04;

public class TestYield1 {

    public static void main(String[] args) {
        
        Thread producer = new Producer();
        Thread consumer = new Consumer();

        producer.setPriority(Thread.MIN_PRIORITY); //Min Priority
        consumer.setPriority(Thread.MAX_PRIORITY); //Max Priority

        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Producer : Produced Item " + i);
            Thread.yield();
        }
    }
}

class Consumer extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Consumer : Consumed Item " + i);
            Thread.yield();
        }
    }
}
