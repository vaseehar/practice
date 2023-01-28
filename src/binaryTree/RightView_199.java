package binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RightView_199 {

	int level;
	Map<Integer, Integer> levelvalues = new HashMap<>();

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(5);
		node.right = new TreeNode(2);
		node.right.left = new TreeNode(3);
		System.out.println(new RightView_199().rightSideView1(node));
	}

	public List<Integer> rightSideView(TreeNode root) {
		level = 0;
		rightView(root);
		List<Integer> rightView = new ArrayList<>();
		for (int val : levelvalues.values()) {
			rightView.add(val);
		}
		return rightView;
	}

	public void rightView(TreeNode node) {
		if (node == null) {
			return;
		}
		levelvalues.putIfAbsent(level, node.val);
		level++;
		rightView(node.right);
		rightView(node.left);
		level--;
	}
	
	//faster , copied from discussion
	 public List<Integer> rightSideView1(TreeNode root) {
	        List arr=new ArrayList<>();
	        util(arr,root,0);
	        return arr;
	    }
	    public void util(List<Integer> arr,TreeNode root,int level){
	        if(root==null) return;
	        if(arr.size()<=level){
	            arr.add(level,root.val);
	        }else{
	            arr.set(level,root.val);
	        }
	        util(arr,root.left,level+1);
	        util(arr,root.right,level+1);
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
