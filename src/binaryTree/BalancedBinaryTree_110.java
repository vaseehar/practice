package binaryTree;

/*https://leetcode.com/problems/balanced-binary-tree/
*/
public class BalancedBinaryTree_110 {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(2);
		a.left.left = new TreeNode(4);
		a.left.left.left = new TreeNode(5);
		a.right = new TreeNode(3);a.right.right = new TreeNode(6);
		System.out.println(isBalanced(a));
	}

	public  static boolean isBalanced(TreeNode root) {
        if (root == null)  return true;
		if (Height(root) == -1)  return false;
		return true;
	}

	public static int Height(TreeNode root) {
		if (root == null)  return 0;
		int leftHeight = Height(root.left);
		int rightHight = Height(root.right);
		if (leftHeight == -1 || rightHight == -1)  return -1;
        if (Math.abs(leftHeight - rightHight) > 1)  return -1;
		return Math.max(leftHeight, rightHight) + 1;
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
