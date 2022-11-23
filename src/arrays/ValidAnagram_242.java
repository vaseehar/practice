package arrays;

import java.util.Arrays;

public class ValidAnagram_242 {

	public static void main(String[] args) {

	}

	public boolean isAnagram(String s, String t) {
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if (s.length() != t.length())
			return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}

}
