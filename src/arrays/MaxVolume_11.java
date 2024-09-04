package arrays;

/*https://leetcode.com/problems/container-with-most-water/
 */
public class MaxVolume_11 {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxVolume = 0;
        int p1 = 0, p2 = height.length - 1;
        while (p1 < p2) {
            maxVolume = Math.max(Math.min(height[p1], height[p2]) * (p2 - p1), maxVolume);
            if (height[p1] > height[p2]) {
                p2--;
            } else if (height[p1] <= height[p2]) {
                p1++;
            }
        }
        return maxVolume;
    }

}
