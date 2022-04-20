import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    HashSet<Integer> toRemove = new HashSet<Integer>();
    for (int num : b) {
      toRemove.add(num);
    }
    Queue<Integer> q = new LinkedList<>();
    int size = 0;
    for (int num: a) {
      if (!toRemove.contains(num)) {
        q.add(num);
        size++;
      }
    }
    int[] r = new int[size];
    int index = 0;
    while (q.peek() != null) {
      r[index] = q.poll();
      index++;
    }
    return r;
  }

}