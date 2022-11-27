package arrays;

import java.util.Arrays;

public class SingleNumber_136 {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] { 4, 1, 2, 1, 2 }));
	}

	public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		if (nums.length == 1) {
			return nums[0];
		}
		for (int i = 0; i < nums.length - 1; i = i + 2) {
			if (nums[i] != nums[i + 1]) {
				return nums[i];
			}
		}
		return nums[nums.length - 1];
	}

}
