//https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.State.html

package Week_03;

class ThreadStatesInJava {

    public static void main(String[] args) {
        Thread.State[] states = Thread.State.values();

        for (Thread.State state : states) {
            System.out.println(state);
        }
    }
}
