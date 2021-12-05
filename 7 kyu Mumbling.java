import java.lang.*;

public class Accumul {    
    public static String accum(String s) {
      String str = "";
      char charToAdd = Character.toUpperCase(s.charAt(0));
      str = str + charToAdd;
      if (s.length() == 1) {
        return str;
      }
      for (int i = 1; i < s.length(); i++) {
        str = str + "-" + Character.toUpperCase(s.charAt(i));
        for (int j = 0; j < i; j++) {
          str = str + Character.toLowerCase(s.charAt(i));
        }
      }
      return str;
    }
}