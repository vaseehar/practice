package linkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReorderList_143 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		new ReorderList_143().reorderList(head);
	}

	public void reorderList(ListNode head) {
		Deque<ListNode> deque = new ArrayDeque<>();
		ListNode node = head;
		while (node != null) {
			ListNode temp = node.next;
			node.next = null;
			deque.add(node);
			node = temp;
		}
		int initSize = deque.size();
		node = deque.pollFirst();
		while (deque.size() > initSize / 2) {
			ListNode temp = deque.pollFirst();
			node.next = temp;
			node = temp;
		}
		node = head;
		while (!deque.isEmpty()) {
			ListNode temp = node.next;
			node.next = deque.pollLast();
			node.next.next = temp;
			node = temp;
		}

	}
	//copied from discussion , fatser
	public void reorderList1(ListNode head) {

		// Find the middle node
		ListNode slow = head, fast = head, prev = null;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// Reverse the 2nd Half of List, make it a separate list
		ListNode curr = slow.next;
		slow.next = null;
		while (curr != null) {
			ListNode nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}

		// Merging two Linked Lists
		ListNode curr1 = head;
		ListNode curr2 = prev;
		while (curr1 != null && curr2 != null) {
			ListNode next1 = curr1.next;
			ListNode next2 = curr2.next;

			curr1.next = curr2;
			curr2.next = next1;

			curr1 = next1;
			curr2 = next2;
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
