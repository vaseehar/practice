package unknown;

public class VersionControl {

	public static boolean isBadVersion(int version) {
		int badVersion = 5;
		if(version >= badVersion) {
			return true;
		} else {
			return false;
		}
	}

}
