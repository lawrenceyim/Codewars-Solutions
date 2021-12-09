class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
      String result = "";
      int longestLength = 0;
      for (int i = 0; i < strarr.length - k + 1; i++) {
        String str = "";
        for (int j = 0; j < k; j++) {
          str += strarr[i + j];
        }
        if (str.length() > longestLength) {
          longestLength = str.length();
          result = str;
        }
      }
      return result;
    }
}