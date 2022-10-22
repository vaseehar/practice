package arrays;

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
}
