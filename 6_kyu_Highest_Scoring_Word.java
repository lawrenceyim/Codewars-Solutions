public class Kata {

  public static String high(String s) {
    String[] words = s.split(" ");
    int max = 0;
    String maxW = "";
    for (int i = 0; i < words.length; i++) {
      int sum = 0;
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < words[i].length(); j++) {
        sum += Integer.valueOf(words[i].charAt(j)) - 96;
        sb.append(String.valueOf(words[i].charAt(j)));
      }
      if (sum > max) {
        max = sum;
        maxW = sb.toString();
      }
    }
    return maxW;
  }

}