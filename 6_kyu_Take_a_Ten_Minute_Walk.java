public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10) return false;
    int ver = 0;
    int hor = 0;
    for (int i = 0; i < walk.length; i++) {
      if (walk[i] == 'n') ver++;
      else if (walk[i] == 's') ver--;
      else if (walk[i] == 'e') hor++;
      else if (walk[i] == 'w') hor--;
    }
    return ver == 0 && hor == 0;
  }
}