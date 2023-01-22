package linkedList;

import java.util.ArrayList;
import java.util.List;

public class WinnerInCirculargame_1823 {

	public static void main(String[] args) {
		System.out.println(new WinnerInCirculargame_1823().findTheWinner(9, 2));
	}

	public int findTheWinner(int n, int k) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		int i = 0;
		while (list.size() > 1) {
			i = (i + k-1) % n;
			list.remove(i);
			n--;
		}
		return list.get(0);
	}

}
