public class LongestIncreasingSubsequence {
  public static void main(String[] args) {
    int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
    System.out.println(lengthOfLIS(arr));
  }

  static int lengthOfLIS(int[] arr) {
    int[] T = new int[arr.length];

    // start main pointer
    for (int i = 1; i < arr.length; i++) {

      // start second pointer
      for (int j = 0; j < i; j++) {
        if (arr[i] > arr[j]) {
          if (T[j] + 1 > T[i]) {
            T[i] = T[j] + 1;
          }
        }
      }
    }
    // find the max value
    int max = 0;
    for (int i = 0; i < T.length; i++) {
      if (T[i] > T[max]) {
        max = i;
      }
    }
    return T[max] + 1;
  }
}

// time- O(n^2)
// space- O(n)