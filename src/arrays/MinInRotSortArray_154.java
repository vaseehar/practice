package arrays;

public class MinInRotSortArray_154 {

    public static void main(String[] args) {
        System.out.println(new MinInRotSortArray_154().findMin(new int[]{0, 1, 2, 3, 4, 5}));
        System.out.println(new MinInRotSortArray_154().findMin(new int[]{2, 3, 4, 5, 0, 1}));
        System.out.println(new MinInRotSortArray_154().findMin(new int[]{2, 1, 1, 1, 1}));
        System.out.println(new MinInRotSortArray_154().findMin(new int[]{1, 1, 2, 0, 1, 1}));
        System.out.println(new MinInRotSortArray_154().findMin(new int[]{5, 4, 3, 2, 1}));
    }

    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.min(nums[0], nums[1]);

        if (nums[0] < nums[n - 1])
            return nums[0];
        else {
            int i = n - 1;
            while (i >= 1 && nums[i] >= nums[i - 1]) {
                i--;
            }
            return nums[i];
        }
    }

}
