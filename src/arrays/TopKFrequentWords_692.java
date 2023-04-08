package arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords_692 {

	public static void main(String[] args) {
		List<String> a = new TopKFrequentWords_692()
				.topKFrequent(new String[] { "i", "love", "leetcode", "i", "love", "coding" }, 2);
		List<String> b = new TopKFrequentWords_692().topKFrequent(
				new String[] { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" }, 4);
		System.out.println(a);
	}

	public List<String> topKFrequent(String[] words, int k) {
		int n = words.length;

		Map<String, Integer> countMap = new HashMap<>();
		for (String word : words) {
			countMap.put(word, countMap.getOrDefault(word, 0) + 1);
		}
		PriorityQueue<String> pq = new PriorityQueue<>(n,
				(w1, w2) -> countMap.get(w1).equals(countMap.get(w2)) ? w1.compareTo(w2)
						: countMap.get(w2) - countMap.get(w1));
		for (String a : countMap.keySet()) {
			pq.add(a);
		}
		List<String> res = new ArrayList<>();
		while (k-- > 0) {
			res.add(pq.poll());
		}

		return res;
	}

}
