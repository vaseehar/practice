package dynamicProgramming;

public class UniquePaths_62 {

	public static void main(String[] args) {
		System.out.println(new UniquePaths_62().uniquePaths(3,3));
	}

	int[][] grid;

	public int uniquePaths(int m, int n) {
		if (grid == null)
			grid = new int[m + 1][n + 1];
		if (m == 1 && n == 1)
			return 1;
		if (m == 0 || n == 0)
			return 0;
		else if (grid[m][n] != 0) {
			return grid[m][n];
		} else {
			grid[m][n] = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
			return grid[m][n];
		}

	}

}
