package unknown;

public class VersionControl {

	public static boolean isBadVersion(int version) {
		int badVersion = 4;
		if(version >= badVersion) {
			return true;
		} else {
			return false;
		}
	}

}
