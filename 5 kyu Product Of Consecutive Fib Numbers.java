public class ProdFib {
    public static long[] productFib(long prod) {
      long[] nums = new long[3];
      long a = 0;
      long b = 1;
      while (a * b < prod) {
        b += a;
        a = b - a;
      }
      nums[0] = a;
      nums[1] = b;
      nums[2] = 1;
      if (a * b != prod) {
        nums[2] = 0;
      }
      return nums;
     }
  }