package arrays;

import java.util.Arrays;

public class Kdiff_532 {

    public static void main(String[] args) {
        System.out.println(new Kdiff_532().findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        System.out.println(new Kdiff_532().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
        System.out.println(new Kdiff_532().findPairs(new int[]{1, 3, 1, 5, 4}, 0));
        System.out.println(new Kdiff_532().findPairs(new int[]{1, 2, 3, 4, 4, 4, 5}, 1));
    }

    public int findPairs(int[] nums, int k) {
        int count = 0, n = nums.length, i = 0, j = 1;
        Arrays.sort(nums);
        while (i < n && j < n) {
            int diff = nums[j] - nums[i];
            if (diff == k) {
                count++;
                i++;
                j++;
            } else if (diff < k) {
                j++;
            } else {
                i++;
            }
            if (i == j)
                j++;
        }
        return count;
    }

}
