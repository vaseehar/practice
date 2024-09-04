package unknown;

public class MySqrt_69 {

    public static void main(String[] args) {
        System.out.println(new MySqrt_69().mySqrt(1));
    }

    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int high = x, low = 0, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (x / mid == mid)
                return mid;
            if (x / mid > mid)
                low = mid + 1;
            if (x / mid < mid)
                high = mid - 1;
            if (x / mid > mid && x / (mid + 1) < mid + 1)
                return mid;
        }
        return 0;
    }
}
