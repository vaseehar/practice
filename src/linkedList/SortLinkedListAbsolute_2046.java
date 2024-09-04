package linkedList;

import java.util.Stack;

public class SortLinkedListAbsolute_2046 {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(2);
        head.next.next = new ListNode(-5);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = new ListNode(-10);

//		head.next = new ListNode(1);
//		head.next.next = new ListNode(2);
        new SortLinkedListAbsolute_2046().sortLinkedList(head);
    }

    public ListNode sortLinkedList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = head, node = head.next;
        while (node != null) {
            if (node.val < 0) {
                ListNode newHead = node;
                dummy.next = node.next;
                node = node.next;
                newHead.next = head;
                head = newHead;
            } else {
                node = node.next;
                dummy = dummy.next;
            }
        }
        return head;
    }

    // slower
    public ListNode sortLinkedListUsingStack(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(), node = head;
        dummy.next = head;
        Stack<ListNode> stack = new Stack<>();
        int size = 0;
        while (node != null) {
            size++;
            if (node.val < 0) {
                if (head == node)
                    head = node.next;
                stack.push(node);
                node = node.next;
                dummy.next = node;
                stack.peek().next = null;
            } else {
                node = node.next;
                dummy = dummy.next;
            }
        }
        if (!stack.isEmpty()) {
            boolean link = true;
            if (size == stack.size())
                link = false;
            ListNode newHead = stack.pop(), newNode = newHead;
            while (!stack.isEmpty()) {
                newNode.next = stack.pop();
                newNode = newNode.next;
            }
            if (link)
                newNode.next = head;
            head = newHead;
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
