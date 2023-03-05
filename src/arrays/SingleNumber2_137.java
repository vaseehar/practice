package arrays;

import java.util.Arrays;

public class SingleNumber2_137 {

	public static void main(String[] args) {

	}

	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		for (int i = 0; i < n - 2; i += 3) {
			if (nums[i] != nums[i + 2])
				return nums[i];
		}
		return nums[n - 1];
	}

}
