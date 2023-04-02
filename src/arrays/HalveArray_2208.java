package arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class HalveArray_2208 {

	public static void main(String[] args) {
		System.out.println(new HalveArray_2208().halveArray(new int[] { 32, 98, 23, 14, 67, 40, 26, 9, 96, 96, 91, 76,
				4, 40, 42, 2, 31, 13, 16, 37, 62, 2, 27, 25, 100, 94, 14, 3, 48, 56, 64, 59, 33, 10, 74, 47, 73, 72, 89,
				69, 15, 79, 22, 18, 53, 62, 20, 9, 76, 64 }));
	}

	public int halveArray(int[] nums) {
		double sum = 0, halfSum = 0;
		PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for (int num : nums) {
			maxHeap.add((double) num);
			sum += num;
		}
		halfSum = sum / 2;
		int count = 0;
		while (sum > halfSum) {
			double b = maxHeap.poll() / 2;
			maxHeap.add(b);
			sum -= b;
			count++;
		}
		return count;
	}
}
