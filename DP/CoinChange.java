public class CoinChange {

  public static void main(String[] args) {
    int[] coins = { 1, 2, 5 };
    System.out.println(coinChange(coins, 11));
  }

  static int coinChange(int[] coins, int amount) {
    if (coins == 0)
      return 0;

    int[] minCoins = new int[amount + 1];

    for (int i = 0; i <= amount; i++) {
      if (amount - coins[i] >= 0) {
        int ans = minCoins(amount - coins[i], a);
      }
    }
  }
}