package arrays;

public class BuySellStocks_122 {

	public static void main(String[] args) {
		System.out.println(new BuySellStocks_122().maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(new BuySellStocks_122().maxProfit(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(new BuySellStocks_122().maxProfit(new int[] { 7, 2, 12, 4, 8, 15, 3, 7, 6, 9, 12, 16 }));
		System.out.println(new BuySellStocks_122().maxProfit(new int[] { 1, 2, 4, 2, 5, 7, 2, 4, 9, 0 }));
	}

	public int maxProfit(int[] prices) {
		int bp = prices[0], sp = prices[0], profit = 0;
		int n = prices.length;
		for (int i = 1; i < n; i++) {
			if (prices[i] > sp) {
				sp = prices[i];
			} else if (prices[i] < sp) {
				profit += sp - bp;
				bp = prices[i];
				sp = prices[i];
			}
		}
		if (sp > bp) {
			profit += sp - bp;
		}
		return profit;
	}

}
