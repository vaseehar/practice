package unknown;

public class LengthOfLastWord_58 {

    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.contains(" ")) {
            return s.substring(s.lastIndexOf(" ") + 1).length();
        } else {
            return s.length();
        }
    }

}
