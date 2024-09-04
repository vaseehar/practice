package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class ValidBST_98 {
    static List<Integer> inOrderList = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);

        System.out.println(isValidBST(node));
    }

    //Works in local , but fails in leetcode.
	/*public static boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;
		inOrderTraversal(root);
		for (int i = 0; i < inOrderList.size() - 1; i++) {
			if (inOrderList.get(i) >= inOrderList.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void inOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		inOrderTraversal(root.left);
		inOrderList.add(root.val);
		inOrderTraversal(root.right);
	}*/

    //works ; copied from leetcode discussion
    public static boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValid(TreeNode root, long min, long max) {
        if (root == null)
            return true;
        if (root.val >= max || root.val <= min)
            return false;

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
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
