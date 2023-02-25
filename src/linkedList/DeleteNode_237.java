package linkedList;

import java.util.function.IntConsumer;

import linkedList.ReverseLinkedList_206.ListNode;

public class DeleteNode_237 {

	public static void main(String[] args) {

	}

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
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
