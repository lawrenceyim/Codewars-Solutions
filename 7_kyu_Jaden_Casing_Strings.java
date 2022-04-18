public class JadenCase {
	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.length() == 0) return null;
    String[] words = phrase.split(" ");
    for (int i = 0; i < words.length; i++) {
      String w = String.valueOf(Character.toUpperCase(words[i].charAt(0)));
      try {
         w += words[i].substring(1);
      } catch (Exception e) {}
      words[i] = w;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      sb.append(words[i] + " ");
    }
    return sb.toString().trim();
  }

}