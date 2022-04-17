import java.util.ArrayList;
public class Vowels {
  
  public static int getCount(String str) {
    int vowelsCount = 0;
    ArrayList<String> arr = new ArrayList<String>(5);
    arr.add("a");
    arr.add("e");
    arr.add("i");
    arr.add("o");
    arr.add("u");
    for (int i = 0; i < str.length(); i++) {
      if (arr.contains(String.valueOf(str.charAt(i)))) vowelsCount++;
    }
    return vowelsCount;
  }

}