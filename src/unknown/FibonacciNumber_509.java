package unknown;

public class FibonacciNumber_509 {

	public static void main(String[] args) {

	}

	int[] fibArr;

	public int fib(int n) {
		if (fibArr == null) {
			fibArr = new int[n + 1];
		}
		if (n <= 1)
			return n;
		else if (fibArr[n] != 0)
			return fibArr[n];
		else {
			fibArr[n] = fib(n - 2) + fib(n - 1);
			return fibArr[n];
		}
	}

}
