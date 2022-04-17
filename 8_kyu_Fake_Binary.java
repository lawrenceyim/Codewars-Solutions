public class FakeBinary {
    public static String fakeBin(String numberString) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < numberString.length(); i++) {
        if (Integer.valueOf(numberString.charAt(i)) - 48 >= 5) sb.append(1);
        else sb.append(0);
      }
      return sb.toString();
    }
}