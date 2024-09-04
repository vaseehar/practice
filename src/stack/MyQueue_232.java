package stack;

import java.util.Stack;

public class MyQueue_232 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue_232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);

    }

    public int pop() {
        if (stack1.empty())
            return -1;

        swapStack(stack1, stack2);
        int value = stack2.pop();
        swapStack(stack2, stack1);
        return value;

    }

    public int peek() {
        if (stack1.empty())
            return -1;

        swapStack(stack1, stack2);
        int value = stack2.peek();
        swapStack(stack2, stack1);
        return value;
    }

    public boolean empty() {
        return stack1.empty();
    }

    private void swapStack(Stack<Integer> stack1, Stack<Integer> stack2) {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
    }
}
