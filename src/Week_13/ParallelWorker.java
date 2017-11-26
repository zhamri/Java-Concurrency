package Week_13;

public class ParallelWorker extends Thread {

    private int[] nums;
    private int low;
    private int high;
    private int partialSum;

    public ParallelWorker(int[] nums, int low, int high) {
        this.nums = nums;
        this.low = low;
        this.high = Math.min(high, nums.length);
    }

    public int getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {

        partialSum = 0;

        for (int i = low; i < high; i++) {
            partialSum += nums[i];
        }
    }
}
