public class Kata {

  public static String encrypt(final String text, final int n) {
    if (text == null || text.length() == 0) return text;
    String word = text;
    for (int i = 0; i < n; i++) {
      StringBuilder even = new StringBuilder();
      StringBuilder odd = new StringBuilder();
      for (int j = 0; j < word.length(); j++) {
        if (j % 2 == 0) {
          odd.append(word.charAt(j)); // problem is 1-based, not zero
        } else {
          even.append(word.charAt(j));
        }
      }
      word = even.toString() + odd.toString();
    } 
    return word;
  }
  
  public static String decrypt(final String encryptedText, final int n) {
    if (encryptedText == null || encryptedText.length() == 0) return encryptedText;
    String word = encryptedText;
    int half = word.length() / 2;
    for (int i = 0; i < n; i++) {
      String even = word.substring(0, half);
      String odd = word.substring(half);
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < half; j++) {
        sb.append(odd.charAt(j));
        sb.append(even.charAt(j));
      }
      if (word.length() % 2 != 0) {
        sb.append(word.charAt(word.length() - 1));
      }
      word = sb.toString();
    }
    return word;
  }
  
}