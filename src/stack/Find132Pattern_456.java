package stack;

import java.util.Stack;

public class Find132Pattern_456 {

    public static void main(String[] args) {
        boolean a = new Find132Pattern_456().find132pattern(new int[]{1, 3, 5, 4});
        System.out.println(a);
    }

    //copied from ragav
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int secondMax = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < secondMax)
                return true;
            while (!stack.empty() && stack.peek() < nums[i]) {
                secondMax = stack.peek();
                stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

}
