package arrays;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval_57 {

    public static void main(String[] args) {
        new InsertInterval_57().insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
        new InsertInterval_57().insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}},
                new int[]{4, 8});
        new InsertInterval_57().insert(new int[][]{{1, 5}}, new int[]{5, 7});
        new InsertInterval_57().insert(new int[][]{{1, 5}}, new int[]{6, 8});
        new InsertInterval_57().insert(new int[][]{{1, 5}}, new int[]{0, 0});
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length, i = 0;
        boolean isInterted = false;
        if (n == 0) {
            return new int[][]{newInterval};
        }
        int a = newInterval[0], b = newInterval[1], start = 0, end = 0;
        List<int[]> res = new ArrayList<>();
        while (i < n) {
            if (!isInterted) {
                if (intervals[i][0] < a && intervals[i][1] < a) {
                    start = intervals[i][0];
                    end = intervals[i][1];
                } else if (intervals[i][0] < a) {
                    start = intervals[i][0];
                    while (i < n && intervals[i][1] < b)
                        i++;
                    if (i == n)
                        i--;
                    if (intervals[i][0] > b || intervals[i][1] < b)
                        end = b;
                    else
                        end = intervals[i][1];
                } else if (intervals[i][0] >= a) {
                    start = a;
                    if (intervals[i][0] > b)
                        end = b;
                    else {
                        while (i < n && intervals[i][1] < b)
                            i++;
                        if (i == n)
                            i--;
                        if (intervals[i][0] > b || intervals[i][1] < b)
                            end = b;
                        else
                            end = intervals[i][1];
                    }
                }
            } else {
                start = intervals[i][0];
                end = intervals[i][1];
            }
            res.add(new int[]{start, end});
            if (end >= b)
                isInterted = true;
            if (end >= intervals[i][1])
                i++;
        }
        if (end < a)
            res.add(new int[]{a, b});
        return res.toArray(new int[0][]);
    }

}
