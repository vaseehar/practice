package arrays;

/*https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class MaxProfi_121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3}));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        if (null != prices && prices.length != 0) {
            int buyPrice = prices[0];
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < buyPrice) {
                    buyPrice = prices[i];
                } else if (prices[i] > buyPrice) {
                    profit = Math.max(profit, prices[i] - buyPrice);
                }
            }
        }
        return profit;
    }

}
