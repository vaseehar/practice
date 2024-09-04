package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

    static int n;

    public static void main(String[] args) {
        System.out.println(new Permutations_46().permute(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(result, new ArrayList<>(), nums);
        return result;
    }

    public void permute(List<List<Integer>> result, List<Integer> pre, int[] nums) {
        if (pre.size() == nums.length) {
            result.add(new ArrayList<>(pre));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (pre.contains(nums[i]))
                    continue;
                pre.add(nums[i]);
                permute(result, pre, nums);
                pre.remove(pre.size() - 1);
            }
        }
    }

}
