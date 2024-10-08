package arrays;

import java.util.Arrays;

public class MajorityElement_169 {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3}));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);

        return nums[(nums.length - 1) / 2];
    }

}
