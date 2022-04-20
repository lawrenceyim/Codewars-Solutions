public class Solution {

  public static boolean validatePin(String pin) {
    if (pin.length() != 4 && pin.length() != 6) return false;
    for (int i = 0; i < pin.length(); i++) {
      if (!Character.isDigit(pin.charAt(i))) return false;
    }
    return true;
  }

}