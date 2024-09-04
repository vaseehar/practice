package linkedList;

public class PlusOne_369 {

    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        head.next = new ListNode(9);
        //head.next.next = new ListNode(9);
        System.out.println(new PlusOne_369().plusOne(head));
    }

    int carry = 0;

    public ListNode plusOne(ListNode head) {
        helper(head);
        if (carry != 0) {
            ListNode newHead = new ListNode(carry);
            newHead.next = head;
            return newHead;
        }
        return head;
    }

    public void helper(ListNode node) {
        if (node.next != null) {
            helper(node.next);
        }

        if (node.next == null) {
            int a = node.val;
            node.val = (a + 1) % 10;
            carry = (a + 1) / 10;
        } else {
            int a = node.val;
            node.val = (a + carry) % 10;
            carry = (a + carry) / 10;
        }
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
