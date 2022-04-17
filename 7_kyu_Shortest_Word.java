public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortest = words[0].length();
        for (int i = 1; i < words.length; i++) {
          if (words[i].length() < shortest) shortest = words[i].length();
        }
        return shortest;
    }
}