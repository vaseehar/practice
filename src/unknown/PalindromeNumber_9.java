package unknown;

public class PalindromeNumber_9 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		long result = 0;
		int n = x;
		while (n > 0) {
			result = result * 10 + n % 10;
			n /= 10;
		}

		return x == result;
	}

}
