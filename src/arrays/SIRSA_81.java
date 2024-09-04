package arrays;

public class SIRSA_81 {

    public static void main(String[] args) {

    }

    public boolean search(int[] nums, int target) {
        if (nums == null)
            return false;
        int n = nums.length, i;
        if (target <= nums[n - 1]) {
            if (target == nums[n - 1])
                return true;
            i = n - 1;
            while (i > 0 && target < nums[i]) {
                i--;
            }
            return nums[i] == target;
        } else {
            if (target == nums[0])
                return true;
            i = 0;
            while (i < n - 1 && target > nums[i])
                i++;
            return nums[i] == target;
        }
    }

}
