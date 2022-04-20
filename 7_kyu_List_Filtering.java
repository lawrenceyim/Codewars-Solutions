import java.util.List;
import java.util.ArrayList;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
    List<Object> r = new ArrayList<Object>();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) instanceof Integer) r.add(list.get(i));
    }
    return r;
  }
}
