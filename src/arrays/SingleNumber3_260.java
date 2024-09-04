package arrays;

import java.util.Arrays;

public class SingleNumber3_260 {

    public static void main(String[] args) {
        new SingleNumber3_260().singleNumber(new int[]{1, 2, 1, 3, 2, 5});
    }

    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] res = new int[2];
        int resIndex = 0;
        for (int i = 0; i < n; ) {
            if (i == n - 1 || nums[i] != nums[i + 1]) {
                res[resIndex] = nums[i];
                resIndex++;
                i++;
            } else {
                i += 2;
            }
        }
        return res;
    }

}
