public class Kata {
    public static String createPhoneNumber(int[] numbers) {
      String str  = "(";
      for (int i = 0; i < 3; i++) {
        str += numbers[i];
      }
      str += ") ";
      for (int i = 3; i < 6; i++) {
        str += numbers[i];
      }
      str += "-";
      for (int i = 6; i < 10; i++) {
        str += numbers[i];
      }
      return str;
    }
  }