package unknown;

public class CircularSentence_2490 {

    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
    }

    public static boolean isCircularSentence(String sentence) {
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1))
            return false;
        String[] words = sentence.split(" ");
        if (words.length == 1) {
            return words[0].charAt(0) == words[0].charAt(words.length - 1);
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }
        return (words[words.length - 1].charAt(words[words.length - 1].length() - 1) == words[0].charAt(0));
    }

}
