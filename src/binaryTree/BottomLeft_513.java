package binaryTree;

public class BottomLeft_513 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right = new TreeNode(2);
        System.out.println(new BottomLeft_513().findBottomLeftValue(node));
    }

    int level = 0, maxLevel = 0, bottomLeft;

    public int findBottomLeftValue(TreeNode root) {
        bottomLeft = root.val;
        traverse(root);
        return bottomLeft;
    }

    public void traverse(TreeNode node) {
        if (node == null)
            return;
        if (level > maxLevel)
            bottomLeft = node.val;
        maxLevel = Math.max(maxLevel, level);
        level++;
        traverse(node.left);
        traverse(node.right);
        level--;

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
