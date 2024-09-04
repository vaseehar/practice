package arrays;

public class MaxAverage_643 {

    public static void main(String[] args) {
        System.out.println(new MaxAverage_643().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(new MaxAverage_643().findMaxAverage(new int[]{5}, 1));
    }

    public double findMaxAverage(int[] nums, int k) {
        double maxSum = Integer.MIN_VALUE;
        double currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if (i >= k - 1) {
                maxSum = Math.max(maxSum, currSum);
                currSum -= nums[i - k + 1];
            }

        }
        return maxSum / k;
    }

}
