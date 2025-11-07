package LECTURE3;

public class BuyANDsell {
    public static void main(String[] args) {
        
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        
    }
         public  static int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minBuyPrice = prices[0];
        
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];

            int currentProfit = currentPrice - minBuyPrice;

            maxProfit = Math.max(maxProfit, currentProfit);

            minBuyPrice = Math.min(minBuyPrice, currentPrice);
        }

        return maxProfit;
    }
}
