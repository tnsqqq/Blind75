public class SumOfTwoIntegers {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    System.out.println(getSum(a, b));
  }

  static int getSum(int a, int b) {
    while (b != 0) {
      int tmp = (a & b) << 1;
      a = a ^ b;
      b = tmp;
    }
    return a;
  }
}
