package arrays;

public class MinimizeSSS_209 {

    public static void main(String[] args) {
        System.out.println(new MinimizeSSS_209().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(new MinimizeSSS_209().minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(new MinimizeSSS_209().minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }

    //copied from discussion
    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j++];
            while (sum >= target) {
                min = Math.min(min, j - i);
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
