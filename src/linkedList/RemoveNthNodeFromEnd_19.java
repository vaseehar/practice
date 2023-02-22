package linkedList;

public class RemoveNthNodeFromEnd_19 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		ListNode node = new RemoveNthNodeFromEnd_19().removeNthFromEnd(head, 2);
		System.out.println(node);
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return head;
		ListNode node = head;
		int size = 0;
		while (node != null) {
			node = node.next;
			size++;
		}
		if (size - n == 0) {
			return head.next;
		}
		int i = 1;
		node = head;
		while (i < size - n) {
			node = node.next;
			i++;
		}
		node.next = node.next.next;

		return head;
	}

	// copied from discussion , faster solution using fast and slow pointers
	public ListNode removeNthFromEnd1(ListNode head, int n) {
		ListNode fast = head, slow = head;
		for (int i = 0; i < n; i++)
			fast = fast.next;
		if (fast == null)
			return head.next;
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
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
