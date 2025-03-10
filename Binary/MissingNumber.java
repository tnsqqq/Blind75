public class MissingNumber {
  public static void main(String[] args) {
    int[] arr = { 3, 0, 1 };
    System.out.println(missingNumber(arr));
  }

  static int missingNumber(int[] arr) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      res = res ^ i ^ arr[i];
    }
    return res ^ arr.length;
  }
}
