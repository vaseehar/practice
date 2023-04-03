package linkedList;

public class RemoveDuplicatesFromUnsorted_1836 {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next.next = new ListNode(4);
		new RemoveDuplicatesFromUnsorted_1836().deleteDuplicatesUnsorted(head);
	}

	public ListNode deleteDuplicatesUnsorted(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		int[] countArr = new int[100001];
		ListNode fast = head, slow = new ListNode(0);
		while (fast != null) {
			countArr[fast.val]++;
			fast = fast.next;
		}
		fast = head;
		slow.next = head;
		while (fast != null) {
			if (countArr[fast.val] > 1) {
				slow.next = fast.next;
				if (fast == head)
					head = slow.next;
				fast = fast.next;
			} else {
				fast = fast.next;
				slow = slow.next;
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
