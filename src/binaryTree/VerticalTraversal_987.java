package binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalTraversal_987 {
	public Map<Integer, Map<Integer, List<Integer>>> map = new TreeMap();

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.right.right = new TreeNode(7);
		node.right.left = new TreeNode(6);
		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);
		System.out.println(new VerticalTraversal_987().verticalTraversal(node));
	}

	public List<List<Integer>> verticalTraversal(TreeNode root) {
		if (root == null)
			return null;
		List<List<Integer>> result = new ArrayList<>();
		doTraversal(root, result, 0, 0);
		for (Map.Entry<Integer, Map<Integer, List<Integer>>> entry : map.entrySet()) {
			List<Integer> columnList = new ArrayList<>();
			for (Map.Entry<Integer, List<Integer>> entry1 : entry.getValue().entrySet()) {
				Collections.sort(entry1.getValue());
				for (int a : entry1.getValue())
					columnList.add(a);
			}
			result.add(columnList);
		}
		return result;
	}

	public void doTraversal(TreeNode root, List<List<Integer>> result, int column, int row) {
		if (root == null)
			return;
		ArrayList<Integer> levelList = map.get(column) == null ? new ArrayList<>()
				: (map.get(column).get(row) == null ? new ArrayList<>()
						: (ArrayList<Integer>) map.get(column).get(row));

		levelList.add(root.val);
		TreeMap<Integer, List<Integer>> map1 = map.get(column) == null ? (new TreeMap<>())
				: (TreeMap<Integer, List<Integer>>) (map.get(column));
		map1.put(row, levelList);
		map.put(column, map1);

		column--;
		row++;
		doTraversal(root.left, result, column, row);
		column += 2;
		doTraversal(root.right, result, column, row);
		row--;
		column--;
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
