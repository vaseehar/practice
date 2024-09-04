package arrays;

public class MIRSA_153 {

    public static void main(String[] args) {
        System.out.println(new MIRSA_153().findMin(new int[]{7, 8, 9, 10, 1, 2, 3}));
        System.out.println(new MIRSA_153().findMin(new int[]{3, 4, 5, 1, 2, 2}));
        System.out.println(new MIRSA_153().findMin(new int[]{2, 3, 1, 1, 1, 1}));
        System.out.println(new MIRSA_153().findMin(new int[]{2, 3, 4, 5, 6, 7, -1}));
        System.out.println(new MIRSA_153().findMin(new int[]{2, -1}));
        System.out.println(new MIRSA_153().findMin(new int[]{3, 1, 2}));
    }

    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1 || nums[0] < nums[n - 1])
            return nums[0];
        if (n == 2)
            return Math.min(nums[0], nums[1]);
        int low = 0, high = n - 1, mid = (high + low) / 2;
        while (low < mid) {
            if (nums[mid] > nums[high])
                low = mid + 1;
            else if (nums[mid] <= nums[high])
                high = mid;
            mid = (high + low) / 2;
        }
        return nums[mid] < nums[high] ? nums[mid] : nums[high];
    }

}
