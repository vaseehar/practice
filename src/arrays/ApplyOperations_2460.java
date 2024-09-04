package arrays;

public class ApplyOperations_2460 {

    public static void main(String[] args) {
        int[] nums = new ApplyOperations_2460()
                .applyOperations(new int[]{847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272});
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    //moveZeroes copied
    public int[] applyOperations(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        return moveZeroes(nums);
    }

    public int[] moveZeroes(int[] nums) {
        if (nums.length == 0 || nums == null)
            return nums;
        int j = 0;
        for (int i : nums) {
            if (i != 0)
                nums[j++] = i;
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }
        return nums;
    }

}
