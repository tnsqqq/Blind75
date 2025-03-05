// public class MaximumProductSubarray {
//   public static void main(String[] args) {
//     int[] arr = { 2, 3, -2, 4 };
//     System.out.println(maxProduct(arr));
//   }

//   static int maxProduct(int[] arr) {
//     if (arr.length == 0) {
//       return 0;
//     }

//     int maxPro = arr[0];
//     int minPro = arr[0];
//     int result = arr[0];

//     for (int i = 1; i < arr.length; i++) {
//       if (arr[i] < 0) {
//         int temp = maxPro;
//         maxPro = minPro;
//         minPro = temp;
//       }

//       maxPro = Math.max(arr[i], maxPro * arr[i]);
//       minPro = Math.min(arr[i], minPro * arr[i]);

//       result = Math.max(result, maxPro);
//     }
//     return result;
//   }
// }

public class MaximumProductSubarray {
  public static void main(String[] args) {
    int[] arr = { 2, 3, -2, 4 };
    System.out.println(maxProduct(arr));
  }

  static int maxProduct(int[] arr) {

    int prefix = 1;
    int suffix = 1;
    int result = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      prefix = (prefix == 0) ? 1 : prefix;
      suffix = (suffix == 0) ? 1 : suffix;

      prefix *= arr[i];
      suffix *= arr[arr.length - i - 1];

      result = Math.max(result, Math.max(prefix, suffix));
    }
    return result;
  }
}