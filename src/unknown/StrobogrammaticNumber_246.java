package unknown;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber_246 {

    public static void main(String[] args) {
        System.out.println(new StrobogrammaticNumber_246().isStrobogrammatic("609"));
    }

    public boolean isStrobogrammatic(String num) {
        int n = num.length();
        if (n % 2 == 1 && Character.getNumericValue(num.charAt(n / 2)) != 1
                && Character.getNumericValue(num.charAt(n / 2)) != 8
                && Character.getNumericValue(num.charAt(n / 2)) != 0) {
            return false;
        }
        Map<Integer, Integer> pairs = new HashMap<>();
        pairs.put(0, 0);
        pairs.put(1, 1);
        pairs.put(6, 9);
        pairs.put(8, 8);
        pairs.put(9, 6);

        for (int i = 0; i < n / 2; i++) {
            int int1 = Character.getNumericValue(num.charAt(i));
            int int2 = Character.getNumericValue(num.charAt(n - 1 - i));
            if (!pairs.containsKey(int2) || int1 != pairs.get(int2)) {
                return false;
            }
        }
        return true;
    }

}
