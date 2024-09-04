package arrays;

import java.util.PriorityQueue;

public class PickGifts_2558 {

    public static void main(String[] args) {
        System.out.println(new PickGifts_2558().pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
    }

    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(n, (a, b) -> b - a);
        for (int count : gifts) {
            maxheap.add(count);
        }
        while (k-- > 0) {
            maxheap.add((int) Math.floor(Math.sqrt(maxheap.poll())));
        }
        long res = 0;
        while (maxheap.size() > 0) {
            res += maxheap.poll();
        }
        return res;
    }

}
