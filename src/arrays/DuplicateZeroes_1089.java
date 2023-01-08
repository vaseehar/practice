package arrays;

public class DuplicateZeroes_1089 {

	public static void main(String[] args) {
		new DuplicateZeroes_1089().duplicateZerosWhile(new int[] { 1, 0, 2, 0, 4, 5, 6, 0 });
	}

	// mine inefficient
	public void duplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0) {
				int j = arr.length - 1;
				while (j > i) {
					arr[j] = arr[--j];
				}
				i++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// copied from discussion , efficient
	public void duplicateZerosWhile(int[] arr) {
		int nums[] = new int[arr.length];
		int i = 0;
		int j = 0;
		while (j < nums.length && i < arr.length) {
			if (arr[i] == 0) {
				nums[j] = 0;
				if (j + 1 < nums.length) {
					nums[j + 1] = 0;
				}
				j += 2;
				i++;
			} else {
				nums[j] = arr[i];
				j++;
				i++;
			}
		}
		for (int k = 0; k < nums.length; k++) {
			arr[k] = nums[k];
		}
	}

}
