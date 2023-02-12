package arrays;

public class DiagonalTraverse_498 {

	public static void main(String[] args) {
		int[][] mat = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] res = new DiagonalTraverse_498().findDiagonalOrder(mat);
		System.out.println(res);
	}

	public int[] findDiagonalOrder(int[][] mat) {
		int m = mat.length, n = mat[0].length;
		int i = 0, j = 0, l = 0;
		boolean isUp = true, isMax = false;
		int[] res = new int[m * n];
		while (!isMax) {
			if (i == m - 1 && j == n - 1) {
				isMax = true;
			}
			res[l] = mat[i][j];
			l++;
			if (isUp) {
				if (i == 0) {
					isUp = false;
					if (j == n - 1)
						i++;
					else
						j++;
				} else if (j == n - 1) {
					isUp = false;
					i++;
				} else {
					i--;
					j++;
				}
			} else {
				if (i == m - 1) {
					isUp = true;
					j++;
				} else if (j == 0) {
					isUp = true;
					if (i == m - 1)
						j++;
					else
						i++;
				} else {
					j--;
					i++;
				}
			}
		}
		return res;
	}

}
