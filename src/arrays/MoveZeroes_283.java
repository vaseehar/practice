package arrays;

public class MoveZeroes_283 {

	public static void main(String[] args) {
		new MoveZeroes_283().moveZeroes1(new int[] { 0, 1, 0, 3, 3, 0, 4 });
	}
	//faster than 8 %
	public void moveZeroes(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}
				nums[nums.length - 1] = 0;
				i--;
				n--;
			}
		}

	}
	//faster than 81%
	public void moveZeroes1(int[] nums) {
		int lastNonZeroIndex = -1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != 0) {
				lastNonZeroIndex = i;
			} else if (nums[i] == 0 && nums[i + 1] != 0) {
				nums[lastNonZeroIndex + 1] = nums[i + 1];
				nums[i + 1] = 0;
				lastNonZeroIndex++;
			}
		}

		
	}

}
