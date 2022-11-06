package arrays;

/*https://leetcode.com/problems/remove-element/
*/
public class RemoveElement_27 {

	public static void main(String[] args) {

	}

	public int removeElement(int[] nums, int val) {
		int k = nums.length;
		for (int i = 0; i < k; ) {
			if (nums[i] == val) {
				for (int j = i; j < k - 1; j++) {
					nums[j] = nums[j + 1];
				}
				k--;
			} else {
				i++;
			}
		}
		return k;
	}

}
