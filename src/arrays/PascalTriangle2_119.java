package arrays;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/pascals-triangle-ii/submissions/
*/
public class PascalTriangle2_119 {

	public static void main(String[] args) {

	}

	public static List<Integer> generate1(int rowIndex) {

		List<Integer> row = null, pre = null;
		for (int i = 0; i <= rowIndex; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
		}
		return row;

	}

}
