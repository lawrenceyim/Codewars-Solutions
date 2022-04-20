public class TwiceAsOld{

  public static int TwiceAsOld(int dadYears, int sonYears){
      int years = 0;
      if (sonYears * 2 > dadYears) {
        while (sonYears * 2 != dadYears) {
          sonYears--;
          dadYears--;
          years++;
        }
      } else {
        while (sonYears * 2 != dadYears) {
          sonYears++;
          dadYears++;
          years++;
        }
      }
      return years;
  }

}