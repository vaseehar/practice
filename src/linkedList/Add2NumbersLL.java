package linkedList;

import linkedList.DeleteDuplicateSortedList_83.ListNode;

/*https://leetcode.com/problems/add-two-numbers/
*/
public class Add2NumbersLL {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(9);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode l3 = addTwoNumbers(l1, l2);
		System.out.println(l3.val);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carryOver = 0;
		ListNode l3 = new ListNode();
		int sumValue = 0;
		ListNode tempNode = l3;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				sumValue = l2.val + carryOver;
				l2 = l2.next;
			} else if (l2 == null) {
				sumValue = l1.val + carryOver;
				l1 = l1.next;
			} else {
				sumValue = l1.val + l2.val + carryOver;
				l1 = l1.next;
				l2 = l2.next;
			}
			tempNode.val = sumValue % 10;
			carryOver = sumValue / 10;
			if (l1 != null || l2 != null || carryOver == 1) {
				tempNode.next = new ListNode();
				tempNode = tempNode.next;
			}
		}
		if (carryOver == 1) {
			tempNode.val += 1;
		}
		return l3;
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
