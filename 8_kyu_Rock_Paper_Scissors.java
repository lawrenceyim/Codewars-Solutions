public class Kata {
  public static String rps(String p1, String p2) {
    if (p1.equals(p2)) return "Draw!";
    else if (p1.equals("paper")) {
      if (p2.equals("scissors")) return "Player 2 won!";
      else return "Player 1 won!";
    } else if (p1.equals("scissors")) {
      if (p2.equals("paper")) return "Player 1 won!";
      else return "Player 2 won!";
    } else {
      if (p2.equals("paper")) return "Player 2 won!";
      else return "Player 1 won!";
    }
  }

}
