import java.util.Arrays;

public class Kata
{
  public static int sum(int[] numbers)
  {
    if (numbers == null || numbers.length < 3) return 0;
    int sum = 0;
    Arrays.sort(numbers);
    for (int i = 1; i < numbers.length - 1; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}