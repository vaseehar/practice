package linkedList;

import linkedList.DeleteNode_237.ListNode;

public class DeleteMiddleNode_2095 {

	public static void main(String[] args) {

	}

	public ListNode deleteMiddle(ListNode head) {
		if (head == null || head.next == null)
			return null;
		ListNode fast = head, slow = head, prevSlow = null;
		while (fast != null) {
			if (fast.next != null) {
				fast = fast.next.next;
				prevSlow = slow;
				slow = slow.next;
			} else {
				fast = fast.next;
			}
		}
		prevSlow.next = slow.next;
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
