package arrays;

public class TwoSum2_167 {

    public static void main(String[] args) {
        int[] indices = new TwoSum2_167().twoSum(new int[]{2, 7, 11, 15}, 11);
        for (int i = 0; i < indices.length; i++) {
            System.out.println(indices[i]);
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            if (numbers[start] + numbers[end] == target)
                return new int[]{start + 1, end + 1};
            else if (numbers[start] + numbers[end] < target)
                start++;
            else
                end--;
        }

        return new int[]{};
    }

}
