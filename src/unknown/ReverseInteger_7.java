package unknown;

public class ReverseInteger_7 {

	public static void main(String[] args) {

	}

	public static int reverse(int x) {
		if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE)
			return 0;

		int num = x;
		if (num < 0) {
			x = x * (-1);
		}

		long rev = 0;
		while (x > 0) {
			long digit = x % 10;
			rev = rev * 10 + digit;
			x /= 10;

			if (rev >= Integer.MAX_VALUE)
				return 0;
		}

		if (num < 0)
			rev = rev * (-1);

		return (int) rev;
	}

}
