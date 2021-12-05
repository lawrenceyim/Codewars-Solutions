public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    char next = array[0];
    for (int i = 0; i < array.length; i++) {
      if (next == array[i]) {
        next++;
      }
      else {
        break;
      }
    }
    return next;
  }
}