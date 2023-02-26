package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates_442 {

	public static void main(String[] args) {

	}

	public List<Integer> findDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<>();
		List<Integer> result = new ArrayList<>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (set.contains(nums[i]))
				result.add(nums[i]);
			else
				set.add(nums[i]);
		}
		return result;
	}

	// copied from discussion;faster
	public List<Integer> findDuplicates1(int[] nums) {

		int[] degree = new int[nums.length + 1];
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < degree.length; i++) {
			degree[i] = 0;
		}
		for (int i = 0; i < nums.length; i++) {
			degree[nums[i]] += 1;
			if (degree[nums[i]] == 2)
				ans.add(nums[i]);
		}
		return ans;

	}

}
