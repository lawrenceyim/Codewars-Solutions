public class Kata {
    public static int findEvenIndex(int[] arr) {
      int indexOfAnswer = 0;
      int leftSide = 0;
      int rightSide = 0;
      for (int index = 0; index < arr.length; index++){
        leftSide = 0;
        rightSide = 0;
        for(int j = 0; j < index; j++){
          leftSide += arr[j];
        }
        for(int k = index + 1; k < arr.length; k++){
          rightSide += arr[k];
        }
        if (leftSide == rightSide){
          return index;
        }
      }
      return -1;
    }
  }