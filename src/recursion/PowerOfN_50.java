package recursion;

public class PowerOfN_50 {

    public static void main(String[] args) {
        System.out.println(myPow(0.00001, 2147483647));
    }

    // mine , not optimised
    public static double myPow(double x, int n) {
        if (n >= 0) {
            if (n == 1)
                return x;
            if (n == 0)
                return 1;
            return x * myPow(x, n - 1);
        } else {
            if (n == -1)
                return 1 / x;
            return (1 / x) * myPow(x, n + 1);
        }
    }

    //copied from someone
    public double myPow1(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            return ((1 / x) * (myPow(1 / x, -(n + 1))));
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }

}
