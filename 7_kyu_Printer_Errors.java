import java.util.Arrays;

public class Printer {
    
    public static String printerError(String s) {
      char[] ch = s.toCharArray();
      Arrays.sort(ch);
      int count = 0;
      for (int i = 0; i < ch.length; i++) {
        if (ch[i] > 'm') {
          count++;
        }
      }
      return String.valueOf(count) + "/" + String.valueOf(ch.length);
    } 
}