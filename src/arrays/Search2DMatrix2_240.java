package arrays;

import java.util.Arrays;

public class Search2DMatrix2_240 {

	public static void main(String[] args) {
		System.out.println(new Search2DMatrix2_240().searchMatrix(new int[][] { { 1, 4, 7, 11, 15 },
				{ 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } }, 20));
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length, n = matrix[0].length;
		int i = 0, j = 0;
		while (i < m && j < n) {

			if (matrix[i][n - 1] >= target) {
				int k = 0;
				while (k < n) {
					if (matrix[i][k] == target)
						return true;
					k++;
				}
			}
			if (matrix[m - 1][j] >= target) {
				int k = 0;
				while (k < m) {
					if (matrix[k][j] == target) {
						return true;
					}
					k++;
				}
			}
			i++;
			j++;
		}
		return false;
	}

	// faster
	public boolean searchMatrix1(int[][] matrix, int target) {
		for (int i = 0; i < matrix.length; i++)
			if (Arrays.binarySearch(matrix[i], target) > -1)
				return true;
		return false;
	}

	// faster
	public boolean searchMatrix2(int[][] matrix, int target) {
		if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
			return false;
		}
		int col = matrix[0].length - 1;
		int row = 0;
		while (col >= 0 && row <= matrix.length - 1) {
			if (target == matrix[row][col]) {
				return true;
			} else if (target < matrix[row][col]) {
				col--;
			} else if (target > matrix[row][col]) {
				row++;
			}
		}
		return false;
	}

}
