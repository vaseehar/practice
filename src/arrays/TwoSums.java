package arrays;

import java.util.Arrays;

/*https://leetcode.com/problems/two-sum/
*/
public class TwoSums {

	public static void main(String[] args) {

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] eles = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					eles[0] = i;
					eles[1] = j;
				}
			}
		}
		return eles;
	}

	public int[] twoSum1(int[] nums, int target) {
		Arrays.sort(nums);
		int i = 0, j = nums.length - 1;
		while (i < j) {
			if (nums[i] + nums[j] == target)
				return new int[] { i, j };
			else if (nums[i] + nums[j] > target)
				j--;
			else
				i++;
		}
		return null;
	}
}
