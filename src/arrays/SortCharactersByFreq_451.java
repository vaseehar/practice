package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFreq_451 {

	public static void main(String[] args) {
		System.out.println(new SortCharactersByFreq_451().frequencySort("tree"));
	}

	public String frequencySort(String s) {
		Map<Character, Integer> charMap = new HashMap<>();
		for (char c : s.toCharArray()) {
			charMap.put(c, charMap.getOrDefault(c, 0) + 1);
		}
		PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> (charMap.get(b) - charMap.get(a)));
		pq.addAll(charMap.keySet());
		StringBuffer res = new StringBuffer();
		while (!pq.isEmpty()) {
			char c = pq.poll();
			int count = charMap.get(c);
			while (count-- > 0) {
				res.append(c);
			}
		}
		return res.toString();
	}

}
