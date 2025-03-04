// Brute Force-

// public class MaximumSubarray {
//   public static void main(String[] args) {
//     int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//     System.out.println(maxSubArray(arr));
//   }

//   static int maxSubArray(int[] arr) {
//     int maxSum = Integer.MIN_VALUE;
//     int start = 0;
//     // int end = arr.length - 1;
//     int end = 0;
//     for (start = 0; start < arr.length; start++) {
//       int currSum = 0;
//       for (end = start; end < arr.length; end++) {
//         currSum += arr[end];
//         maxSum = Math.max(currSum, maxSum);
//       }
//     }
//     return maxSum;
//   }
// }

// Kadane's Algorithm (Dynamic Programming)

public class MaximumSubarray {
  public static void main(String[] args) {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(maxSubArray(arr));
  }

  static int maxSubArray(int[] arr) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int val : arr) {
      currSum += val;
      maxSum = Math.max(currSum, maxSum);

      if (currSum < 0) {
        currSum = 0;
      }
    }
    return maxSum;
  }
}

// Time Complexity- O(n)
