package recursion;

public class PowerOfTwo_231 {

	public static void main(String[] args) {

		System.out.println(isPowerOfTwo(32));
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 2 || n == 1)
			return true;
		if (n % 2 == 1 || n == 0)
			return false;
		return isPowerOfTwo(n / 2);
	}

}
