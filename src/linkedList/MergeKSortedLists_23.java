package linkedList;

import java.util.PriorityQueue;

public class MergeKSortedLists_23 {

    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        int n = lists.length;
        for (int i = 0; i < n; i++) {
            ListNode node = lists[i];
            while (node != null) {
                ListNode nextNode = node.next;
                node.next = null;
                pq.add(node);
                node = nextNode;
            }
        }
        ListNode head = pq.poll(), node = head;
        while (!pq.isEmpty()) {
            node.next = pq.poll();
            node = node.next;
        }
        return head;
    }

    public class ListNode {
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
