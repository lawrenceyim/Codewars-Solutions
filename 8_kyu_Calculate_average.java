public class Kata{
  public static double find_average(int[] array){
    double avg = 0;
    for (int i = 0; i < array.length; i++) {
      avg += array[i];
    }
    avg /= (double) array.length;
    return avg;
  }
}