package arrays;

public class SearchRotatedSortedArray_33 {

	public static void main(String[] args) {
		System.out.println(new SearchRotatedSortedArray_33().search(new int[] { 1 }, 0));
	}

	public int search(int[] nums, int target) {
		if (nums[0] <= target) {
			int i = 0;
			while (i < nums.length - 1 && nums[i] < target) {
				i++;
			}
			if (nums[i] == target)
				return i;
			else
				return -1;
		} else if (nums[nums.length - 1] >= target) {
			int i = nums.length - 1;
			while (i > 0 && nums[i] > target) {
				i--;
			}
			if (nums[i] == target)
				return i;
			else
				return -1;
		} else {
			return -1;
		}
	}

}
