package arrays;

import java.util.LinkedList;

public class SlidingWindowMaximum_239 {

	public static void main(String[] args) {
		new SlidingWindowMaximum_239().maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3);
	}

//	public int[] maxSlidingWindow(int[] nums, int k) {
//		int n = nums.length, i = 0, resCount = 0;
//		if (n <= 1) {
//			return nums;
//		}
//		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (a, b) -> b - a);
//		int[] res = new int[n - k + 1];
//		while (i < k) {
//			maxHeap.offer(nums[i]);
//			i++;
//		}
//		res[resCount++] = maxHeap.peek();
//		for (i = k; i < n; i++) {
//			maxHeap.remove(nums[i - k]);
//			maxHeap.add(nums[i]);
//			res[resCount++] = maxHeap.peek();
//		}
//		return res;
//	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		if (n == 0 || k == 0) {
			return new int[0];
		}
		int[] result = new int[n - k + 1];
		LinkedList<Integer> dq = new LinkedList<>();

		for (int i = 0; i < n; ++i) {
			while (dq.size() > 0 && dq.getFirst() <= i - k) {
				dq.removeFirst();
			}
			while (dq.size() > 0 && nums[dq.getLast()] < nums[i]) {
				dq.removeLast();
			}
			dq.offerLast(i);
			if (i >= k - 1) {
				result[i - k + 1] = nums[dq.getFirst()];
			}
		}
		return result;
	}

}
