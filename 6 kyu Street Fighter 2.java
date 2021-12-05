public class Solution{
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
      String[] names = new String[moves.length];
      for (int i = 0; i < moves.length; i++) {
        if (moves[i] == "left") {
          if (position[1] == 0) { position[1] = 5; }
          else { position[1] -= 1; }
        }
        if (moves[i] == "right") {
          if (position[1] == 5) { position[1] = 0; }
          else { position[1] += 1; }
        }
        if (moves[i] == "up") {
          if (position[0] == 1) { position[0] = 0; } 
        }
        if (moves[i] == "down") {
          if (position[0] == 0) { position[0] = 1; }        
        }
        names[i] = fighters[position[0]] [position[1]];
      }
      return names;
    }
  }