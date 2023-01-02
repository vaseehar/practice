package stack;

import java.util.Objects;
import java.util.Stack;

public class MinStack_155 {

	Stack<Integer> stack = new Stack<>();
	Stack<Integer> Minstack = new Stack<>();

	public void push(int val) {
		if (!Minstack.isEmpty() && val <= Minstack.peek()) {
			Minstack.push(val);
		} else if (Minstack.isEmpty()) {
			Minstack.push(val);
		}
		stack.push(val);
	}

	public void pop() {
		if (Objects.equals(stack.peek(), Minstack.peek())) {
			Minstack.pop();
		}
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return Minstack.peek();
	}

	public static void main(String[] args) {

		MinStack_155 minStack_155 = new MinStack_155();
		minStack_155.push(1);
		minStack_155.push(2);
		minStack_155.push(3);
		minStack_155.push(-3);
		minStack_155.push(-2);
		minStack_155.push(-1);
		System.out.println(minStack_155.getMin());
		minStack_155.pop();
		System.out.println(minStack_155.getMin());
		minStack_155.pop();
		System.out.println(minStack_155.getMin());
		minStack_155.pop();
		System.out.println(minStack_155.getMin());

	}

}
