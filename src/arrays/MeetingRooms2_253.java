package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms2_253 {

    public static void main(String[] args) {
//		new MeetingRooms2_253().minMeetingRooms1(new int[][] { { 0, 30 }, { 5, 10 }, { 15, 20 } });
//		new MeetingRooms2_253().minMeetingRooms1(new int[][] { { 7, 10 }, { 2, 4 } });
//		new MeetingRooms2_253().minMeetingRooms1(new int[][] { { 2, 7 } });
//		new MeetingRooms2_253().minMeetingRooms1(new int[][] { { 1, 5 }, { 8, 9 }, { 8, 9 } });
        new MeetingRooms2_253().minMeetingRooms2(new int[][]{{0, 30}, {1, 10}, {1, 11}, {12, 13}});
    }

    //mine , time limit exceeded
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        if (n == 0)
            return 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int max = 0, i = 0, j = 0, end = intervals[n - 1][1], count = 0;
        while (i <= end) {
            while (j < n && intervals[j][0] < i) {
                if (intervals[j][1] >= i) {
                    count++;
                }
                j++;
            }
            max = Math.max(max, count);
            j = 0;
            count = 0;
            i++;
        }
        return max;
    }

    //working solution from leetcode
    public int minMeetingRooms1(int[][] intervals) {
        int n = intervals.length;
        if (n == 0)
            return 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> allocator = new PriorityQueue<>(n, (a, b) -> a - b);
        allocator.add(intervals[0][1]);
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= allocator.peek()) {
                allocator.poll();
            }
            allocator.add(intervals[i][1]);
        }
        return allocator.size();
    }

    //faster
    public int minMeetingRooms2(int[][] intervals) {
        if (intervals.length == 0 || intervals[0].length == 0) {
            return 0;
        }
        int m = intervals.length;
        int[] start = new int[m];
        int[] end = new int[m];
        for (int i = 0; i < m; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int j = 0;
        int room = 0;
        for (int i = 0; i < m; i++) {
            if (start[i] < end[j]) {
                room++;
            } else {
                j++;
            }
        }
        return room;
    }

}
