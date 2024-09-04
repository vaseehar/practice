package arrays;

import java.util.Arrays;

public class HeightChecker_1051 {

    public static void main(String[] args) {
        new HeightChecker_1051().heightChecker(new int[]{1, 1, 4, 2, 1, 3});
    }

    public int heightChecker(int[] heights) {
        int[] actualHeights = new int[heights.length];
        int n = heights.length, count = 0;
        actualHeights = heights.clone();
        Arrays.sort(heights);

        for (int i = 0; i < n; i++) {
            if (heights[i] != actualHeights[i]) {
                count++;
            }
        }
        return count;
    }

}
