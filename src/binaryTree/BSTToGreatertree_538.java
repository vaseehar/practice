package binaryTree;

import java.util.Stack;

public class BSTToGreatertree_538 {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(6);
		node.left = new TreeNode(2);
		node.left.left = new TreeNode(0);
		node.left.right = new TreeNode(4);
		node.left.right.left = new TreeNode(3);
		node.left.right.right = new TreeNode(5);
		node.right = new TreeNode(8);
		node.right.left = new TreeNode(7);
		node.right.right = new TreeNode(9);
		node.right.right.right = new TreeNode(10);
		System.out.println(new BSTToGreatertree_538().convertBST(node).val);
	}

	int sum = 0;
	public TreeNode convertBST(TreeNode root) {
		traverse(root);
		return root;
	}

	public void traverse(TreeNode node) {
		if (node == null)
			return;
		traverse(node.right);
		node.val += sum;
		sum = node.val;
		traverse(node.left);
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
