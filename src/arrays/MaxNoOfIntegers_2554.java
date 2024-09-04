package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxNoOfIntegers_2554 {

    public static void main(String[] args) {
        System.out.println(new MaxNoOfIntegers_2554().maxCount(new int[]{1, 6, 5}, 5, 6));
        System.out.println(new MaxNoOfIntegers_2554().maxCount(new int[]{1, 2, 3, 4, 5, 6, 7}, 8, 1));
        System.out.println(new MaxNoOfIntegers_2554().maxCount(new int[]{11}, 7, 50));
        System.out
                .println(new MaxNoOfIntegers_2554().maxCount(
                        new int[]{87, 193, 85, 55, 14, 69, 26, 133, 171, 180, 4, 8, 29, 121, 182, 78, 157, 53, 26, 7,
                                117, 138, 57, 167, 8, 103, 32, 110, 15, 190, 139, 16, 49, 138, 68, 69, 92, 89, 140, 149,
                                107, 104, 2, 135, 193, 87, 21, 194, 192, 9, 161, 188, 73, 84, 83, 31, 86, 33, 138, 63,
                                127, 73, 114, 32, 66, 64, 19, 175, 108, 80, 176, 52, 124, 94, 33, 55, 130, 147, 39, 76,
                                22, 112, 113, 136, 100, 134, 155, 40, 170, 144, 37, 43, 151, 137, 82, 127, 73},
                        1079, 87));
    }

    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] isBanned = new boolean[n + 1];
        for (int i : banned) {
            if (i <= n)
                isBanned[i] = true;
        }

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!isBanned[i]) {
                sum += i;
                if (sum > maxSum)
                    break;
                count++;
            }
        }
        return count;
    }

}
