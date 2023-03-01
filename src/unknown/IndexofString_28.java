package unknown;

public class IndexofString_28 {

	public static void main(String[] args) {
		System.out.println(new IndexofString_28().strStr("happy sad", "sad"));
	}

	public int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}

}
