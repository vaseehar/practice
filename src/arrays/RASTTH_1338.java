package arrays;

import java.util.Arrays;

public class RASTTH_1338 {

	public static void main(String[] args) {
		System.out.println(new RASTTH_1338().minSetSize(new int[] { 3, 3, 3, 3, 5, 5, 5, 2, 2, 7 }));
		System.out.println(new RASTTH_1338().minSetSize(new int[] { 7, 7, 7, 7, 7, 7 }));
	}

	public int minSetSize(int[] arr) {
		int n = arr.length, freqIndex = 0, currCount = 1, totFreq = 0, freqCount = 0;
		if (n <= 1)
			return n;
		int[] freqArr = new int[n];
		Arrays.sort(arr);
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1])
				currCount++;
			else {
				freqArr[freqIndex] = currCount;
				freqIndex++;
				currCount = 1;
			}
		}
		freqArr[freqIndex] = currCount;
		Arrays.sort(freqArr);
		for (int i = freqArr.length - 1; i >= 0; i--) {
			if (totFreq >= n / 2)
				break;
			freqCount++;
			totFreq += freqArr[i];
		}
		return freqCount;
	}

}
