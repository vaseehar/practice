package dynamicProgramming;

public class UniquePaths2_63 {

    public static void main(String[] args) {
        System.out.println(
                new UniquePaths2_63().uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println(new UniquePaths2_63().uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
        System.out.println(new UniquePaths2_63()
                .uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }

    int[][] obstacleGrid;
    int[][] grid;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        this.obstacleGrid = obstacleGrid;
        int m = obstacleGrid.length, n = 0;
        if (m != 0)
            n = obstacleGrid[0].length;
        grid = new int[m + 1][n + 1];
        return uniquePaths(m, n);
    }

    public int uniquePaths(int m, int n) {
        if (m == 1 && n == 1 && obstacleGrid[m - 1][n - 1] == 0)
            return 1;
        if (m == 0 || n == 0 || obstacleGrid[m - 1][n - 1] == 1)
            return 0;
        else if (grid[m][n] != 0) {
            return grid[m][n];
        } else {
            grid[m][n] = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
            return grid[m][n];
        }

    }

    //fatser , copied
    public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if (obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        } else {
            dp[m - 1][n - 1] = 1;
        }
        // filling last row
        for (int j = n - 2; j >= 0; j--) {
            if (obstacleGrid[m - 1][j] == 1 || dp[m - 1][j + 1] == 0) {
                dp[m - 1][j] = 0;
            } else {
                dp[m - 1][j] = 1;
            }
        }
        // flling the last column
        for (int i = m - 2; i >= 0; i--) {
            if (obstacleGrid[i][n - 1] == 1 || dp[i + 1][n - 1] == 0) {
                dp[i][n - 1] = 0;
            } else {
                dp[i][n - 1] = 1;
            }
        }
        // filling  the rest of teh matrix
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] += dp[i + 1][j] + dp[i][j + 1];
                }

            }
        }
        return dp[0][0];

    }

}
