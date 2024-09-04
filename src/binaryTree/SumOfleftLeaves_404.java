package binaryTree;

public class SumOfleftLeaves_404 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
        System.out.println(new SumOfleftLeaves_404().sumOfLeftLeaves(node));
    }

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        sum(root, false);
        return sum;
    }

    public void sum(TreeNode node, boolean isLeft) {
        if (node == null)
            return;
        if (isLeft && node.left == null && node.right == null)
            sum += node.val;
        sum(node.left, true);
        sum(node.right, false);
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
