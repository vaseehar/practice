package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ThirdMaximum_414 {

	public static void main(String[] args) {
		System.out.println(new ThirdMaximum_414().thirdMax(new int[] { 2, 2, 3, 1 }));
		System.out.println(new ThirdMaximum_414().thirdMax(new int[] { 1, 2, 3 }));
		System.out.println(new ThirdMaximum_414().thirdMax(new int[] { 2, 2, 1 }));

	}

	public int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int count = 1, i = nums.length - 2;
		while (count < 3 && i >= 0) {
			if (nums[i] != nums[i + 1])
				count++;
			i--;
		}
		if (count < 3 || nums.length < 3) {
			return nums[nums.length - 1];
		}
		return nums[i + 1];
	}

}
