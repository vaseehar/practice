package binaryTree;

import binaryTree.InOrderTraversal.TreeNode;

/*https://leetcode.com/problems/path-sum/
*/
public class HasPathSum_112 {

	public static void main(String[] args) {

	}

	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;
		targetSum = targetSum - root.val;
		if (root.left == null && root.right == null) {
			if (targetSum == 0)
				return true;
			else
				return false;
		}

		return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
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
