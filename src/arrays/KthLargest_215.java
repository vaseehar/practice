package arrays;

import java.util.Arrays;


public class KthLargest_215 {

	public static void main(String[] args) {

	}

	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
	
}
