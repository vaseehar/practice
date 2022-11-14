package binaryTree;

import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/binary-tree-postorder-traversal/
*/
public class PostOrder_145 {

	static List<Integer> postOrder = new ArrayList<>();

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.right = new TreeNode(2);
		node.right.left = new TreeNode(3);
		postorderTraversal(node);
		System.out.println(postOrder);
	}

	public static List<Integer> postorderTraversal(TreeNode root) {
		if (root == null) {
			return postOrder;
		}
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		postOrder.add(root.val);
		return postOrder;
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
