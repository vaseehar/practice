package recursion;

public class PowerOf3_326 {

    public static void main(String[] args) {
        System.out.println(new PowerOf3_326().isPowerOfThree(27));
    }

    public boolean isPowerOfThree(int n) {
        if (n == 3 || n == 1)
            return true;
        if (n == 0 || n % 3 != 0)
            return false;
        return isPowerOfThree(n / 3);
    }

}
