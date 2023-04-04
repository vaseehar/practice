package linkedList;

import java.util.PriorityQueue;

public class SortList_148 {

	public static void main(String[] args) {
		ListNode head = new ListNode(-1);
		head.next = new ListNode(5);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(0);
		// head.next.next.next.next.next = new ListNode(-10);
		new SortList_148().sortList1(head);
	}

	public ListNode sortList2(ListNode head) {
		if (head == null || head.next == null)
			return head;
		PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> (a.val - b.val));
		ListNode node = head;
		while (node != null) {
			ListNode insertNode = node;
			minHeap.add(insertNode);
			node = node.next;
			insertNode.next = null;
		}
		head = minHeap.poll();
		node = head;
		while (!minHeap.isEmpty()) {
			node.next = minHeap.poll();
			node = node.next;
		}
		return head;
	}
	//faster , merge sort . copied from solutions
	public ListNode sortList1(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode mid = getMid(head);
		ListNode left = sortList1(head);
		ListNode right = sortList1(mid);
		return merge(left, right);
	}

	ListNode merge(ListNode list1, ListNode list2) {
		ListNode dummyHead = new ListNode();
		ListNode tail = dummyHead;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				tail.next = list1;
				list1 = list1.next;
				tail = tail.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
				tail = tail.next;
			}
		}
		tail.next = (list1 != null) ? list1 : list2;
		return dummyHead.next;
	}

	ListNode getMid(ListNode head) {
		ListNode midPrev = null;
		while (head != null && head.next != null) {
			midPrev = (midPrev == null) ? head : midPrev.next;
			head = head.next.next;
		}
		ListNode mid = midPrev.next;
		midPrev.next = null;
		return mid;
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
