package dynamicProgramming;

import java.util.Arrays;

public class PaintHouse_256 {

    public static void main(String[] args) {
//		System.out.println(new PaintHouse_256().minCost(new int[][] { { 17, 2, 17 }, { 16, 16, 5 }, { 14, 3, 19 } }));
//		System.out.println(new PaintHouse_256().minCost(new int[][] { { 7, 6, 2 } }));
        System.out.println(new PaintHouse_256().minCost(new int[][]{{8, 12, 18}, {14, 6, 8}, {10, 9, 13},
                {2, 17, 14}, {18, 18, 6}, {2, 1, 15}, {19, 20, 2}, {18, 15, 16}, {20, 18, 18},
                {15, 10, 10}, {2, 20, 18}, {14, 5, 15}, {18, 10, 12}, {9, 17, 19}, {9, 1, 6}, {4, 4, 10},
                {7, 8, 15}, {16, 17, 4}, {16, 16, 13}, {12, 7, 10}, {14, 13, 8}, {16, 6, 18}, {10, 5, 10},
                {3, 5, 11}, {9, 9, 6}, {10, 15, 19}, {4, 5, 19}, {12, 17, 17}}));
    }

    int k = 0;
    int[][] memo;

    public int minCost(int[][] costs) {
        k = costs.length;
        memo = new int[k][3];
        for (int a[] : memo) {
            Arrays.fill(a, -1);
        }
        return Math.min(Math.min(minOf(0, 0, costs), minOf(0, 1, costs)), minOf(0, 2, costs));
    }

    public int minOf(int m, int n, int[][] costs) {
        if (memo[m][n] != -1)
            return memo[m][n];
        if (m == k - 1) {
            memo[m][n] = costs[m][n];
            return memo[m][n];
        }
        if (n == 0) {
            memo[m][n] = costs[m][n] + Math.min(minOf(m + 1, 1, costs), minOf(m + 1, 2, costs));
            return memo[m][n];
        } else if (n == 1) {
            memo[m][n] = costs[m][n] + Math.min(minOf(m + 1, 0, costs), minOf(m + 1, 2, costs));
            return memo[m][n];
        } else {
            memo[m][n] = costs[m][n] + Math.min(minOf(m + 1, 1, costs), minOf(m + 1, 0, costs));
            return memo[m][n];
        }
    }

}
