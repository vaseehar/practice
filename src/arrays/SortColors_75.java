package arrays;

public class SortColors_75 {

	public static void main(String[] args) {
		
	}

	public void sortColors(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			int temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
		}
	}
	//copied from discussion
	 public void sortColors1(int[] nums) {
	        int[] countArr = new int[3];
	        for(int i = 0; i < nums.length; i++) {
	            if(nums[i] == 0) countArr[0]++;
	            else if(nums[i] == 1) countArr[1]++; 
	            else countArr[2]++;
	        }
	        for(int i = 0; i < nums.length; i++) {
	            if(i < countArr[0]) nums[i] = 0;
	            else if(i < countArr[0]+countArr[1]) nums[i] = 1;
	            else nums[i] = 2;
	        }
	    }

}
