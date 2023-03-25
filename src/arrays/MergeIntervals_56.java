package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_56 {

	public static void main(String[] args) {
		new MergeIntervals_56().merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 10, 15 }, { 16, 17 } });
	}

	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		int start = intervals[0][0];
		int end = intervals[0][1];
		List<int[]> res = new ArrayList<>();
		for (int[] a : intervals) {
			if (a[0] <= end) {
				end = Math.max(end, a[1]);
			} else {
				res.add(new int[] { start, end });
				start = a[0];
				end = a[1];
			}
		}
		res.add(new int[] { start, end });
		return res.toArray(new int[0][]);
	}

}
