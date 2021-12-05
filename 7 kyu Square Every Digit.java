public class SquareDigit {
    public int squareDigits(int n) {
      if (n == 0) {
        return n;
      }
      String result = ""; 
      while (n != 0) {
        int digit = n % 10 ;
        result = digit * digit + result ;
        n /= 10 ;
      }
      return Integer.parseInt(result) ;
    }
  }