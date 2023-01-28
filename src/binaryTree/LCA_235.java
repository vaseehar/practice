package binaryTree;

import java.util.Stack;

public class LCA_235 {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.left.left = new TreeNode(3);
		node.left.right = new TreeNode(4);
		node.right = new TreeNode(5);
		node.right.left = new TreeNode(6);
		node.right.right = new TreeNode(7);
		System.out.println(new LCA_235().lowestCommonAncestor(node, node.right.right, node.right).val);
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		Stack<TreeNode> stackP = new Stack<>();
		Stack<TreeNode> stackQ = new Stack<>();
		TreeNode node = root;
		int pVal = p.val, qVal = q.val;
		while (node != p) {
			stackP.push(node);
			if (node.val > pVal)
				node = node.left;
			else
				node = node.right;
		}
		stackP.push(node);
		node = root;
		while (node != q) {
			stackQ.push(node);
			if (node.val > qVal)
				node = node.left;
			else
				node = node.right;
		}
		stackQ.push(node);
		int diff = Math.abs(stackP.size() - stackQ.size());
		if (stackP.size() > stackQ.size()) {
			for (int i = 0; i < diff; i++) {
				stackP.pop();
			}
		} else {
			for (int i = 0; i < diff; i++) {
				stackQ.pop();
			}
		}
		while (stackP.peek() != stackQ.peek()) {
			stackP.pop();
			stackQ.pop();
		}
		return stackP.peek();
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
