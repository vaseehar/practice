package unknown;

public class StringToInt_8 {
	public static void main(String[] args) {
		System.out.println(myAtoi(" -42"));
		 System.out.println(myAtoi("words and 987"));
		System.out.println(myAtoi("-42-"));
	}

	public static int myAtoi(String s) {
		s = s.trim();
		boolean isNumberStarted = false;
		boolean isNumberEnded = false;

		boolean isNegative = false;
		boolean isSignRead = false;
		String finalStr = "";
		if (s.isEmpty())
			return 0;
		for (int i = 0; i < s.length(); i++) {
			
			if (!isNumberStarted && isSignRead && !Character.isDigit(s.charAt(i))) {
				return 0;
			}
			if (!isNumberStarted && !isSignRead && !Character.isDigit(s.charAt(i)) && s.charAt(i) != '-'
					&& s.charAt(i) != '+') {
				return 0;
			}
			if (!isSignRead && !isNumberStarted) {
				if (s.charAt(i) == '-') {
					isNegative = true;
					isSignRead = true;
				}
				if (s.charAt(i) == '+') {
					isNegative = false;
					isSignRead = true;
				}
			}

			if (Character.isDigit(s.charAt(i))) {
				finalStr = finalStr.concat(Character.toString(s.charAt(i)));
				isNumberStarted = true;
			}
			if (isNumberStarted && !Character.isDigit(s.charAt(i))) {
				isNumberEnded = true;
			}
			if (isNumberEnded)
				break;

		}
		if (isNumberStarted) {
			int result = 0;
			try {
				result = Integer.parseInt(finalStr);
				if (isNegative)
					return result * -1;
				return result;
			} catch (NumberFormatException ne) {
				if (isNegative)
					return -2147483648;
				else
					return 2147483647;
			}
		} else {
			return 0;
		}

	}

}
