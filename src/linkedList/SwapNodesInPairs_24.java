package linkedList;

import java.util.Stack;

public class SwapNodesInPairs_24 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode node = new SwapNodesInPairs_24().swapPairs(head);
        System.out.println(node.val);
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode node = head, lastNode = new ListNode();
        head = head.next;
        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            ListNode nextNode = node.next;
            if (stack.size() == 2) {
                lastNode.next = stack.peek();
                stack.pop().next = stack.peek();
                lastNode = stack.pop();
                lastNode.next = null;
            }
            node = nextNode;
        }
        if (!stack.isEmpty()) {
            lastNode.next = stack.pop();
            lastNode.next.next = null;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
