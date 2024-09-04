package linkedList;

public class OddEven_328 {

    public static void main(String[] args) {

    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode evenNodeFirst = head.next, oddNode = head, evenNode = head.next, lastOddNode = oddNode;
        while (oddNode != null && oddNode.next != null && evenNode != null && evenNode.next != null) {
            oddNode.next = oddNode.next.next;
            oddNode = oddNode.next;
            lastOddNode = oddNode;
            evenNode.next = evenNode.next.next;
            evenNode = evenNode.next;
        }
        lastOddNode.next = evenNodeFirst;
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
