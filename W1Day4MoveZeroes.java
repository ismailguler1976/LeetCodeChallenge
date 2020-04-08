package Week1;
import java.util.Arrays;

public class W1Day4MoveZeroes {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 0, 3, 12 };
		int[] a1 = {1};
		 
		System.out.println(Arrays.toString(moveZeroes(a1)));
		System.out.println(Arrays.toString(moveZeroes(nums)));
	}

	public static int[] moveZeroes(int[] nums) {
		int zeroCnt = 0;
		int repeatedZeroCnt = 0;
		boolean zeroFound = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeroCnt++;
				repeatedZeroCnt++;
				zeroFound = true;
			} else {
				if (zeroCnt >0) {
					nums[i - repeatedZeroCnt] = nums[i];
					nums[i] = 0;  
				}
				zeroFound = false;
			}
		}
		
		return nums;
	}

}
