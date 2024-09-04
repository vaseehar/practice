package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate_649 {

    public static void main(String[] args) {

    }

    //copied from discussion
    public String predictPartyVictory(String senate) {
        Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R')
                q1.add(i);
            else
                q2.add(i);
        }

        while (!q1.isEmpty() && !q2.isEmpty()) {
            int r = q1.poll(), d = q2.poll();
            if (r < d)
                q1.add(r + n);
            else
                q2.add(d + n);
        }
        return q1.isEmpty() ? "Dire" : "Radiant";
    }

}
