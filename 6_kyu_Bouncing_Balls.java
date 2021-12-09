public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
      if (!(h > 0) || !(bounce > 0 && bounce < 1) || !(window < h)) {
        return -1;
      }
      int count = 0;
      while (h > window) {
        count += 1;
        h *= bounce;
        if (h > window) {
          count += 1;
        }
      }
      return count;
    }
  }