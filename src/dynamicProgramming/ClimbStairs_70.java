package dynamicProgramming;

public class ClimbStairs_70 {

    public static void main(String[] args) {
        System.out.println(new ClimbStairs_70().climbStairs(7));
    }

    int[] fibArr;

    public int climbStairs(int n) {
        if (fibArr == null) {
            fibArr = new int[n + 1];
        }
        if (n <= 2)
            return n;
        else if (fibArr[n] != 0)
            return fibArr[n];
        else {
            fibArr[n] = climbStairs(n - 2) + climbStairs(n - 1);
            return fibArr[n];
        }
    }

}
