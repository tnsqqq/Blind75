public class FindMinRotatedSortedArray {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 5, 1, 2 };
    System.out.println(findMin(arr));
  }

  static int findMin(int[] arr) {
    int ans = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < ans) {
        ans = arr[i];
      }
    }
    return ans;
  }
}
