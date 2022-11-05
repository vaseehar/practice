package arrays;

/*https://leetcode.com/problems/merge-sorted-array/
*/
public class MergeSortedAray {

	public static void main(String[] args) {
		int[] nums1 = { 3, 5, 0, 0, 0, 0, 0, 0, 0 };
		int[] nums2 = { 2, 4, 5, 6, 7, 8, 9 };
		int[] result = merge(nums1, 2, nums2, 7);
	}

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int m1 = m - 1;
		int transferred = 0;
		if (nums2.length != 0) {

			for (int i = 0; i <= m1 && transferred < n;) {
				if (nums1[i] < nums2[transferred]) {
					i++;
				} else {
					for (int j = m1; j >= i; j--) {
						nums1[j + 1] = nums1[j];
					}
					nums1[i] = nums2[transferred];
					transferred++;
					m1++;
					i++;

				}
			}
			for (int i = transferred; i < n; i++, m1++) {
				nums1[m1 + 1] = nums2[i];
			}
		}
		return nums1;
	}

}
