package binaryTree;

import java.util.ArrayList;
import java.util.List;

import binaryTree.InOrderTraversal.TreeNode;

public class PreOrderTraversal_144 {
	static List<Integer> preOrder = new ArrayList<>();

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(5);
		node.right = new TreeNode(2);
		node.right.left = new TreeNode(3);
		System.out.println(preorderTraversal(node));
	}

	public static List<Integer> preorderTraversal(TreeNode root) {
		if (root == null) {
			return preOrder;
		}
		preOrder.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);

		return preOrder;
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
