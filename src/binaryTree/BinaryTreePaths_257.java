package binaryTree;

import java.util.ArrayList;
import java.util.List;

//copied from https://leetcode.com/tbekpro/
public class BinaryTreePaths_257 {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(4);
		node.left.right = new TreeNode(5);
		node.right = new TreeNode(2);
		//node.right.left = new TreeNode(3);

		System.out.println(binaryTreePaths(node));
	}

	public static List<String> binaryTreePaths(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		goDFS(root, list, result);
		StringBuilder sb = new StringBuilder();
		List<String> strings = new ArrayList<>();
		for (List<Integer> l : result) {
			for (int i = 0; i < l.size() - 1; i++) {
				sb.append(l.get(i)).append("->");
			}
			sb.append(l.get(l.size() - 1));
			strings.add(sb.toString());
			sb.setLength(0);
		}
		return strings;
	}

	private static void goDFS(TreeNode node, List<Integer> list, List<List<Integer>> result) {
		if (node == null)
			return;
		list.add(node.val);
		if (node.left == null && node.right == null) {
			result.add(new ArrayList<>(list));
		}
		goDFS(node.left, list, result);
		goDFS(node.right, list, result);
		list.remove(list.size() - 1);
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
