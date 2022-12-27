package arrays;

public class RotateArray_189 {

	public static void main(String[] args) {
		new RotateArray_189().rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
	}

	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		int[] temp = new int[k];
		for (int i = nums.length - k; i < nums.length; i++) {
			temp[i - (nums.length - k)] = nums[i];
		}
		for (int i = nums.length - k - 1; i >= 0; i--) {
			nums[i + k] = nums[i];
		}

		for (int i = 0; i < temp.length; i++) {
			nums[i] = temp[i];
		}
	}

}
