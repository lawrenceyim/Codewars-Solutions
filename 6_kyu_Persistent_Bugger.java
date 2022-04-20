class Persist {
  public static int persistence(long n) {
    int times = 0;
    while (n > 9) {
      String num = String.valueOf(n);
      long number = 1;
      for (int i = 0; i < num.length(); i++) {
        number *= Integer.valueOf(num.charAt(i)) - 48; 
      }
      n = number;
      times++;
    }
    return times;
  }
}