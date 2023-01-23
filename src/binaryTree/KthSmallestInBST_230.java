package binaryTree;


public class KthSmallestInBST_230 {

	int count = 0;
	int a = 0;

	public static void main(String[] args) {

	}

	public int kthSmallest(TreeNode root, int k) {
		traverse(root, k);
		return a;
	}

	public void traverse(TreeNode node, int k) {
		if (node == null)
			return;

		traverse(node.left, k);
		count++;
		if (count == k) {
			a = node.val;
			return;
		}
		traverse(node.right, k);

	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
