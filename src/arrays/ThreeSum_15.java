package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {

    public static void main(String[] args) {
        // System.out.println(new ThreeSum_15().threeSum(new int[] { -1, 0, 1, 2, -1, -4
        // }));
        // System.out.println(new ThreeSum_15().threeSum(new int[] { -2, 0, 0, 2, 2 }));
        System.out.println(new ThreeSum_15().threeSum(new int[]{0, 0, 0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i != 0 && nums[i] != nums[i - 1])) {
                int j = i + 1;
                int k = nums.length - 1;
                int pairSum = 0 - nums[i];
                while (j < k) {
                    if (nums[j] + nums[k] == pairSum) {
                        finalList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (nums[j] == nums[j + 1] && j < nums.length - 2)
                            j++;
                        while (nums[k] == nums[k - 1] && k > 1)
                            k--;
                        j++;
                        k--;
                    } else if (nums[j] + nums[k] > pairSum) {
                        k--;
                    } else {
                        j++;
                    }
                }

            }
        }
        return finalList;
    }

}
