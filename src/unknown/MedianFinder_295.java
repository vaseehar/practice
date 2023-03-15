package unknown;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MedianFinder_295 {

	public static void main(String[] args) {
		MedianFinder_295 m = new MedianFinder_295();
		m.addNum(1);
		m.addNum(2);
		System.out.println(m.findMedian());
	}
//Slower
//	List<Integer> nums;
//
//	public MedianFinder_295() {
//		nums = new ArrayList<>();
//	}
//
//	public void addNum(int num) {
//		if (nums.size() == 0)
//			nums.add(0, num);
//		else {
//			int i = 0;
//			while (nums.get(i) <= num && i < nums.size() - 1)
//				i++;
//			if (nums.get(i) <= num)
//				nums.add(i + 1, num);
//			else
//				nums.add(i, num);
//		}
//	}
//
//	public double findMedian() {
//		if (nums.size() == 0)
//			return 0;
//		if (nums.size() % 2 == 0) {
//			return (double) (nums.get(nums.size() / 2) + nums.get(nums.size() / 2 - 1)) / 2;
//		}
//		return nums.get(nums.size() / 2);
//	}

	// Much faster Solution
	PriorityQueue<Integer> Fhalf = new PriorityQueue<>((a, b) -> b - a);
	PriorityQueue<Integer> Shalf = new PriorityQueue<>();

	public MedianFinder_295() {
	}

	public void addNum(int num) {
		if (Fhalf.isEmpty() || num <= Fhalf.peek()) {
			Fhalf.add(num);
		} else {
			Shalf.add(num);
		}

		if (Shalf.size() > Fhalf.size()) {
			Fhalf.add(Shalf.poll());
		} else if (Fhalf.size() > Shalf.size() + 1) {
			Shalf.add(Fhalf.poll());
		}
	}

	public double findMedian() {
		if (Fhalf.size() != Shalf.size()) {
			return Fhalf.peek();
		} else {
			return (double) ((double) Fhalf.peek() + (double) Shalf.peek()) / 2.0;
		}
	}

}
