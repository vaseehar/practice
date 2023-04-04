package arrays;

import java.util.PriorityQueue;

public class MaxKElements_2530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public long maxKelements(int[] nums, int k) {
		if (nums.length == 0)
			return 0;
		long score = 0;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
		for (int num : nums) {
			maxHeap.offer(num);
		}
		while (k-- > 0) {
			int ele = maxHeap.poll();
			score += ele;
			maxHeap.offer((int) Math.ceil((ele + 2) / 3));
		}
		return score;
	}

}
