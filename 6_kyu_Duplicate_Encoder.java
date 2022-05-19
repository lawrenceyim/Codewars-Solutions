import java.util.HashMap;

public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase();
    HashMap<String, Integer> count = new HashMap<String, Integer>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {
      String letter = String.valueOf(word.charAt(i));
      count.put(letter, count.getOrDefault(letter, 0) + 1);
    }
    for (int i = 0; i < word.length(); i++) {
      String letter = String.valueOf(word.charAt(i));
      if (count.get(letter) == 1) {
        sb.append('(');
      } else {
        sb.append(')');
      }
    }
    return sb.toString();
  }
}
