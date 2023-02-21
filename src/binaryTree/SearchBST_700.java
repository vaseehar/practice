package binaryTree;

public class SearchBST_700 {

	public static void main(String[] args) {

	}

	public TreeNode searchBST(TreeNode root, int val) {
		TreeNode node = root;
		while (node != null) {
			if (node.val == val)
				return node;
			else if (node.val > val)
				node = node.left;
			else
				node = node.right;

		}
		return null;
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
