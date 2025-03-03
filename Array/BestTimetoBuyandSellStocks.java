public class BestTimetoBuyandSellStocks {
  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println(maxProfit(prices));
  }

  static int maxProfit(int[] prices) {
    int maxProfit = 0;
    int bestBuy = prices[0];
    for (int i = 0; i < prices.length; i++) {
      bestBuy = Math.min(bestBuy, prices[i]);
      if (prices[i] > bestBuy) {
        maxProfit = Math.max(maxProfit, (prices[i] - bestBuy));
      }
    }
    return maxProfit;
  }
}