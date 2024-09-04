package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDisappeared_448 {

    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] isPresent = new boolean[n + 1];
        List<Integer> result = new ArrayList<>();
        for (int a : nums) {
            isPresent[a] = true;
        }
        for (int i = 1; i < n + 1; i++) {
            if (!isPresent[i])
                result.add(i);
        }
        return result;
    }

}
