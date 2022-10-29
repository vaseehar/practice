package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import binaryTree.InOrderTraversal.TreeNode;

/*https://leetcode.com/problems/binary-tree-inorder-traversal/
*/
public class InOrderTraversalIterative {

	public static void main(String[] args) {

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> inorder = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		while (root != null || stack.size() > 0) {

			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			inorder.add(root.val);
			root = root.right;
		}
		return inorder;
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
