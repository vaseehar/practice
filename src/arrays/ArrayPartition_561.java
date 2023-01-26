package arrays;

import java.util.Arrays;

public class ArrayPartition_561 {

	public static void main(String[] args) {
		System.out.println(new ArrayPartition_561().arrayPairSum(new int[] { 6, 2, 6, 5, 1, 2 }));
	}

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length - 1; i += 2) {
			sum += nums[i];
		}
		return sum;
	}

}
