// Brute Force

// public class CountingBits {
//   public static void main(String[] args) {
//     int n = 2;
//     int[] result = countBits(n);
//     for (int val : result) {
//       System.out.print(val + " ");
//     }
//   }

//   static int[] countBits(int n) {
//     int[] ans = new int[n + 1];
//     for (int i = 0; i <= n; i++) {
//       int count = 0;
//       int num = i;
//       while (num > 0) {
//         count += num % 2;
//         num /= 2;
//       }
//       ans[i] = count;
//     }
//     return ans;
//   }
// }

public class CountingBits {
  public static void main(String[] args) {
    int n = 2;
    int[] result = countBits(n);
    for (int val : result) {
      System.out.print(val + " ");
    }
  }

  static int[] countBits(int n) {
    int[] ans = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      if (i % 2 == 0) {
        ans[i] = ans[i / 2];
      } else {
        ans[i] = ans[i / 2] + 1;
      }
    }
    return ans;
  }
}