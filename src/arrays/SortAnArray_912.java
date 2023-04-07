package arrays;

import java.util.PriorityQueue;

public class SortAnArray_912 {

	public static void main(String[] args) {

	}

	public int[] sortArray(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int a : nums) {
			pq.offer(a);
		}
		int i = 0;
		while (!pq.isEmpty()) {
			nums[i++] = pq.poll();
		}
		return nums;
	}

}
