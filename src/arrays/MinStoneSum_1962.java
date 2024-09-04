package arrays;

import java.util.PriorityQueue;

public class MinStoneSum_1962 {

    public static void main(String[] args) {
        System.out.println(new MinStoneSum_1962().minStoneSum(new int[]{5, 4, 9}, 2));
        System.out.println(new MinStoneSum_1962().minStoneSum(new int[]{4, 3, 6, 7}, 3));
    }

    public int minStoneSum(int[] piles, int k) {
        int n = piles.length - 1;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(n + 1, (a, b) -> b - a);
        int res = 0;
        for (int a : piles) {
            maxHeap.add(a);
            res += a;
        }

        while (k-- > 0) {
            int b = maxHeap.poll();
            res -= (b / 2);
            maxHeap.add(b - b / 2);
        }

        return res;
    }

}
