package arrays;

/*https://leetcode.com/problems/plus-one/
*/
public class PlusOne {

	public static void main(String[] args) {
		int[] digits = { 9, 9, 9 };
		System.out.println(plusOne(digits));
	}

	public static int[] plusOne(int[] digits) {
		int carryOver = 0;
		int[] result;
		boolean isAll9 = true;
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] != 9) {
				isAll9 = false;
				break;
			}
		}
		if (isAll9) {
			result = new int[digits.length + 1];

		} else {
			result = new int[digits.length];
		}

		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == digits.length - 1) {
				result[i] = (digits[i] + 1) % 10;
				carryOver = (digits[i] + 1) / 10;
			} else {
				result[i] = (digits[i] + carryOver) % 10;
				carryOver = (digits[i] + carryOver) / 10;
			}
		}
		if (result.length > digits.length) {
			result[0] = carryOver;
		}
		return result;
	}

}
