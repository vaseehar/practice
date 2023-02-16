package arrays;

import java.util.Arrays;

public class FirstMissingpositive_41 {

	public static void main(String[] args) {
		System.out.println(new FirstMissingpositive_41().firstMissingPositive(new int[] { 1, 2, 0 }));
		System.out.println(new FirstMissingpositive_41().firstMissingPositive(new int[] { 3, 4, -1, 1 }));
		System.out.println(new FirstMissingpositive_41().firstMissingPositive(new int[] { 7, 8, 9, 11, 12 }));
		System.out.println(new FirstMissingpositive_41().firstMissingPositive(new int[] { 0 }));
		System.out.println(new FirstMissingpositive_41().firstMissingPositive(new int[] { -5 }));
	}

	public int firstMissingPositive(int[] nums) {
		Arrays.sort(nums);
		int i = 0, n = nums.length;
		while (i < n && nums[i] <= 0) {
			i++;
		}
		int j = i;
		if (j < n && nums[j] > 1)
			return 1;
		else {
			while (j < n - 1) {
				if (nums[j + 1] - nums[j] > 1)
					return nums[j] + 1;
				j++;
			}
		}
		return nums[nums.length - 1] + 1 > 0 ? nums[nums.length - 1] + 1 : 1;
	}

}
