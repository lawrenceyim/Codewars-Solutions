import java.util.PriorityQueue;
import java.util.HashSet;
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        HashSet<String> set = new HashSet<String>();
        PriorityQueue<String> pri = new PriorityQueue<String>();
        for (int i = 0; i < s1.length(); i++) {
          if (!set.contains(String.valueOf(s1.charAt(i)))) {
            pri.add(String.valueOf(s1.charAt(i)));
            set.add(String.valueOf(s1.charAt(i)));
          }
        }
        for (int i = 0; i < s2.length(); i++) {
          if (!set.contains(String.valueOf(s2.charAt(i)))) {
            pri.add(String.valueOf(s2.charAt(i)));
            set.add(String.valueOf(s2.charAt(i)));
          }
        }
        StringBuilder sb = new StringBuilder();
        while (pri.size() > 0) {
          sb.append(pri.poll());
        }
        return sb.toString();
    }
}