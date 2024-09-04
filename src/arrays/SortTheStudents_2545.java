package arrays;

import java.util.Arrays;

public class SortTheStudents_2545 {

    public static void main(String[] args) {

    }

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> b[k] - a[k]);
        return score;
    }

}
