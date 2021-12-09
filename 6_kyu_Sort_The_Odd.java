public class Kata {
    public static int[] sortArray(int[] array) {
      for (int i = 0; i < array.length - 1; i++) {
        int lowestOdd,
            oddIndex;
        while (array[i] % 2 == 0) {
          i++;
          if (i >= array.length) {
            return array;
          }
        }
        lowestOdd = array[i];
        oddIndex = i;
        for (int j = i; j < array.length; j++) {
          if ((array[j] % 2 != 0) && (array[j] < lowestOdd)) {
            lowestOdd = array[j];
            oddIndex = j;
          }
        }
        int temp = array[i];
        array[i] = lowestOdd;
        array[oddIndex] = temp;
      }
      return array;
    }
  }