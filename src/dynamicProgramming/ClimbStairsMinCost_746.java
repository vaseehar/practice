package dynamicProgramming;

public class ClimbStairsMinCost_746 {

    public static void main(String[] args) {
        System.out.println(
                new ClimbStairsMinCost_746().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        System.out.println(new ClimbStairsMinCost_746().minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println(new ClimbStairsMinCost_746().minCostClimbingStairs(new int[]{0, 1, 2, 2}));
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for (int i = 2; i < n; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[n - 1], cost[n - 2]);
    }

}
