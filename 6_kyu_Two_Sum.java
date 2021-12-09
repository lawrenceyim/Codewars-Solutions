public class Solution
{
    public static int[] twoSum(int[] numbers, int target)
    {
      int nums[] = new int[2];
      for (int i = 0; i < numbers.length; i++) {
        for (int j = 1; j < numbers.length; j++) {
          if (numbers[i] + numbers[j] == target && numbers[i] != numbers[j]) {
            nums[0] = i;
            nums[1] = j;
          }
        }
      }
      return nums;
    }
}