package arrays;

public class ReverseString_151 {

	public static void main(String[] args) {
		// System.out.println(new ReverseString_151().reverseWords("the sky is blue"));
		// System.out.println(new ReverseString_151().reverseWords("hello world "));
		System.out.println(new ReverseString_151().reverseWords("a good   example  "));
	}

	public String reverseWords(String s) {
		s = s.trim();

		String[] str = s.trim().split(" ");
		int i = 0, j = str.length - 1;
		while (i < j) {
			String temp;
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++;
			j--;
		}
		String res = "";
		for (int k = 0; k < str.length; k++) {
			if (!str[k].equals(""))
				res = res + " " + str[k];
		}
		return res.trim();
	}

}
