public class Kata
{
    public static String expandedForm(int num)
    {
      String str = "";
      int counter = 10;
      int number = num % 10;
      if (number != 0) {
        str = String.valueOf(number);
      }
        num /= 10;
      while (num != 0) {
        number = num % 10;
        if (number != 0) {
          str = String.valueOf(number * counter) + " + " + str;
        }
        num /= 10;
        counter *= 10;
      }
      str.trim();
      if (str.length() > 3 && str.substring(str.length() - 3).equals(" + ")) {
        str = str.substring(0, str.length() - 3);
        str.trim();
      }
      return str;
    }
}