package linkedList;

public class RemoveDuplicates2_82 {

	public static void main(String[] args) {
//		ListNode head = new ListNode(1);
//		head.next = new ListNode(1);
//		head.next.next = new ListNode(1);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		new RemoveDuplicates2_82().deleteDuplicates(head);
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode fast = head.next, slow = new ListNode(head.val - 1);
		slow.next = head;
		boolean isDuplicate = false;
		while (fast != null) {
			while (fast != null && slow.next.val == fast.val) {
				isDuplicate = true;
				fast = fast.next;
			}
			if (isDuplicate) {
				if (slow.next == head) {
					head = fast;
					if (fast != null)
						fast = fast.next;
					slow.next = head;
				} else {
					slow.next = fast;
					if (fast != null)
						fast = fast.next;
				}
				isDuplicate = false;
			} else {
				slow = slow.next;
				if (fast != null)
					fast = fast.next;
			}

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
