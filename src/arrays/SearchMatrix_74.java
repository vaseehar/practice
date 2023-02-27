package arrays;

public class SearchMatrix_74 {

	public static void main(String[] args) {
		System.out.println(new SearchMatrix_74().searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 40 } }, 10));
		System.out.println(new SearchMatrix_74().searchMatrix(new int[][] { { 1, 3, 5 }, { 10, 11, 16 }, { 23, 30, 34 } }, 34));
		System.out.println(new SearchMatrix_74().searchMatrix(new int[][] { { 1, 3 } }, 3));
		System.out.println(new SearchMatrix_74().searchMatrix(new int[][] { { 1 }, { 3 } }, 3));
		System.out.println(new SearchMatrix_74().searchMatrix(new int[][] { { 1 } }, 0));
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length, n = matrix[0].length, size = m * n, low = 0, high = size, mid = (low + high) / 2;
		int q = mid / n, r = mid % n;
		while (low <= high) {
			mid = (low + high) / 2;
			q = mid / n;
			r = mid % n;
			int i, j;
			if (q > 0) {
				if (r == 0) {
					i = q - 1;
					j = n - 1;
				} else {
					i = q;
					j = r - 1;
				}
			} else {
				i = q;
				if (r > 0)
					j = r - 1;
				else
					j = r;
			}
			if (matrix[i][j] > target) {
				high = mid - 1;
			} else if (matrix[i][j] < target) {
				low = mid + 1;
			} else {
				return true;
			}
		}
		return false;
	}
	
	//same time and space but simpler code
	//checking every rows greatest element 
	 public boolean searchMatrix1(int[][] matrix, int target) {
	        int i = 0, j = matrix[0].length - 1;
	        while (i < matrix.length && j >= 0) {
	            if (matrix[i][j] == target) return true; else if (
	                matrix[i][j] > target
	            ) j--; else i++;
	        }
	        return false;
	    }

}
