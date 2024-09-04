package arrays;

public class FindMaxAverage_643 {

    public static void main(String[] args) {
        // System.out.println(new FindMaxAverage_643().findMaxAverage(new int[] { 1, 12,
        // -5, -6, 50, 3 }, 4));
        // System.out.println(new FindMaxAverage_643().findMaxAverage(new int[] { 5 },
        // 1));
        System.out.println(new FindMaxAverage_643().findMaxAverage(new int[]{4, 0, 4, 3, 3}, 5));
    }

    public double findMaxAverage(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        if (nums.length <= k) {
            max = 0;
            for (int i = 0; i < nums.length; i++) {
                max += nums[i];
            }
            return (double) max / nums.length;
        }
        for (int i = 0; i < nums.length - k + 1; i++) {
            int currMax = 0;
            for (int j = i; j < i + k; j++) {
                currMax += nums[j];
            }
            max = Math.max(max, currMax);
        }
        return (double) max / k;
    }

}
