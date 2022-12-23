package unknown;

public class BinarySearch_704 {

	public static void main(String[] args) {
		System.out.println(new BinarySearch_704().search(new int[] { 1, 3, 4, 5, 7, 8, 9 }, 8));
	}

	public int search(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		int mid = low + (high - low) / 2;

		while (low <= high) {
			mid = low + (high - low) / 2;
			if (nums[mid] > target) {
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}
