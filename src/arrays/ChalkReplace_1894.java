package arrays;

public class ChalkReplace_1894 {

	public static void main(String[] args) {
		System.out.println(new ChalkReplace_1894().chalkReplacer(new int[] { 5, 1, 5 }, 22));
		System.out.println(new ChalkReplace_1894().chalkReplacer(new int[] { 3, 4, 1, 2 }, 25));
	}

	public int chalkReplacer(int[] chalk, int k) {
		long sum = 0, n = chalk.length;
		for (int a : chalk) {
			sum += a;
		}
		int remainder = (int) (k % sum), i = 0;
		for (; i < n && remainder >= 0;) {
			remainder -= chalk[i];
			if (remainder >= 0)
				i++;
		}
		return i;
	}

}
