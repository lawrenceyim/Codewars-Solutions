public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      int small = args[0];
      for (int i =  1; i < args.length; i++) {
        if (args[i] < small) small = args[i];
      }
      return small;
    }
}