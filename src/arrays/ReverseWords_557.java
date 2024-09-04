package arrays;

public class ReverseWords_557 {

    public static void main(String[] args) {
        new ReverseWords_557().reverseWords1("Let's take LeetCode contest");
    }

    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        String finalStr = "";
        for (int i = 0; i < sArr.length; i++) {
            char[] c = sArr[i].toCharArray();
            for (int j = 0, k = c.length - 1; j < k; j++, k--) {
                char temp = c[j];
                c[j] = c[k];
                c[k] = temp;
            }
            finalStr = finalStr + new String(c) + " ";
        }
        return finalStr.trim();
    }

    //copied from discussion
    public String reverseWords1(String s) {
        StringBuilder st = new StringBuilder();
        String[] StringArr = s.split(" ");
        for (int i = 0; i < StringArr.length; i++) {
            char[] a = StringArr[i].toCharArray();
            int aLength = a.length - 1;
            while (aLength >= 0) {
                st.append(a[aLength--]);
            }
            st.append(" ");
        }
        return st.toString().trim();
    }

}
