import java.util.HashMap;

public class Kata {
    public static double findUniq(double arr[]) {
      HashMap<Double, Integer> freq = new HashMap<Double, Integer>();
      for (int i = 0; i < arr.length; i++) {
        freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
      }
      double value = 0;
      for (Double key: freq.keySet()) {
        if (freq.get(key) == 1) {
          value = key;
          break;
        }
      }
      return value;      
    }
}