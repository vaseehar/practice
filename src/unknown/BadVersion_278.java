package unknown;

public class BadVersion_278 extends VersionControl {

	public static void main(String[] args) {

	}

	public static int firstBadVersion(int n) {

		int low = 1, high = n, mid = low + (high - low) / 2;
		int fbv = -1;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (isBadVersion(mid)) {
				fbv = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return fbv;
	}

}
