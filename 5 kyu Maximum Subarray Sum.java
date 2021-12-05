public class Max {
    public static int sequence(int[] arr) {
      if (arr.length == 0) return 0;
      int maxSum= 0;
      for (int i = 0; i < arr.length; i++) {
        int sum = 0;
        for (int j = i; j < arr.length; j++) {
          sum += arr[j];
          if (sum > maxSum) {
            maxSum = sum;
          }
        }
      }
      if (maxSum < 0) return 0;
      return maxSum;
    }
  }