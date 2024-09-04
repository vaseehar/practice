package arrays;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{""}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        int charIndex = 0;
        boolean dontStop = true;

        while (dontStop) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (!(strs[i].length() > charIndex && strs[i + 1].length() > charIndex
                        && strs[i].charAt(charIndex) == strs[i + 1].charAt(charIndex))) {
                    return strs[i].substring(0, charIndex);
                }
            }
            charIndex++;
        }

        return "";
    }

}
