package unknown;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] { 1, 3, 5, 6, 7, 8, 9 }, 4));
	}

	public static int binarySearch(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		int mid = low + (high - low) / 2;

		while (low <= high) {
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = low + (high - low) / 2;
		}

		return -1;
	}

}
