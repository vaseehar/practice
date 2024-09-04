package arrays;

//Copied from leetcode discussion
public class SearchRange_34 {

    public static void main(String[] args) {

    }

    public static int[] searchRange(int[] nums, int x) {
        int[] result = new int[2];
        result[0] = searchFirst(nums, x);
        result[1] = searchLast(nums, x);
        return result;

    }

    public static int searchFirst(int[] nums, int x) {
        int ans = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == nums[mid]) {
                ans = mid;
                high = mid - 1;
            } else if (x > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int searchLast(int[] nums, int x) {
        int ans = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == nums[mid]) {
                ans = mid;
                low = mid + 1;
            } else if (x > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

}
