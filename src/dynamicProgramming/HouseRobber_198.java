package dynamicProgramming;

public class HouseRobber_198 {

    public static void main(String[] args) {
        System.out.println(new HouseRobber_198().rob(new int[]{1, 2, 3, 1}));
        System.out.println(new HouseRobber_198().rob(new int[]{2, 7, 9, 3, 1, 7}));
    }

    int max[];

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);
        max = new int[n];
        max[n - 1] = nums[n - 1];
        max[n - 2] = Math.max(nums[n - 1], nums[n - 2]);
        for (int i = n - 3; i >= 0; i--) {
            if (max[i + 1] > max[i + 2] + nums[i]) {
                max[i] = max[i + 1];
            } else {
                max[i] = nums[i] + max[i + 2];
            }
        }
        return max[0];
    }

}
