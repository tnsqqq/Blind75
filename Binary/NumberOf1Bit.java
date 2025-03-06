public class NumberOf1Bit {
  public static void main(String[] args) {
    int n = 11;
    // System.out.println(Integer.toBinaryString(n));
    System.out.println(hammingWeight(n));
  }

  static int hammingWeight(int n) {
    int result = 0;
    int helper = 1;
    for (int i = 1; i <= 32; i++) {
      if ((helper & n) != 0) {
        result++;
      }
      helper = helper << 1;
    }
    return result;
  }
}
