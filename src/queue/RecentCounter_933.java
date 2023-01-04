package queue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter_933 {

	Queue<Integer> queue;

	public RecentCounter_933() {
		queue = new LinkedList<>();
		//ArrayDeque took 51 ms and linkedList took 22ms to execute
		//queue = new ArrayDeque<>();
	}

	public int ping(int t) {
		queue.add(t);
		while (!queue.isEmpty() && t - queue.peek() > 3000) {
			queue.poll();
		}

		return queue.size();
	}

	public static void main(String[] args) {
		RecentCounter_933 recentCounter_933 = new RecentCounter_933();
		System.out.println(recentCounter_933.ping(1));
		System.out.println(recentCounter_933.ping(100));
		System.out.println(recentCounter_933.ping(3001));
		System.out.println(recentCounter_933.ping(3002));
	}

}
