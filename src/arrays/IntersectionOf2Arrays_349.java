package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOf2Arrays_349 {

    public static void main(String[] args) {
        /*
         * int[] arr = new IntersectionOf2Arrays_349().intersection(new int[] { 2, 1, 4,
         * 3, 5, 1, 3 }, new int[] { 9, 1, 7, 3, 1 });
         */
        int[] arr = new IntersectionOf2Arrays_349().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums1);
        Set<Integer> s = new HashSet<>();
        for (int num : nums1) {
            s.add(num);
        }
        Set<Integer> t = new HashSet<>();
        for (int num : nums2) {
            if (num > nums1[nums1.length - 1])
                break;
            if (s.contains(num)) {
                t.add(num);
            }
        }

        return t.stream().mapToInt(ent -> ent).toArray();
    }

}
