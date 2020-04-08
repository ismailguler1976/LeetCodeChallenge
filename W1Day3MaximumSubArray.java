package Week1;

public class W1Day3MaximumSubArray {

	public static void main(String[] args) {

		int[] a1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] a2 = { -2, 1 };
		int[] a3 = { 1, 2 };
		int[] a4 = { -1 };
		int[] a5 = { 1, -1, 1 };
		int[] a6 = { -2, -1 }; 
		System.out.println(maxSubArray(a1)); // 4
		System.out.println(maxSubArray(a2)); // 1
		System.out.println(maxSubArray(a3)); // 3
		System.out.println(maxSubArray(a4)); // -1
		System.out.println(maxSubArray(a5)); // 1
		System.out.println(maxSubArray(a6)); // 1
	}

	public static int maxSubArray(int[] nums) {

		int allSumm = getSum(nums);
		int maxSum = allSumm;
		int sumLv1 = allSumm;
		int sumLv1Bck = allSumm;
		
		if (nums.length > 1) {
			for (int j = 0; j < nums.length; j++) {
				int sumLv2 = sumLv1;
				for (int i = j; i < nums.length-1; i++) {
					sumLv2 -= nums[i];
					if (sumLv2 > maxSum) {
						maxSum = sumLv2;
					}
				}
				sumLv1 -= nums[j];
				
				int sumLv2Bck = sumLv1Bck;
				for (int i = nums.length -1; i > j ; i--) {
					sumLv2Bck -= nums[i];
					if (sumLv2Bck > maxSum) {
						maxSum = sumLv2Bck;
					}
				}
				sumLv1Bck -= nums[j];
			}
		}
		return maxSum;
	}

	public static int getSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

}
