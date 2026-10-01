package version0.stack;

import java.util.Stack;

public class BSTIterator_173 {

    Stack<TreeNode> stack = new Stack<>();
    TreeNode pointer;

    public BSTIterator_173(TreeNode root) {
        traverse(root);
        pointer = new TreeNode(stack.peek().val - 1);
    }

    public int next() {
        pointer = stack.pop();
        return pointer.val;
    }

    public boolean hasNext() {

        return !stack.isEmpty();
    }

    public void traverse(TreeNode node) {
        if (node == null)
            return;
        traverse(node.right);
        stack.push(node);
        traverse(node.left);
    }
    //Faster solution , coped from discussion
	/*Stack<TreeNode> version0.stack;
	public BSTIterator(TreeNode root) {
		version0.stack = new Stack<>();
		TreeNode node = root;
		updateStack(node);                                     
	}
	public int next() {
		TreeNode toRemove = version0.stack.pop();
		updateStack(toRemove.right);                             
		return toRemove.val;
	}
	public boolean hasNext() {
		return !version0.stack.isEmpty();
	}
	
	public void updateStack(TreeNode node){
		while(node != null){
			version0.stack.add(node);
			node = node.left;
		}
	}*/

    public static void main(String[] args) {

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
