package arrays;

import java.util.Arrays;

public class SortTransformedArray_360 {

	public static void main(String[] args) {
		int[] a = new SortTransformedArray_360().sortTransformedArray(new int[] { -4, -2, 2, 4 }, -1, 3, 5);
		System.out.println("a");
	}

	public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int x = nums[i];
			nums[i] = a * x * x + b * x + c;
		}
		Arrays.sort(nums);
		return nums;
	}

}
