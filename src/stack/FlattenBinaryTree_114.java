package stack;

import java.util.Stack;

public class FlattenBinaryTree_114 {

    public static void main(String[] args) {

    }

    Stack<TreeNode> stack = new Stack<>();

    public void flatten(TreeNode root) {
        if (root == null) return;
        pushToStack(root);
        TreeNode node;
        while (!stack.isEmpty()) {
            node = stack.pop();
            node.left = null;
            if (!stack.isEmpty())
                node.right = stack.peek();
        }
    }

    public void pushToStack(TreeNode node) {
        if (node == null)
            return;
        pushToStack(node.right);
        pushToStack(node.left);
        stack.push(node);

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
