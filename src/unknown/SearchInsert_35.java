package unknown;

public class SearchInsert_35 {

	public static void main(String[] args) {
		System.out.println(SearchInsert_35.searchInsert(new int[] { 1, 3, 5, 6 }, 4));
	}

	public static int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length - 1, mid = nums.length - 1;
		int index = 0;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (target < nums[mid]) {
				index = mid;
				high = mid - 1;
			} else if (target > nums[mid]) {
				index = mid + 1;
				low = mid + 1;
			} else {
				return mid;
			}
		}

		return index;
	}

}
