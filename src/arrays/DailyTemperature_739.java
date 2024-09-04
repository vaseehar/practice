package arrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DailyTemperature_739 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new DailyTemperature_739().dailyTemperatures1(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty())
                res[i] = stack.peek() - i;
            stack.push(i);
        }
        return res;
    }

    // faster , copied from discussion
    public int[] dailyTemperatures1(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int currDay = 0; currDay < n; currDay++) {
            int currentTemp = temperatures[currDay];
            // Pop until the current day's temperature is not
            // warmer than the temperature at the top of the stack
            while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
                int prevDay = stack.pop();
                answer[prevDay] = currDay - prevDay;
            }
            stack.push(currDay);
        }

        return answer;
    }

}
