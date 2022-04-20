import java.util.HashMap;

class Solution {
  static int stray(int[] numbers) {
      HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
      for (int num : numbers) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
      }
      int res = numbers[0];
      for (int num : numbers) {
        if (freq.get(num) == 1) {
          res = num;
          break;
        }
      }
      return res;
  }
}