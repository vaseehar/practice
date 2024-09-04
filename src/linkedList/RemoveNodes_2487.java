package linkedList;

import java.util.Stack;

public class RemoveNodes_2487 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(1);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(2);
        head2.next.next.next.next = new ListNode(1);

        ListNode node = new RemoveNodes_2487().removeNodes(head);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = new ListNode(Integer.MAX_VALUE);
        temp.next = head;
        stack.push(temp);
        ListNode node = head;
        while (node != null) {
            if (node.val <= stack.peek().val)
                stack.push(node);
            else {
                while (stack.peek().val < node.val) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    stack.push(node);
                else {

                    stack.peek().next = node;
                    stack.push(node);
                }

            }
            node = node.next;
        }
        return temp.next;
    }

    //faster , copied from discussion
    public ListNode removeNodes1(ListNode head) {
        if (head == null) return null;
        head.next = removeNodes(head.next);
        return head.next != null && head.val < head.next.val ? head.next : head;
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
