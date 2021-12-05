public class FindOdd {
    public static int findIt(int[] a) {
      int base = 0;
      int i = 0;
      while (i < a.length){
        base = a[i];
        int times = 0;
        for (int j = 0; j < a.length; j++){
          if (base == a[j]){
            times += 1;
          }
        }
        if (times % 2 != 0){
          break;
        }
        else {
          i++;
        }
      }
    return base;
    }
  }