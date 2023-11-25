package arrays;

import java.util.HashSet;
import java.util.Set;

public class HappryNumber_202 {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    private static boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        while (sum != 1 && !set.contains(sum)) {
            set.add(sum);
            sum=0;
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }

            n = sum;
        }
        return sum == 1;
    }
}
