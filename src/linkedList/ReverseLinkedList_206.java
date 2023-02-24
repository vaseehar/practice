package linkedList;

import java.util.Stack;

public class ReverseLinkedList_206 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode node = new ReverseLinkedList_206().reverseList1(head);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public ListNode reverseList(ListNode head) {
		ListNode node = head;
		Stack<ListNode> stack = new Stack<>();
		while (node != null) {
			stack.push(node);
			node = node.next;
		}
		if (!stack.isEmpty())
			head = stack.peek();
		while (!stack.isEmpty()) {
			if (!stack.isEmpty())
				stack.pop().next = stack.peek();
			else
				stack.pop().next = null;
		}
		return head;
	}
	//faster , simpler ;copied from discussion
	public ListNode reverseList1(ListNode head) 
    {
        if( head == null || head.next == null )        
        {
            return head ;
        }
        ListNode nextNode = head.next ;
        ListNode newHead = reverseList1(nextNode) ;
        nextNode.next = head ;
        head.next = null ;
        return newHead ;
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
