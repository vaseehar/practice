package arrays;

import java.util.Arrays;

/*https://leetcode.com/problems/missing-number/
*/
public class MissingNumer_236 {

	public static void main(String[] args) {

	}

	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i != nums[i]) {
				return i;
			}
		}
		return nums.length;
	}
}
