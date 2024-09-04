package arrays;

public class SUCS_581 {

    public static void main(String[] args) {
        System.out.println(new SUCS_581().findUnsortedSubarray(new int[]{1, 3, 2, 2, 2, 4, 8, 7}));
    }

    //copied from discussion
    public int findUnsortedSubarray(int[] nums) {
        int end = -2, max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < max) {
                end = i;
            }
        }

        int begin = -1, min = Integer.MAX_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            if (nums[i] > min) {
                begin = i;
            }
        }
        return end - begin + 1;
    }

}
