package unknown;

import java.util.PriorityQueue;

public class SmallestNumberInInfiniteSet_2336 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	PriorityQueue<Integer> minHeap;
	int min;

	public SmallestNumberInInfiniteSet_2336() {
		minHeap = new PriorityQueue<>((a, b) -> a - b);
		min = 1;
	}

	public int popSmallest() {
		int res;
		if (!minHeap.isEmpty() && minHeap.peek() < min) {
			res = minHeap.poll();
		} else {
			min++;
			res = min - 1;
		}
		while (!minHeap.isEmpty() && minHeap.peek() == res)
			minHeap.poll();
		return res;
	}

	public void addBack(int num) {
		minHeap.add(num);
	}

}
