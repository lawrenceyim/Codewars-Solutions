class SumParts {

    public static int[] sumParts(int[] ls) {
      int[] newArray = new int[ls.length + 1];
      int arraySum = 0;
      if (ls.length == 1) {
        newArray[0] = 0;
        return newArray;
      }
      for (int i = 0; i < ls.length; i++) {
        arraySum += ls[i];
      }
      newArray[0] = arraySum;
      for (int i = 1; i < ls.length; i++) {
        arraySum -= ls[i - 1];
        newArray[i] = arraySum;
      }
      newArray[ls.length] = 0;
      return newArray;
    }
  }