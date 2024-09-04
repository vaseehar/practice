package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SandwichStudents_1700 {

    public static void main(String[] args) {
        System.out.println(new SandwichStudents_1700().countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1}));
    }

    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> sQ = new LinkedList<>();
        Stack<Integer> sS = new Stack<>();
        for (int i = 0; i < students.length; i++) {
            sQ.add(students[i]);
            sS.push(sandwiches[students.length - 1 - i]);
        }
        int currentSanRej = 0;
        while (currentSanRej < sQ.size() && !sS.isEmpty()) {
            int topSandwich = sS.peek();
            int topStud = sQ.poll();
            if (topStud == topSandwich) {
                sS.pop();
                currentSanRej = 0;
            } else {
                sQ.add(topStud);
                currentSanRej++;
            }
        }
        return sS.size();
    }
}
