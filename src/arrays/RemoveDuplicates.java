package arrays;

/*https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int k = nums.length;
        for (int i = 1; i < k; ) {
            if (nums[i] == nums[i - 1]) {
                k--;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }

            } else {
                i++;
            }
        }
        return k;
    }
}
