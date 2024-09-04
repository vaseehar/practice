package binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LevelOrderTraversalBottom_107 {
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
        List<List<Integer>> result = levelOrderBottom(node);
        for (List<Integer> levels : result) {
            System.out.println(levels);
        }
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        stack.push(0);
        doLevelOrder(root, map, 0);
        List<List<Integer>> result = new ArrayList<>(map.values());
        Collections.reverse(result);
        return result;

    }

    public static void doLevelOrder(TreeNode node, Map<Integer, List<Integer>> map, int level) {
        if (node == null) {
            return;
        }
        ArrayList<Integer> intList = map.get(stack.peek()) == null ? new ArrayList<>()
                : (ArrayList<Integer>) map.get(stack.peek());
        intList.add(node.val);
        map.put(stack.peek(), intList);
        stack.push(stack.peek() + 1);
        doLevelOrder(node.left, map, stack.peek());
        doLevelOrder(node.right, map, stack.peek());
        stack.pop();

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
