public class DirReduction {
    public static String[] dirReduc(String[] arr) {
      Boolean done = false;
      while (!done) {
        int oldSize = arr.length;
        arr = reduce(arr);
        if (oldSize == arr.length) {
          done = true;
        }
      }
        return arr;
    }
  
    public static String[] reduce(String[] arr) {
      int size = arr.length;
      for (int i = 0; i < arr.length - 1; i++) {
          switch (arr[i]) {
              case  "NORTH": 
                if (arr[i + 1] == "SOUTH") {
                  arr[i] = "";
                  arr[i + 1] = "";
                  size -= 2;
                }
                break;
              case "SOUTH":
                if (arr[i + 1] == "NORTH") {
                  arr[i] = "";
                  arr[i + 1] = "";
                  size -= 2;
                }
                break;
              case "EAST":
                if (arr[i + 1] == "WEST") {
                  arr[i] = "";
                  arr[i + 1] = "";
                  size -= 2;
                }
                break;      
              case "WEST":
                if (arr[i + 1] == "EAST") {
                  arr[i] = "";
                  arr[i + 1] = "";
                  size -= 2;
                }
                break;
          }
      } 
    String[] directions = new String[size];
    int index = 0;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] != "") {
          directions[index] = arr[i];
          index++;
        }
      }
    return directions;
  }
}