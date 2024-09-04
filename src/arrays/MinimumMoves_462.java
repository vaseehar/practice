package arrays;

import java.util.Arrays;

public class MinimumMoves_462 {

    public static void main(String[] args) {
        System.out.println(new MinimumMoves_462().minMoves2(new int[]{1, 10, 2, 9}));
    }

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, median = nums[n / 2], total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.abs(nums[i] - median);
        }
        return total;
    }

}
