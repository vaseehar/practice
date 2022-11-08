package arrays;

import java.util.Arrays;

public class ContainsDuplicate_217 {

	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] { 1, 4, 5, 2, 2, 3 }));
	}

	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

}
