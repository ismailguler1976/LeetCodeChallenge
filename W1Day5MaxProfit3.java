package Week1;

public class W1Day5MaxProfit3 {

	public static void main(String[] args) {

		int[] a1 = { 7, 1, 5, 3, 6, 4 }; // sum = 7
		int[] a2 = { 1, 2, 3, 4, 5 }; // sum = 4
		int[] a3 = { 7, 6, 4, 3, 1 }; // sum = 0
		int[] a4 = { 2, 1, 4, 5, 2, 9, 7 };
		int[] a5 = { 8, 9, 7, 8, 2, 9, 7 };
		int[] a6 = { };
		
		System.out.println(maxProfit(a1));
		System.out.println(maxProfit(a2));
		System.out.println(maxProfit(a3));
		System.out.println(maxProfit(a4));
		System.out.println(maxProfit(a5));
		System.out.println(maxProfit(a6));
	}

	public static int maxProfit(int[] prices) {
		int len = prices.length;
		int max=0;

		for (int i = 0; i <len; i++) {
			boolean setMax=false;
			for (int j = i + 1; j < len; j++) {
				int dif = prices[j] - prices[i];
				if(!setMax) {
					if(dif<0) {
						dif=0;
					}
					max += dif;
					setMax = true;
				}
			}
		}
		
		return max;
	}
}
