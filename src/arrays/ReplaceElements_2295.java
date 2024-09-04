package arrays;

import java.util.HashMap;

public class ReplaceElements_2295 {

    public static void main(String[] args) {

    }

    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length, m = operations.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < m; i++) {
            int j = map.get(operations[i][0]);
            nums[j] = operations[i][1];
            map.put(nums[j], j);
        }
        return nums;
    }

}
