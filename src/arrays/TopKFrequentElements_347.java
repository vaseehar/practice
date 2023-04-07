package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements_347 {

	public static void main(String[] args) {
		new TopKFrequentElements_347().topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2);
	}

	public int[] topKFrequent(int[] nums, int k) {
		int n = nums.length;
		if (n == 1)
			return nums;
		Map<Integer, Integer> freqMap = new HashMap<>();
		Arrays.sort(nums);
		for (int num : nums) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (freqMap.get(a) - freqMap.get(b)));
		for (int a : freqMap.keySet()) {
			pq.add(a);
			if (pq.size() > k)
				pq.poll();
		}
		int[] res = new int[k];
		while (k > 0) {
			res[k - 1] = pq.poll();
			k--;
		}
		return res;
	}
	//faster , copied
	public int[] topKFrequent1(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			// map.put(nums[i], map.getOrDefault(nums[i],0) + 1); // Frequent hashmap
			// aka the following if
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		} // O(n)

		PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			maxHeap.add(entry);

		} /// O(n)

		int[] topK = new int[k];
		for (int i = 0; i < k; i++) {
			topK[i] = maxHeap.remove().getKey();
		} // O(k)

		return topK;
	}

}
