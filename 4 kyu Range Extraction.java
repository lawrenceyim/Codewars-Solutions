class Solution {
    public static String rangeExtraction(int[] arr) {
      String str = "";
      for (int index = 0; index < arr.length; ) {
        int counter = 0;
        int temp = arr[index];
        String str1 = temp + ",";
        while (index != arr.length - 1 && 
               arr[index + 1] - arr[index] == 1) {
          index++;
          counter++;
        }
        if (counter > 0) {
          if (counter > 1) {
            str1 = temp + "-" + (temp + counter) + ",";
          }
          else {
            index--;
          }
        }
        str += str1;
        index++;
      }
      str = str.substring(0, str.length() - 1);
      return str;
    }
}