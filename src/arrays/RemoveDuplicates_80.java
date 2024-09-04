package arrays;

public class RemoveDuplicates_80 {

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates_80().removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
        System.out.println(new RemoveDuplicates_80().removeDuplicates(new int[]{1, 1, 1}));
    }

    public int removeDuplicates(int[] nums) {
        int count = 1;
        int j;
        int i = 1;
        int removalCount = 0;
        while (i < nums.length - removalCount) {
            if (nums[i] == nums[i - 1]) {
                if (++count > 2) {
                    removalCount++;
                    j = i + 1;
                    while (j < nums.length) {
                        nums[j - 1] = nums[j++];
                    }
                } else {
                    i++;
                }

            } else {
                count = 1;
                i++;
            }
        }

        return nums.length - removalCount;
    }
}
