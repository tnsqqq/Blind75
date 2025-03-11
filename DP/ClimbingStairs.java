public class ClimbingStairs {
  public static void main(String[] args) {
    int n = 4;
    System.out.println(climbingStairs(n));
  }

  static int climbingStairs(int n) {
    // if (n <= 3)
    // return n;

    // int[] step = new int[n + 1];
    // step[1] = 1;
    // step[2] = 2;

    // for (int i = 3; i <= n; i++) {
    // step[i] = step[i - 1] + step[i - 2];
    // }
    // return step[n];

    // return climbingStairs(n - 1) + climbingStairs(n - 2);

    if (n <= 3)
      return n;

    int prev1 = 1, prev2 = 2;
    for (int i = 3; i <= n; i++) {
      int current = prev1 + prev2;
      prev1 = prev2;
      prev2 = current;
    }
    return prev2;

  }
}
