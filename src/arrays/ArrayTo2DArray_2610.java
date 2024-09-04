package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTo2DArray_2610 {

    public static void main(String[] args) {
        System.out.println(new ArrayTo2DArray_2610().findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1}));
        System.out.println(new ArrayTo2DArray_2610().findMatrix(new int[]{1, 2, 3, 4}));
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        if (nums.length == 0)
            return null;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int index = 0, n = nums.length;
        List<Integer> a = new ArrayList<>();
        a.add(0, nums[0]);
        res.add(a);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                index++;
                if (res.size() > index) {
                    res.get(index).add(nums[i]);
                } else {
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(nums[i]);
                    res.add(index, innerList);
                }
            } else {
                index = 0;
                res.get(index).add(nums[i]);
            }
        }
        return res;
    }

    //faster
    public List<List<Integer>> findMatrix1(int[] nums) {
        int n = nums.length, max = 0;
        int[] freq = new int[n + 1];

        for (int num : nums) {
            freq[num]++;
            max = Math.max(max, freq[num]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < max; i++)
            ans.add(new ArrayList<>());

        for (int i = 0; i <= n; i++) {
            while (freq[i]-- > 0) {
                ans.get(freq[i]).add(i);
            }
        }
        return ans;
    }
}
