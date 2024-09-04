package arrays;

import java.util.PriorityQueue;

public class KClosestPoints_973 {

    public static void main(String[] args) {
        new KClosestPoints_973().kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
    }

    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        if (n <= k)
            return points;
        int[][] res = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>(n,
                (a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));
        for (int[] point : points) {
            pq.add(point);
        }
        while (k-- > 0) {
            res[k] = pq.poll();
        }
        return res;
    }

}
