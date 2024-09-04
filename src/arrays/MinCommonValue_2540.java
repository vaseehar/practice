package arrays;

public class MinCommonValue_2540 {

    public static void main(String[] args) {
        System.out.println(new MinCommonValue_2540().getCommon(new int[]{1, 2, 3}, new int[]{2, 4}));
    }

    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0, n = nums1.length, m = nums2.length;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                return nums1[i];
            }
        }
        return -1;
    }

}
