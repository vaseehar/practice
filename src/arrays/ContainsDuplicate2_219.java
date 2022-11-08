package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/contains-duplicate-ii/
*/
public class ContainsDuplicate2_219 {

	public static void main(String[] args) {
		System.out.println(containsNearbyDuplicate(new int[] { 0, 1, 2, 3, 4, 5, 0 }, 5));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int n = nums.length;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (hm.containsKey(nums[i]) && (i - hm.get(nums[i]) <= k)) {
				return true;
			}
			hm.put(nums[i], i);
		}
		return false;
	}

}
