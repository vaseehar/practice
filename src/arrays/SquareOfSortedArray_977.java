package arrays;

import java.util.Arrays;

public class SquareOfSortedArray_977 {

    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        if (nums == null) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    //two pointers
    public int[] sortedSquares1(int[] nums) {
        int left = 0, right = nums.length - 1;
        int ans[] = new int[nums.length];
        int k = nums.length - 1;
        while (left <= right) {
            int max = (Math.abs(nums[left]) < Math.abs(nums[right]) ? nums[right] : nums[left]);
            if (max == nums[right])
                right--;
            else
                left++;
            ans[k] = max * max;
            k--;
        }
        return ans;
    }

}
