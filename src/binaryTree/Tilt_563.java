package binaryTree;

public class Tilt_563 {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		System.out.println(new Tilt_563().findTilt(node));
	}

	public int ans = 0;
	//copied from discussion
	public int findTilt(TreeNode root) {
		tilt(root);
		return ans;
	}

	public int tilt(TreeNode node) {
		if (node == null)
			return 0;
		int l = tilt(node.left);
		int r = tilt(node.right);

		ans += Math.abs(l - r);
		return l + r + node.val;
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
