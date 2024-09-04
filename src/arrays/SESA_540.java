package arrays;

public class SESA_540 {

    public static void main(String[] args) {
        System.out.println(new SESA_540().singleNonDuplicate(new int[]{1}));
        System.out.println(new SESA_540().singleNonDuplicate(new int[]{1, 1, 2, 3, 3}));
        System.out.println(new SESA_540().singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        System.out.println(new SESA_540().singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
    }

    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int i = 0, n = nums.length;
        while (i <= n / 2) {
            if (nums[i] != nums[i + 1])
                return nums[i];
            if (nums[n - 1 - i] != nums[n - 2 - i])
                return nums[n - 1 - i];
            i += 2;
        }
        return -1;
    }

}
