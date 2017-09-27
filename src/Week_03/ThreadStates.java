package Week_03;

class ThreadStates {

    public static void main(String[] args) {
        Thread t = new Thread();
        Thread.State e = t.getState();
        Thread.State[] ts = e.values();
        for (int i = 0; i < ts.length; i++) {
            System.out.println(ts[i]);
        }
    }
}
