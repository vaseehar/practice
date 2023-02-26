package arrays;

public class MaxWidthRamp_962 {

	public static void main(String[] args) {
		System.out.println(new MaxWidthRamp_962().maxWidthRamp1(new int[] { 6, 0, 8, 2, 1, 5 }));
		System.out.println(new MaxWidthRamp_962().maxWidthRamp1(new int[] { 9, 8, 1, 0, 1, 9, 4, 0, 4, 1 }));

	}

	public int maxWidthRamp(int[] nums) {
		int n = nums.length, ramp = 0;
		outer: for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[j] >= nums[i]) {
					ramp = Math.max(ramp, j - i);
					if (j == n - 1)
						break outer;
				}
			}
		}
		return ramp;
	}

	// copied from discussion , faster
	public int maxWidthRamp1(int[] nums) {
		int n = nums.length, res = 0, max = Integer.MIN_VALUE;
		int[] maxArr = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			max = Math.max(max, nums[i]);
			maxArr[i] = max;
		}
		int i = 0, j = 1;
		while (j < n) {
			if (nums[i] <= maxArr[j]) {
				res = Math.max(res, j - i);
				j++;
			} else {
				i++;
			}
		}
		return res;
	}

}
