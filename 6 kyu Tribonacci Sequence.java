public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
      double[] nums = new double[n];
      if (n == 0) {
        return nums;
      }
      
      if (n <= 3) {
        for (int i = 0; i < n; i++) {
          nums[i] = s[i];
        }
      }
      else {
        for (int i = 0; i < 3; i++) {
          nums[i] = s[i];
        }
        for (int j = 3; j < n; j++) {
          nums[j] = nums[j - 1] + nums[j - 2] + nums[j - 3];
        }
      }
      return nums;
    }
  }