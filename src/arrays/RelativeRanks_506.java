package arrays;

import java.util.PriorityQueue;

public class RelativeRanks_506 {

	public static void main(String[] args) {
		new RelativeRanks_506().findRelativeRanks(new int[] { 5, 4, 3, 2, 1 });
		new RelativeRanks_506().findRelativeRanks(new int[] { 10, 3, 8, 9, 4 });
	}

	public String[] findRelativeRanks(int[] score) {
		int n = score.length;
		String[] res = new String[n];
		PriorityQueue<Integer> pq = new PriorityQueue<>(n, (a, b) -> score[b] - score[a]);
		for (int i = 0; i < n; i++) {
			pq.add(i);
		}
		int count = 3;
		while (!pq.isEmpty() && count > 0) {
			if (count == 3)
				res[pq.poll()] = "Gold Medal";
			else if (count == 2)
				res[pq.poll()] = "Silver Medal";
			else
				res[pq.poll()] = "Bronze Medal";
			count--;
		}
		int rank = 4;
		while (!pq.isEmpty()) {
			res[pq.poll()] = Integer.toString(rank);
			rank++;
		}
		return res;
	}

}
