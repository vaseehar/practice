package binaryTree;


/*https://leetcode.com/problems/symmetric-tree/
*/
public class SymmetricTree {

	public static void main(String[] args) {
		
	}

	public boolean isSymmetric(TreeNode root) {
		return root == null || isMirror(root.left, root.right);

	}

	boolean isMirror(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;

		if (left == null || right == null)
			return false;

		if (left.val != right.val)
			return false;
		return isMirror(left.left, right.right) && isMirror(left.right, right.left);
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
