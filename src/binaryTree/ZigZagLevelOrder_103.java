package binaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class ZigZagLevelOrder_103 {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
        List<List<Integer>> result = zigzagLevelOrder(node);
        for (List<Integer> levels : result) {
            System.out.println(levels);
        }

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        stack.push(0);
        doZigzagLevelOrder(root, 0, map);
        List<List<Integer>> normalList = new ArrayList<>(map.values());
        int count = 0;
        List<List<Integer>> zigZagList = new ArrayList<>();
        for (List<Integer> list : normalList) {
            if (count % 2 == 1) {
                Collections.reverse(list);
            }
            zigZagList.add(list);
            count++;
        }
        return zigZagList;
    }

    public static void doZigzagLevelOrder(TreeNode root, int level, Map<Integer, List<Integer>> map) {
        if (root == null)
            return;
        List<Integer> levelList = map.get(stack.peek()) != null ? map.get(stack.peek()) : new ArrayList<>();
        levelList.add(root.val);
        map.put(stack.peek(), levelList);
        stack.push(stack.peek() + 1);

        doZigzagLevelOrder(root.left, level + 1, map);
        doZigzagLevelOrder(root.right, level + 1, map);
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
