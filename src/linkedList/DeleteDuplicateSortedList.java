package linkedList;

import linkedList.Merge2SortedLists.ListNode;

/*https://leetcode.com/problems/remove-duplicates-from-sorted-list/
*/
public class DeleteDuplicateSortedList {

	public static void main(String[] args) {
		ListNode n = new ListNode(1);
		n.next = new ListNode(1);
		n.next.next = new ListNode(1);
		ListNode removed = deleteDuplicates(n);
		System.out.println(removed.val);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head;
		while (temp != null && temp.next != null) {
			if (temp.val == temp.next.val) {
				if (null != temp.next.next) {
					temp.next = temp.next.next;
				} else {
					temp.next = null;
				}
			} else {
				temp = temp.next;
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
