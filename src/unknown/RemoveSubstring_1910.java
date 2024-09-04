package unknown;

public class RemoveSubstring_1910 {

    public static void main(String[] args) {
        System.out.println(new RemoveSubstring_1910().removeOccurrences("daabcbaabcbc", "abc"));
        System.out.println(new RemoveSubstring_1910().removeOccurrences("axxxxyyyyb", "xy"));
        System.out.println(new RemoveSubstring_1910().removeOccurrences("aabababa", "aba"));

    }

    public String removeOccurrences1(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }

    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf(part) != -1) {
            sb.delete(sb.indexOf(part), sb.indexOf(part) + part.length());
        }
        return sb.toString();
    }

}
