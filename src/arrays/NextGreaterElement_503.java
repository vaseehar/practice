package arrays;

import java.util.Stack;

public class NextGreaterElement_503 {

    public static void main(String[] args) {
        new NextGreaterElement_503().nextGreaterElements1(new int[]{18, 17, 16, 6, 7, 9});
        // new NextGreaterElement_503().nextGreaterElements1(new int[] { 1, 2, 1 });
        // new NextGreaterElement_503().nextGreaterElements1(new int[] { 3, 4, 2, 1, 0
        // });
    }

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return new int[]{-1};
        int[] nonInc = new int[n], res = new int[n];
        nonInc[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nonInc[i + 1])
                nonInc[i] = nums[i];
            else
                nonInc[i] = nonInc[i + 1];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] < nonInc[i]) {
                int j = i + 1;
                while (nums[j] <= nums[i]) {
                    j++;
                }
                res[i] = nums[j];
            } else {
                if (nonInc[0] > nums[i])
                    res[i] = nonInc[0];
                else
                    res[i] = -1;
            }
        }
        return res;
    }

    //copied from discussion , faster
    public int[] nextGreaterElements1(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            stack.push(nums[i]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int number = nums[i];
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            nums[i] = stack.empty() ? -1 : stack.peek();
            stack.push(number);
        }

        return nums;
    }

    //faster , copied from discussion
    public int[] nextGreaterElements2(int[] nums) {
        Stack<Integer> stack = new Stack();
        int[] res = new int[nums.length];
        int n = nums.length;

        for (int i = 2 * n - 1; i >= 0; i--) {
            int num = nums[i % n];
            while (!stack.isEmpty() && stack.peek() <= num)
                stack.pop();
            if (!stack.isEmpty())
                res[i % n] = stack.peek();
            else
                res[i % n] = -1;
            stack.push(num);
        }

        return res;
    }

}
