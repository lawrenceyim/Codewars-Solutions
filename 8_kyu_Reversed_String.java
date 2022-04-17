public class Kata {

  public static String solution(String str) {
    char[] ch = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = ch.length - 1; i >= 0; i--) {
      sb.append(ch[i]);
    }
    return sb.toString();
  }
}