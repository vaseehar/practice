package arrays;

/*https://leetcode.com/problems/search-insert-position/
*/
public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 5, 7, 8, 9 };
		//System.out.println(searchInsert(nums, 3));
		System.out.println(search(nums, 3));

	}

	public static int searchInsert(int[] nums, int target) {
		int lo = 0, hi = nums.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;

			if (target < nums[mid])
				hi = mid - 1;
			else if (target > nums[mid])
				lo = mid + 1;
			else
				return mid;
		}

		return lo;
	}

	public static int search(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length-1;
		int mid = -1;
		while (lo <= hi) {
			mid = (hi + lo) / 2;
			if (target < nums[mid])
				hi = mid+1;
			else if (target > nums[mid])
				lo = mid-1;
			else
				return mid;
		}
		return -1;
	}

}
