public class Square {    
  public static boolean isSquare(int n) {   
    if (n == 0){
      return true;
    }
    double squareroot = Math.sqrt(n);
      if (n % squareroot == 0){
        return true;
      }  
    return false;
  }
}
