package unknown;

public class IsPalindrome_125 {

	public static void main(String[] args) {
		System.out.println(new IsPalindrome_125().isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(new IsPalindrome_125().isPalindrome("race a car"));
	}

	public boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		int n = s.length();
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - 1 - i))
				return false;
		}
		return true;
	}

}
