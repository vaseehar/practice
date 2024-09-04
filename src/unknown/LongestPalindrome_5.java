package unknown;

public class LongestPalindrome_5 {

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome_5().longestPalindrome("babad"));
        System.out.println(new LongestPalindrome_5().longestPalindrome("cbbd"));
        System.out.println(new LongestPalindrome_5().longestPalindrome1("abcdmalayalamefgh"));
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1)
            return s;
        for (int len = n - 1; len > 0; len--) {
            int j = n - 1, i = j - len;
            while (i >= 0) {
                int a = i, b = j;
                while (a < b && s.charAt(a) == s.charAt(b)) {
                    a++;
                    b--;
                }
                if (a == b || b + 1 == a)
                    return s.substring(i, j + 1);
                if (i >= 0) {
                    i--;
                    j--;
                }
            }
        }
        return s.substring(0, 1);
    }

    // expanding from single character , faster ; copied from discussion
    public String longestPalindrome1(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

}
