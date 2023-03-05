package linkedList;

public class RotateList_61 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		new RotateList_61().rotateRight(head, 4);
	}

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null)
			return head;
		ListNode node = head, newHead = head, lastNode = null;
		int count = 0;
		while (node != null) {
			node = node.next;
			count++;
			if (count > k) {
				lastNode = newHead;
				newHead = newHead.next;
			}
		}
		if (k % count == 0)
			return head;
		if (k > count) {
			k = count - k % count;
			newHead = head;
			while (k > 0) {
				lastNode = newHead;
				newHead = newHead.next;
				k--;
			}
		}
		node = newHead;
		while (node.next != null) {
			node = node.next;
		}
		node.next = head;
		head = newHead;
		lastNode.next = null;
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
