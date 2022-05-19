public class Kata {

  public static int dutyFree(int normPrice, int discount, int hol) {
    double savings = normPrice * discount / 100.0;
    double quantity = hol / savings;
    return (int) Math.floor(quantity);
  }

}