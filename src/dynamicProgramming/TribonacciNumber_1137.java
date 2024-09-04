package dynamicProgramming;

import java.util.Arrays;

public class TribonacciNumber_1137 {

    public static void main(String[] args) {
        System.out.println(new TribonacciNumber_1137().tribonacci(25));
    }

    int[] trib;

    public int tribonacci(int n) {
        if (trib == null) {
            trib = new int[n + 1];
            Arrays.fill(trib, -1);
        }
        if (n == 0 || n == 1)
            return n;
        if (n == 2)
            return 1;
        if (trib[n] == -1) {
            trib[n] = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
        }
        return trib[n];
    }

}
