package Week_13;

import java.util.Random;

public class TestSequential {

    public static void main(String[] args) {

        Random random = new Random();
        SequentialSum sequentialSum = new SequentialSum();

        int[] nums = new int[100000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(101) + 1;
            System.out.println(nums[i]);
        }

        long start = System.currentTimeMillis();
        System.out.println("Sum is: " + sequentialSum.sum(nums));
        System.out.println("Single: " + (System.currentTimeMillis() - start) + "ms");
    }
}
