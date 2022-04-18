  public class Sum
  {
     public int GetSum(int a, int b)
     {
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int sum = start;
        for (int i = start + 1; i <= end; i++) {
          sum += i;
        }
        return sum;
     }
  }