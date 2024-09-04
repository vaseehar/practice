package recursion;

public class PowerOfFour_342 {

    public static void main(String[] args) {

    }

    public boolean isPowerOfFour(int n) {

        if (n == 1) {
            return true;
        }

        if (n % 4 != 0 || n == 0) {
            return false;
        }

        return isPowerOfFour(n / 4);
    }

}
