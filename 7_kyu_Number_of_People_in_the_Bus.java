import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int passengers = 0;
    for (int i = 0; i < stops.size(); i++) {
      passengers -= stops.get(i)[1];
      if (passengers < 0) passengers = 0;
      passengers += stops.get(i)[0];
    }
    return passengers;
  }
}