package binaryTree;

public class UniqueBST_96 {
	// copied from leetcode submissions
	// number of ways a binary search tree can be represented is calculated by the
	// nth catalan number where n is the number of nodes.
	public static void main(String[] args) {
		System.out.println(numTrees(4));
	}

	public static int numTrees(int n) {
		int catalan[] = new int[n + 2];

		catalan[0] = 1;
		catalan[1] = 1;
		for (int i = 2; i <= n; i++) {
			catalan[i] = 0;
			for (int j = 0; j < i; j++) {
				catalan[i] += catalan[j] * catalan[i - j - 1];
			}
		}
		return catalan[n];
	}

}
