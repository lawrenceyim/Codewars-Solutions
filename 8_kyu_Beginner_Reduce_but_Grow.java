public class Kata{

  public static int grow(int[] x){
    int prod = x[0];
    for (int i = 1; i < x.length; i++) {
      prod *= x[i];
    }
    return prod;
  }

}