package arrays;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/pascals-triangle/
*/
public class PascalTriangle_118 {

	public static void main(String[] args) {
		generate(2);
	}

	// mine ; very slow
	public static List<List<Integer>> generate(int numRows) {
		List outerList = new ArrayList<List<Integer>>();
		List innerList = new ArrayList<Integer>();
		if (numRows >= 1) {
			innerList.add(0, 1);
			outerList.add(innerList);
		}
		if (numRows >= 2) {
			innerList = new ArrayList<Integer>();
			innerList.add(0, 1);
			innerList.add(1, 1);
			outerList.add(innerList);
		}
		if (numRows >= 3) {
			for (int i = 2; i < numRows; i++) {
				innerList = new ArrayList<Integer>();
				innerList.add(0, 1);
				for (int j = 1; j < i; j++) {
					innerList.add(j, ((List<Integer>) outerList.get(i - 1)).get(j - 1)
							+ ((List<Integer>) outerList.get(i - 1)).get(j));
				}
				innerList.add(i, 1);
				outerList.add(innerList);
			}
		}
		return outerList;
	}

	// not mine ; faster than mine
	public List<List<Integer>> generate1(int numRows) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
			res.add(row);
		}
		return res;

	}

}
